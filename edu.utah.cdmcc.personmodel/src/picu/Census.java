/**
 */
package picu;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import person.Patient;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Census</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link picu.Census#getPatients <em>Patients</em>}</li>
 *   <li>{@link picu.Census#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @see picu.PicuPackage#getCensus()
 * @model
 * @generated
 */
public interface Census extends EObject {

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' containment reference list.
	 * The list contents are of type {@link person.Patient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' containment reference list.
	 * @see picu.PicuPackage#getCensus_Patients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getPatients();

	/**
	 * Returns the value of the '<em><b>Dummy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy</em>' attribute.
	 * @see #setDummy(String)
	 * @see picu.PicuPackage#getCensus_Dummy()
	 * @model
	 * @generated
	 */
	String getDummy();

	/**
	 * Sets the value of the '{@link picu.Census#getDummy <em>Dummy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy</em>' attribute.
	 * @see #getDummy()
	 * @generated
	 */
	void setDummy(String value);
} // Census
