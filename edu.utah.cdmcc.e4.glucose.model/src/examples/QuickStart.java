/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright> 
 *
 * $Id: QuickStart.java,v 1.7 2010/11/11 10:28:15 mtaal Exp $
 * 
 * Adapted by J. Michael Dean for gluose insulin model 2013/03/27
 */

package examples;

import glucose.AccessType;
import glucose.CarbohydrateStatusType;
import glucose.GlucoseDecision;
import glucose.GlucoseFactory;
import glucose.GlucosePackage;
import glucose.IntensiveCareUnit;
import glucose.Patient;
import glucose.StatusType;
import glucose.User;
import java.util.Calendar;
import java.util.Properties;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Environment;


/**
 * Quick Start Tutorial for the <a href="http://wiki.eclipse.org/Teneo">Teneo</a> project.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class QuickStart {


	/** The main method */
	public static void main(String[] args) {
		// the name of the database, this database should exist but does not
		// need to contain tables
		String dbName = "glucose";
		doQuickStart(dbName); // ignore return
	}

	/**
	 * The method performing the real action. This method is used by other tutorials therefore has it
	 * been made public and expects the database name and returns an instance of the HbDataStore.
	 */
	public static HbDataStore doQuickStart(String dbName) {

		// The hibernate properties can be set by having a hibernate.properties
		// file in the root of
		// the classpath.
		// Another approach is setting the properties in the HbDataStore.
		// For more information see section 3.1 of the Hibernate manual
		final Properties props = new Properties();
		 props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		 props.setProperty(Environment.USER, "root");
		 props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/" +
		 dbName);
		 props.setProperty(Environment.PASS, "root");
		 props.setProperty(Environment.DIALECT,
		 org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

//		props.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
//		props.setProperty(Environment.USER, "sa");
//		props.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
//		props.setProperty(Environment.PASS, "");
//		props.setProperty(Environment.DIALECT, org.hibernate.dialect.HSQLDialect.class.getName());

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		props
				.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT, "REFRESH,PERSIST,MERGE");

		// the name of the session factory
		String hbName = "Glucose";
		// create the HbDataStore using the name
		final HbDataStore hbds = HbHelper.INSTANCE.createRegisterDataStore(hbName);

		// set the properties
		hbds.setDataStoreProperties(props);

		// sets its epackages stored in this datastore
		hbds.setEPackages(new EPackage[] { GlucosePackage.eINSTANCE });

		// initialize, also creates the database tables
		try {
			hbds.initialize();
		} finally {
			// print the generated mapping
			System.err.println(hbds.getMappingXML());
		}

		SessionFactory sessionFactory = hbds.getSessionFactory();

		// Create a session and a transaction
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();

		// Start a transaction, create a library and make it persistent
		tx.begin();
		IntensiveCareUnit picu = GlucoseFactory.eINSTANCE.createIntensiveCareUnit();
		session.save(picu);

		// create a user
		User user = GlucoseFactory.eINSTANCE.createUser();
		user.setAccountName("mdean");
		user.setAccountRights(AccessType.NORMAL);
		user.setFirstName("Michael");
		user.setLastName("Dean");
		//picu.getUsers().add(user);
		//session.save(user);
		
		Patient patient = GlucoseFactory.eINSTANCE.createPatient();
		//patient.setBirthdate(new GregorianCalendar());
		patient.setBirthdate(Calendar.getInstance()); 

		patient.setCreatedBy(user);
		patient.setFirstName("Sally Jo");
		patient.setLastName("Zuspan");
		patient.setHeight(150.);
		patient.setWeight(57.6);
		patient.setMedRecNum("12-34-56");
		patient.setStatus(StatusType.CURRENT);
		patient.setStudyID("CHOM0003");
		//session.save(patient);
		
		
		GlucoseDecision decision = GlucoseFactory.eINSTANCE.createGlucoseDecision();
		decision.setCreatedBy(user);
		decision.setCarbohydrateStatus(CarbohydrateStatusType.UNCHANGED);
		
		// add the user and patient to the intensive care unit
		picu.getPatients().add(patient);
		picu.getUsers().add(user);

		// at commit the objects will be present in the database
		tx.commit();
		// and close of, this should actually be done in a finally block
		session.close();

		return hbds;
	}
}