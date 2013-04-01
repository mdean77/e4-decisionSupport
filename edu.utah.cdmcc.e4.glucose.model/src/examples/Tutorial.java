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
 * $Id: Tutorial.java,v 1.4 2010/11/11 10:28:15 mtaal Exp $
 */

package examples;

import glucose.GlucosePackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

/**
 * Quick Start Tutorial
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class Tutorial {

	/** The main method */
	public static void main(String[] args) {

		// To configure Hibernate, supply properties describing the JDBC driver,
		// URL, username/password and SQL dialect.
		// By default the properties are obtained from the file
		// "hibernate.properties" at the classpath root.
		//
		// Alternatively, you can set the properties programmatically:
		//
		// For more information see <a
		// href="http://www.hibernate.org/hib_docs/v3/reference/en/html/session-configuration.html#configuration-programmatic">
		// section 3.1 of the Hibernate manual</a>.
		//
		Properties hibernateProperties = new Properties();
		//
		// 1) From a ".properties" file or stream.
		// InputStream in = ...
		// hibernateProperties.load(in);
		//
		// 2) or populated manually:
		 hibernateProperties.setProperty(Environment.DRIVER,
		 "com.mysql.jdbc.Driver");
		 hibernateProperties.setProperty(Environment.USER, "root");
		 hibernateProperties.setProperty(Environment.URL,
		 "jdbc:mysql://127.0.0.1:3306/glucose");
		 hibernateProperties.setProperty(Environment.PASS, "root");
		 hibernateProperties.setProperty(Environment.DIALECT,
		 org.hibernate.dialect.MySQL5InnoDBDialect.class.getName());

//		hibernateProperties.setProperty(Environment.DRIVER, "org.hsqldb.jdbcDriver");
//		hibernateProperties.setProperty(Environment.USER, "sa");
//		hibernateProperties.setProperty(Environment.URL, "jdbc:hsqldb:mem:library");
//		hibernateProperties.setProperty(Environment.PASS, "");
//		hibernateProperties.setProperty(Environment.DIALECT,
//				org.hibernate.dialect.HSQLDialect.class.getName());

		// set a specific option
		// see this page
		// http://wiki.eclipse.org/Teneo/Hibernate/Configuration_Options
		// for all the available options
		hibernateProperties.setProperty(PersistenceOptions.CASCADE_POLICY_ON_NON_CONTAINMENT,
				"REFRESH,PERSIST,MERGE");

		// use the joined inheritance mapping

		//hibernateProperties.setProperty(PersistenceOptions.INHERITANCE_MAPPING, "JOINED");

		// use an annotations file as an example
		// this lets the library use a special table
//		hibernateProperties.setProperty(PersistenceOptions.PERSISTENCE_XML,
//				"edu/utah/cdmcc/e4/glucose/model/examples/annotations.xml");

		// Create the DataStore.
		final String dataStoreName = "GlucoseDataStore";
		final HbDataStore dataStore = HbHelper.INSTANCE.createRegisterDataStore(dataStoreName);
		dataStore.setDataStoreProperties(hibernateProperties);

		// Configure the EPackages used by this DataStore.
		dataStore.setEPackages(new EPackage[] { GlucosePackage.eINSTANCE });

		// Initialize the DataStore. This sets up the Hibernate mapping and, in
		// turn, creates the corresponding tables in the database.
		try {
			dataStore.initialize();
		} finally {
			// print the hibernate mapping
			System.err.println(dataStore.getMappingXML());
		}

		final SessionFactory sessionFactory = dataStore.getSessionFactory();
		{
			// Open a new Session and start transaction.
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Create a library.
			IntensiveCareUnit picu = GlucoseFactory.eINSTANCE.createIntensiveCareUnit();
			// Make it persistent.
			session.save(picu);

			// create a user
			User user = GlucoseFactory.eINSTANCE.createUser();
			user.setAccountName("mdean");
			user.setAccountRights(AccessType.NORMAL);
			user.setFirstName("Michael");
			user.setLastName("Dean");
			picu.getUsers().add(user);
			
			Patient patient = GlucoseFactory.eINSTANCE.createPatient();
			//patient.setBirthdate(new GregorianCalendar());
			patient.setBirthdate(new GregorianCalendar(1999, 12, 12)); 

			patient.setCreatedBy(user);
			patient.setFirstName("Sally Jo");
			patient.setLastName("Zuspan");
			patient.setHeight(150.);
			patient.setWeight(57.6);
			patient.setMedRecNum("12-34-56");
			patient.setStatus(StatusType.CURRENT);
			patient.setStudyID("CHOM0003");

			
			
			GlucoseDecision decision = GlucoseFactory.eINSTANCE.createGlucoseDecision();
			decision.setCreatedBy(user);
			decision.setCarbohydrateStatus(CarbohydrateStatusType.UNCHANGED);

			// Add the Writer and Book to the Library.
			picu.getPatients().add(patient);
			picu.getUsers().add(user);


			// Commit the changes to the database.
			session.getTransaction().commit();
			// Close the session. Not necessary if
			session.close();
		}

		{
			final Session session = sessionFactory.openSession();
			session.beginTransaction();

			// Retrieve the Library and its child objects.
			// Note that you must use the EClass name in the HQL query.
			Query query = session.createQuery("FROM IntensiveCareUnit");
			List<?> intensiveCareUnits = query.list();
			IntensiveCareUnit picu = (IntensiveCareUnit) intensiveCareUnits.get(0);

			// Obtain the Writer and Book
			User user = picu.getUsers().get(0);
			System.out.println(user.getName());
			Patient patient = picu.getPatients().get(0);
			System.out.println(patient.getName());

			// Verify that the eContainer and references are set correctly.
			assert (patient.eContainer() == picu);
			assert (patient.getCreatedBy() == user);

			User user2 = GlucoseFactory.eINSTANCE.createUser();
			user2.setAccountName("mdean");
			user2.setAccountRights(AccessType.NORMAL);
			user2.setFirstName("Michael");
			user2.setLastName("Dean");

			Patient patient2	 = GlucoseFactory.eINSTANCE.createPatient();
			patient2.setBirthdate(new GregorianCalendar(1999, 12, 12));  
			patient2.setCreatedBy(user);
			patient2.setFirstName("Sally Jo");
			patient2.setLastName("Zuspan");
			patient2.setHeight(150.);
			patient2.setWeight(57.6);
			patient2.setMedRecNum("12-34-56");
			patient2.setStatus(StatusType.CURRENT);
			patient2.setStudyID("CHOM0003");
		

			picu.getPatients().add(patient2);
			picu.getUsers().add(user2);
			picu.getPatients().add(patient2);
			picu.getUsers().add(user2);
			picu.getPatients().add(patient2);
			picu.getUsers().add(user2);

			// Commit.
			session.getTransaction().commit();
			session.close();
		}

//		{
//			final Session session = sessionFactory.openSession();
//			session.beginTransaction();
//
//			// Retrieve all Books and display their titles.
//			Query query = session.createQuery("FROM Book");
//			List<?> books = query.list();
//			for (Iterator<?> it = books.iterator(); it.hasNext();) {
//				Book book = (Book) it.next();
//				System.out.println(book.getTitle());
//			}
//
//			// Retrieve George Orwell's book.
//			query = session.createQuery("SELECT book FROM Book book, Writer writ WHERE "
//					+ " book.title='1984' AND book.author=writ AND writ.name='G. Orwell'");
//			books = query.list();
//
//			// Show some results
//			System.out.println("There are " + books.size() + " in the Library.");
//			System.out.println(books.get(0).getClass().getName());
//			Book book = (Book) books.get(0);
//			System.out.println(book.getTitle());
//			System.out.println(book.getAuthor().getName());
//
//			// Count the number of books in the library
//			query = session
//					.createQuery("SELECT count(allbooks) FROM Library lib LEFT JOIN lib.books AS allbooks "
//							+ " WHERE lib.name='My Library'");
//			int count = ((Number) query.uniqueResult()).intValue();
//			System.out.println("There are " + count + " books in the library");
//			session.getTransaction().commit();
//		}
//
//		try {
//			String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + dataStoreName;
//			final URI uri = URI.createURI(uriStr);
//			ResourceSet resourceSet = new ResourceSetImpl();
//			final Resource res = resourceSet.createResource(uri);
//
//			res.load(Collections.EMPTY_MAP);
//			Iterator<?> it = res.getContents().iterator();
//			Library libTest;
//			while (it.hasNext()) {
//				libTest = (Library) it.next();
//				System.out.println(libTest.getName());
//			}
//
//			Library libNew = GlucoseFactory.eINSTANCE.createLibrary();
//			libNew.setName("My Second Library");
//
//			// create a writer
//			Writer writerNew = GlucoseFactory.eINSTANCE.createWriter();
//			writerNew.setName("I. Asimov");
//			writerNew.setFirstName("Isaac");
//			writerNew.setLastName("Asimov");
//
//			// and one of his books
//			Book bookNew = GlucoseFactory.eINSTANCE.createBook();
//			bookNew.setAuthor(writerNew);
//			bookNew.setPages(305);
//			bookNew.setTitle("Foundation and Empire");
//			bookNew.setCategory(BookCategory.SCIENCE_FICTION);

			// add the writer/book to the library.
//			libNew.getWriters().add(writerNew);
//			libNew.getBooks().add(bookNew);
//
//			// now add the top-level object to the resource
//			res.getContents().add(libNew);
//
//			res.save(null);
//		} catch (IOException e) {
//			throw new Error("IOException", e);
//		}
	}
}
