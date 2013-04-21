/**
 */
package glucose;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link glucose.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getObservationDate <em>Observation Date</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getPatientHeight <em>Patient Height</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getAdviceText <em>Advice Text</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getRationaleText <em>Rationale Text</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getOtherComment <em>Other Comment</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getUserAction <em>User Action</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getDecisionID <em>Decision ID</em>}</li>
 *   <li>{@link glucose.ClinicalDecision#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see glucose.GlucosePackage#getClinicalDecision()
 * @model
 * @generated
 */
public interface ClinicalDecision extends EObject {
	/**
	 * Returns the value of the '<em><b>Decision Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Time Stamp</em>' attribute.
	 * @see #setDecisionTimeStamp(Calendar)
	 * @see glucose.GlucosePackage#getClinicalDecision_DecisionTimeStamp()
	 * @model dataType="glucose.calendar"
	 * @generated
	 */
	Calendar getDecisionTimeStamp();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Time Stamp</em>' attribute.
	 * @see #getDecisionTimeStamp()
	 * @generated
	 */
	void setDecisionTimeStamp(Calendar value);

	/**
	 * Returns the value of the '<em><b>Observation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation Date</em>' attribute.
	 * @see #setObservationDate(Calendar)
	 * @see glucose.GlucosePackage#getClinicalDecision_ObservationDate()
	 * @model dataType="glucose.calendar"
	 * @generated
	 */
	Calendar getObservationDate();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getObservationDate <em>Observation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation Date</em>' attribute.
	 * @see #getObservationDate()
	 * @generated
	 */
	void setObservationDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Patient Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Weight</em>' attribute.
	 * @see #setPatientWeight(double)
	 * @see glucose.GlucosePackage#getClinicalDecision_PatientWeight()
	 * @model
	 * @generated
	 */
	double getPatientWeight();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Weight</em>' attribute.
	 * @see #getPatientWeight()
	 * @generated
	 */
	void setPatientWeight(double value);

	/**
	 * Returns the value of the '<em><b>Patient Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Height</em>' attribute.
	 * @see #setPatientHeight(double)
	 * @see glucose.GlucosePackage#getClinicalDecision_PatientHeight()
	 * @model
	 * @generated
	 */
	double getPatientHeight();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getPatientHeight <em>Patient Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Height</em>' attribute.
	 * @see #getPatientHeight()
	 * @generated
	 */
	void setPatientHeight(double value);

	/**
	 * Returns the value of the '<em><b>Patient Age Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Age Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Age Days</em>' attribute.
	 * @see #setPatientAgeDays(int)
	 * @see glucose.GlucosePackage#getClinicalDecision_PatientAgeDays()
	 * @model
	 * @generated
	 */
	int getPatientAgeDays();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Age Days</em>' attribute.
	 * @see #getPatientAgeDays()
	 * @generated
	 */
	void setPatientAgeDays(int value);

	/**
	 * Returns the value of the '<em><b>Advice Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Advice Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advice Text</em>' attribute.
	 * @see #setAdviceText(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_AdviceText()
	 * @model default=""
	 * @generated
	 */
	String getAdviceText();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getAdviceText <em>Advice Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Advice Text</em>' attribute.
	 * @see #getAdviceText()
	 * @generated
	 */
	void setAdviceText(String value);

	/**
	 * Returns the value of the '<em><b>Rules Fired Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules Fired Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules Fired Text</em>' attribute.
	 * @see #setRulesFiredText(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_RulesFiredText()
	 * @model default=""
	 * @generated
	 */
	String getRulesFiredText();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules Fired Text</em>' attribute.
	 * @see #getRulesFiredText()
	 * @generated
	 */
	void setRulesFiredText(String value);

	/**
	 * Returns the value of the '<em><b>Rationale Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rationale Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale Text</em>' attribute.
	 * @see #setRationaleText(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_RationaleText()
	 * @model default=""
	 * @generated
	 */
	String getRationaleText();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getRationaleText <em>Rationale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale Text</em>' attribute.
	 * @see #getRationaleText()
	 * @generated
	 */
	void setRationaleText(String value);

	/**
	 * Returns the value of the '<em><b>Decline Comment</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decline Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decline Comment</em>' attribute.
	 * @see #setDeclineComment(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_DeclineComment()
	 * @model default=""
	 * @generated
	 */
	String getDeclineComment();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decline Comment</em>' attribute.
	 * @see #getDeclineComment()
	 * @generated
	 */
	void setDeclineComment(String value);

	/**
	 * Returns the value of the '<em><b>Accept Comment</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accept Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accept Comment</em>' attribute.
	 * @see #setAcceptComment(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_AcceptComment()
	 * @model default=""
	 * @generated
	 */
	String getAcceptComment();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accept Comment</em>' attribute.
	 * @see #getAcceptComment()
	 * @generated
	 */
	void setAcceptComment(String value);

	/**
	 * Returns the value of the '<em><b>Other Comment</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Comment</em>' attribute.
	 * @see #setOtherComment(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_OtherComment()
	 * @model default=""
	 * @generated
	 */
	String getOtherComment();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getOtherComment <em>Other Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Comment</em>' attribute.
	 * @see #getOtherComment()
	 * @generated
	 */
	void setOtherComment(String value);

	/**
	 * Returns the value of the '<em><b>User Action</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link glucose.UserActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Action</em>' attribute.
	 * @see glucose.UserActionType
	 * @see #setUserAction(UserActionType)
	 * @see glucose.GlucosePackage#getClinicalDecision_UserAction()
	 * @model default=""
	 * @generated
	 */
	UserActionType getUserAction();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getUserAction <em>User Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Action</em>' attribute.
	 * @see glucose.UserActionType
	 * @see #getUserAction()
	 * @generated
	 */
	void setUserAction(UserActionType value);

	/**
	 * Returns the value of the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
	 * The default value is <code>"999999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minutes To Next Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes To Next Evaluation</em>' attribute.
	 * @see #setMinutesToNextEvaluation(int)
	 * @see glucose.GlucosePackage#getClinicalDecision_MinutesToNextEvaluation()
	 * @model default="999999"
	 * @generated
	 */
	int getMinutesToNextEvaluation();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes To Next Evaluation</em>' attribute.
	 * @see #getMinutesToNextEvaluation()
	 * @generated
	 */
	void setMinutesToNextEvaluation(int value);

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
	 * @see glucose.GlucosePackage#getClinicalDecision_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>Decision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision ID</em>' attribute.
	 * @see #setDecisionID(String)
	 * @see glucose.GlucosePackage#getClinicalDecision_DecisionID()
	 * @model id="true"
	 *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")'"
	 * @generated
	 */
	String getDecisionID();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getDecisionID <em>Decision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision ID</em>' attribute.
	 * @see #getDecisionID()
	 * @generated
	 */
	void setDecisionID(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link glucose.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see glucose.StatusType
	 * @see #setStatus(StatusType)
	 * @see glucose.GlucosePackage#getClinicalDecision_Status()
	 * @model default="0"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link glucose.ClinicalDecision#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see glucose.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (this.getAdviceText().length() == 0)\n\t{\n\t\tthis.setAdviceText(message);\n\t} else \n\t{\n\tthis.setAdviceText(this.getAdviceText() + \"\\n\" + message);\n\t}'"
	 * @generated
	 */
	void advise(String message);

} // ClinicalDecision
