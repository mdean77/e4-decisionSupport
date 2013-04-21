/**
 */
package glucose;

import java.util.Calendar;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link glucose.Patient#getWeight <em>Weight</em>}</li>
 *   <li>{@link glucose.Patient#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link glucose.Patient#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link glucose.Patient#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link glucose.Patient#getHeight <em>Height</em>}</li>
 *   <li>{@link glucose.Patient#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link glucose.Patient#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 * </p>
 *
 * @see glucose.GlucosePackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends Person {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weight is measured in kilograms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Double)
	 * @see glucose.GlucosePackage#getPatient_Weight()
	 * @model
	 * @generated
	 */
	Double getWeight();

	/**
	 * Sets the value of the '{@link glucose.Patient#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Double value);

	/**
	 * Returns the value of the '<em><b>Med Rec Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medical record number should be the hospital medical record number, not the visit account record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Med Rec Num</em>' attribute.
	 * @see #setMedRecNum(String)
	 * @see glucose.GlucosePackage#getPatient_MedRecNum()
	 * @model
	 * @generated
	 */
	String getMedRecNum();

	/**
	 * Sets the value of the '{@link glucose.Patient#getMedRecNum <em>Med Rec Num</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the ID used in the specific study in which the patient is enrolled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study ID</em>' attribute.
	 * @see #setStudyID(String)
	 * @see glucose.GlucosePackage#getPatient_StudyID()
	 * @model
	 * @generated
	 */
	String getStudyID();

	/**
	 * Sets the value of the '{@link glucose.Patient#getStudyID <em>Study ID</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date of birth of patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(Calendar)
	 * @see glucose.GlucosePackage#getPatient_Birthdate()
	 * @model dataType="glucose.calendar"
	 * @generated
	 */
	Calendar getBirthdate();

	/**
	 * Sets the value of the '{@link glucose.Patient#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of the patient, measured in centimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Double)
	 * @see glucose.GlucosePackage#getPatient_Height()
	 * @model
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link glucose.Patient#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Decisions</b></em>' containment reference list.
	 * The list contents are of type {@link glucose.GlucoseDecision}.
	 * It is bidirectional and its opposite is '{@link glucose.GlucoseDecision#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisions</em>' containment reference list.
	 * @see glucose.GlucosePackage#getPatient_Decisions()
	 * @see glucose.GlucoseDecision#getPatient
	 * @model opposite="patient" containment="true" keys="observationDate userAction"
	 * @generated
	 */
	EList<GlucoseDecision> getDecisions();

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see glucose.GlucosePackage#getPatient_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link glucose.Patient#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.text.DateFormat%> df = DateFormat.getDateInstance(DateFormat.LONG);\nreturn df.format(birthdate.getTime());'"
	 * @generated
	 */
	String getBirthdateString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getDeltaAgeYears(new <%java.util.GregorianCalendar%>());'"
	 * @generated
	 */
	int getTodayAgeYears();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getDeltaAgeDays(new <%java.util.GregorianCalendar%>());'"
	 * @generated
	 */
	int getTodayAgeDays();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateDataType="glucose.calendar"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long millisBetween = Math.abs(getBirthdate().getTimeInMillis()\n\t\t\t\t- date.getTimeInMillis());\nreturn (int) ((millisBetween / (1000 * 60 * 60 * 24)) / 365);'"
	 * @generated
	 */
	int getDeltaAgeYears(Calendar date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateDataType="glucose.calendar"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='long millisBetween = Math.abs(getBirthdate().getTimeInMillis()\n\t- date.getTimeInMillis());\nreturn (int) (millisBetween / (1000 * 60 * 60 * 24));'"
	 * @generated
	 */
	int getDeltaAgeDays(Calendar date);

} // Patient
