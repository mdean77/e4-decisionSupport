/**
 */
package person;

import java.util.Date;
import picu.Census;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Patient object represents a patient in the intensive care unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.Patient#getWeight <em>Weight</em>}</li>
 *   <li>{@link person.Patient#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link person.Patient#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link person.Patient#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link person.Patient#getHeight <em>Height</em>}</li>
 *   <li>{@link person.Patient#getStatus <em>Status</em>}</li>
 *   <li>{@link person.Patient#getUser <em>User</em>}</li>
 *   <li>{@link person.Patient#getPatients <em>Patients</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.PersonPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends Person {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weight is measured in kilograms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see person.PersonPackage#getPatient_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link person.Patient#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Med Rec Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Med Rec Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medical record number should be the hospital medical record number, not the visit account record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Med Rec Num</em>' attribute.
	 * @see #setMedRecNum(String)
	 * @see person.PersonPackage#getPatient_MedRecNum()
	 * @model
	 * @generated
	 */
	String getMedRecNum();

	/**
	 * Sets the value of the '{@link person.Patient#getMedRecNum <em>Med Rec Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med Rec Num</em>' attribute.
	 * @see #getMedRecNum()
	 * @generated
	 */
	void setMedRecNum(String value);

	/**
	 * Returns the value of the '<em><b>Study ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the ID used in the specific study in which the patient is enrolled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study ID</em>' attribute.
	 * @see #setStudyID(String)
	 * @see person.PersonPackage#getPatient_StudyID()
	 * @model
	 * @generated
	 */
	String getStudyID();

	/**
	 * Sets the value of the '{@link person.Patient#getStudyID <em>Study ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study ID</em>' attribute.
	 * @see #getStudyID()
	 * @generated
	 */
	void setStudyID(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of birth of patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Date)
	 * @see person.PersonPackage#getPatient_Birthdate()
	 * @model
	 * @generated
	 */
	Date getBirthdate();

	/**
	 * Sets the value of the '{@link person.Patient#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Date value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the patient, measured in centimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see person.PersonPackage#getPatient_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link person.Patient#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link person.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see person.StatusType
	 * @see #setStatus(StatusType)
	 * @see person.PersonPackage#getPatient_Status()
	 * @model
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link person.Patient#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see person.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see person.PersonPackage#getPatient_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link person.Patient#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Patients</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patients</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patients</em>' reference.
	 * @see #setPatients(Census)
	 * @see person.PersonPackage#getPatient_Patients()
	 * @model
	 * @generated
	 */
	Census getPatients();

	/**
	 * Sets the value of the '{@link person.Patient#getPatients <em>Patients</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patients</em>' reference.
	 * @see #getPatients()
	 * @generated
	 */
	void setPatients(Census value);

} // Patient
