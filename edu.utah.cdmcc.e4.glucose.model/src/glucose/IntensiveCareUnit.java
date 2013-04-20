/**
 */
package glucose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intensive Care Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link glucose.IntensiveCareUnit#getPatients <em>Patients</em>}</li>
 *   <li>{@link glucose.IntensiveCareUnit#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see glucose.GlucosePackage#getIntensiveCareUnit()
 * @model
 * @generated
 */
public interface IntensiveCareUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Patients</b></em>' containment reference list.
	 * The list contents are of type {@link glucose.Patient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' containment reference list.
	 * @see glucose.GlucosePackage#getIntensiveCareUnit_Patients()
	 * @model containment="true" keys="lastName firstName medRecNum studyID"
	 * @generated
	 */
	EList<Patient> getPatients();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link glucose.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see glucose.GlucosePackage#getIntensiveCareUnit_Users()
	 * @model containment="true" keys="lastName firstName"
	 * @generated
	 */
	EList<User> getUsers();

} // IntensiveCareUnit
