/**
 */
package picu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see picu.PicuFactory
 * @model kind="package"
 * @generated
 */
public interface PicuPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "picu";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://utah/cdmcc./edu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "picu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicuPackage eINSTANCE = picu.impl.PicuPackageImpl.init();

	/**
	 * The meta object id for the '{@link picu.impl.CensusImpl <em>Census</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see picu.impl.CensusImpl
	 * @see picu.impl.PicuPackageImpl#getCensus()
	 * @generated
	 */
	int CENSUS = 0;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSUS__PATIENTS = 0;

	/**
	 * The feature id for the '<em><b>Dummy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSUS__DUMMY = 1;

	/**
	 * The number of structural features of the '<em>Census</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSUS_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link picu.Census <em>Census</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Census</em>'.
	 * @see picu.Census
	 * @generated
	 */
	EClass getCensus();

	/**
	 * Returns the meta object for the containment reference list '{@link picu.Census#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patients</em>'.
	 * @see picu.Census#getPatients()
	 * @see #getCensus()
	 * @generated
	 */
	EReference getCensus_Patients();

	/**
	 * Returns the meta object for the attribute '{@link picu.Census#getDummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dummy</em>'.
	 * @see picu.Census#getDummy()
	 * @see #getCensus()
	 * @generated
	 */
	EAttribute getCensus_Dummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PicuFactory getPicuFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link picu.impl.CensusImpl <em>Census</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see picu.impl.CensusImpl
		 * @see picu.impl.PicuPackageImpl#getCensus()
		 * @generated
		 */
		EClass CENSUS = eINSTANCE.getCensus();
		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENSUS__PATIENTS = eINSTANCE.getCensus_Patients();
		/**
		 * The meta object literal for the '<em><b>Dummy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CENSUS__DUMMY = eINSTANCE.getCensus_Dummy();

	}

} //PicuPackage
