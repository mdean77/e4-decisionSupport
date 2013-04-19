/**
 */
package glucose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see glucose.GlucoseFactory
 * @model kind="package"
 *        annotation="teneo.jpa appinfo='@GenericGenerator(name=\"system-uuid\", strategy = \"uuid\")'"
 * @generated
 */
public interface GlucosePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "glucose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu/utah/cdmcc/glucose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.utah.cdmcc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlucosePackage eINSTANCE = glucose.impl.GlucosePackageImpl.init();

	/**
	 * The meta object id for the '{@link glucose.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.PersonImpl
	 * @see glucose.impl.GlucosePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ID = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link glucose.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.PatientImpl
	 * @see glucose.impl.GlucosePackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PERSON_ID = PERSON__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__STATUS = PERSON__STATUS;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__WEIGHT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Med Rec Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__MED_REC_NUM = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Study ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__STUDY_ID = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BIRTHDATE = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__HEIGHT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DECISIONS = PERSON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CREATED_BY = PERSON_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link glucose.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.UserImpl
	 * @see glucose.impl.GlucosePackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = PERSON__LAST_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = PERSON__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERSON_ID = PERSON__PERSON_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATUS = PERSON__STATUS;

	/**
	 * The feature id for the '<em><b>Account Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACCOUNT_RIGHTS = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACCOUNT_NAME = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD_DIGEST = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_BY = PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link glucose.impl.ClinicalDecisionImpl <em>Clinical Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.ClinicalDecisionImpl
	 * @see glucose.impl.GlucosePackageImpl#getClinicalDecision()
	 * @generated
	 */
	int CLINICAL_DECISION = 3;

	/**
	 * The feature id for the '<em><b>Decision Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__DECISION_TIME_STAMP = 0;

	/**
	 * The feature id for the '<em><b>Observation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__OBSERVATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Patient Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__PATIENT_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Patient Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__PATIENT_HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Patient Age Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__PATIENT_AGE_DAYS = 4;

	/**
	 * The feature id for the '<em><b>Advice Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__ADVICE_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Rules Fired Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__RULES_FIRED_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__RATIONALE_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Decline Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__DECLINE_COMMENT = 8;

	/**
	 * The feature id for the '<em><b>Accept Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__ACCEPT_COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Other Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__OTHER_COMMENT = 10;

	/**
	 * The feature id for the '<em><b>User Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__USER_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION = 12;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__CREATED_BY = 13;

	/**
	 * The feature id for the '<em><b>Decision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__DECISION_ID = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION__STATUS = 15;

	/**
	 * The number of structural features of the '<em>Clinical Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_DECISION_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link glucose.impl.GlucoseDecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.GlucoseDecisionImpl
	 * @see glucose.impl.GlucosePackageImpl#getGlucoseDecision()
	 * @generated
	 */
	int GLUCOSE_DECISION = 4;

	/**
	 * The feature id for the '<em><b>Decision Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__DECISION_TIME_STAMP = CLINICAL_DECISION__DECISION_TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Observation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__OBSERVATION_DATE = CLINICAL_DECISION__OBSERVATION_DATE;

	/**
	 * The feature id for the '<em><b>Patient Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__PATIENT_WEIGHT = CLINICAL_DECISION__PATIENT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Patient Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__PATIENT_HEIGHT = CLINICAL_DECISION__PATIENT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Patient Age Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__PATIENT_AGE_DAYS = CLINICAL_DECISION__PATIENT_AGE_DAYS;

	/**
	 * The feature id for the '<em><b>Advice Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__ADVICE_TEXT = CLINICAL_DECISION__ADVICE_TEXT;

	/**
	 * The feature id for the '<em><b>Rules Fired Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__RULES_FIRED_TEXT = CLINICAL_DECISION__RULES_FIRED_TEXT;

	/**
	 * The feature id for the '<em><b>Rationale Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__RATIONALE_TEXT = CLINICAL_DECISION__RATIONALE_TEXT;

	/**
	 * The feature id for the '<em><b>Decline Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__DECLINE_COMMENT = CLINICAL_DECISION__DECLINE_COMMENT;

	/**
	 * The feature id for the '<em><b>Accept Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__ACCEPT_COMMENT = CLINICAL_DECISION__ACCEPT_COMMENT;

	/**
	 * The feature id for the '<em><b>Other Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__OTHER_COMMENT = CLINICAL_DECISION__OTHER_COMMENT;

	/**
	 * The feature id for the '<em><b>User Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__USER_ACTION = CLINICAL_DECISION__USER_ACTION;

	/**
	 * The feature id for the '<em><b>Minutes To Next Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__MINUTES_TO_NEXT_EVALUATION = CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__CREATED_BY = CLINICAL_DECISION__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Decision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__DECISION_ID = CLINICAL_DECISION__DECISION_ID;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__STATUS = CLINICAL_DECISION__STATUS;

	/**
	 * The feature id for the '<em><b>Previous Glucose Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION = CLINICAL_DECISION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous Observation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME = CLINICAL_DECISION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Serum Glucose Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION = CLINICAL_DECISION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Insulin Drip Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE = CLINICAL_DECISION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Carbohydrate Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__CARBOHYDRATE_STATUS = CLINICAL_DECISION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recommended Insulin Drip Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE = CLINICAL_DECISION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Recommended Insulin Bolus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS = CLINICAL_DECISION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Recommended Glucose Bolus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS = CLINICAL_DECISION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Insulin Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION__INSULIN_MODE = CLINICAL_DECISION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_DECISION_FEATURE_COUNT = CLINICAL_DECISION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link glucose.impl.IntensiveCareUnitImpl <em>Intensive Care Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.impl.IntensiveCareUnitImpl
	 * @see glucose.impl.GlucosePackageImpl#getIntensiveCareUnit()
	 * @generated
	 */
	int INTENSIVE_CARE_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Patients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSIVE_CARE_UNIT__PATIENTS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSIVE_CARE_UNIT__USERS = 1;

	/**
	 * The number of structural features of the '<em>Intensive Care Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENSIVE_CARE_UNIT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link glucose.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.AccessType
	 * @see glucose.impl.GlucosePackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 6;

	/**
	 * The meta object id for the '{@link glucose.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.StatusType
	 * @see glucose.impl.GlucosePackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 7;

	/**
	 * The meta object id for the '{@link glucose.UserActionType <em>User Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.UserActionType
	 * @see glucose.impl.GlucosePackageImpl#getUserActionType()
	 * @generated
	 */
	int USER_ACTION_TYPE = 8;

	/**
	 * The meta object id for the '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glucose.CarbohydrateStatusType
	 * @see glucose.impl.GlucosePackageImpl#getCarbohydrateStatusType()
	 * @generated
	 */
	int CARBOHYDRATE_STATUS_TYPE = 9;

	/**
	 * The meta object id for the '<em>calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see glucose.impl.GlucosePackageImpl#getcalendar()
	 * @generated
	 */
	int CALENDAR = 10;

	/**
	 * Returns the meta object for class '{@link glucose.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see glucose.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see glucose.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see glucose.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Person#getPersonID <em>Person ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person ID</em>'.
	 * @see glucose.Person#getPersonID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonID();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Person#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see glucose.Person#getStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Status();

	/**
	 * Returns the meta object for class '{@link glucose.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see glucose.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Patient#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see glucose.Patient#getWeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Weight();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Patient#getMedRecNum <em>Med Rec Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Med Rec Num</em>'.
	 * @see glucose.Patient#getMedRecNum()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_MedRecNum();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Patient#getStudyID <em>Study ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study ID</em>'.
	 * @see glucose.Patient#getStudyID()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_StudyID();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Patient#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see glucose.Patient#getBirthdate()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link glucose.Patient#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see glucose.Patient#getHeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link glucose.Patient#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see glucose.Patient#getDecisions()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Decisions();

	/**
	 * Returns the meta object for the reference '{@link glucose.Patient#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see glucose.Patient#getCreatedBy()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_CreatedBy();

	/**
	 * Returns the meta object for class '{@link glucose.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see glucose.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link glucose.User#getAccountRights <em>Account Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Rights</em>'.
	 * @see glucose.User#getAccountRights()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AccountRights();

	/**
	 * Returns the meta object for the attribute '{@link glucose.User#getAccountName <em>Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Name</em>'.
	 * @see glucose.User#getAccountName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AccountName();

	/**
	 * Returns the meta object for the attribute '{@link glucose.User#getPasswordDigest <em>Password Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Digest</em>'.
	 * @see glucose.User#getPasswordDigest()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PasswordDigest();

	/**
	 * Returns the meta object for the reference '{@link glucose.User#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see glucose.User#getCreatedBy()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_CreatedBy();

	/**
	 * Returns the meta object for class '{@link glucose.ClinicalDecision <em>Clinical Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinical Decision</em>'.
	 * @see glucose.ClinicalDecision
	 * @generated
	 */
	EClass getClinicalDecision();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getDecisionTimeStamp <em>Decision Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Time Stamp</em>'.
	 * @see glucose.ClinicalDecision#getDecisionTimeStamp()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_DecisionTimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getObservationDate <em>Observation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation Date</em>'.
	 * @see glucose.ClinicalDecision#getObservationDate()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_ObservationDate();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getPatientWeight <em>Patient Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Weight</em>'.
	 * @see glucose.ClinicalDecision#getPatientWeight()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_PatientWeight();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getPatientHeight <em>Patient Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Height</em>'.
	 * @see glucose.ClinicalDecision#getPatientHeight()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_PatientHeight();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getPatientAgeDays <em>Patient Age Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Age Days</em>'.
	 * @see glucose.ClinicalDecision#getPatientAgeDays()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_PatientAgeDays();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getAdviceText <em>Advice Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advice Text</em>'.
	 * @see glucose.ClinicalDecision#getAdviceText()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_AdviceText();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getRulesFiredText <em>Rules Fired Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules Fired Text</em>'.
	 * @see glucose.ClinicalDecision#getRulesFiredText()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_RulesFiredText();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getRationaleText <em>Rationale Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale Text</em>'.
	 * @see glucose.ClinicalDecision#getRationaleText()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_RationaleText();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getDeclineComment <em>Decline Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decline Comment</em>'.
	 * @see glucose.ClinicalDecision#getDeclineComment()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_DeclineComment();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getAcceptComment <em>Accept Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Comment</em>'.
	 * @see glucose.ClinicalDecision#getAcceptComment()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_AcceptComment();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getOtherComment <em>Other Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Comment</em>'.
	 * @see glucose.ClinicalDecision#getOtherComment()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_OtherComment();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getUserAction <em>User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Action</em>'.
	 * @see glucose.ClinicalDecision#getUserAction()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_UserAction();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getMinutesToNextEvaluation <em>Minutes To Next Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes To Next Evaluation</em>'.
	 * @see glucose.ClinicalDecision#getMinutesToNextEvaluation()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_MinutesToNextEvaluation();

	/**
	 * Returns the meta object for the reference '{@link glucose.ClinicalDecision#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see glucose.ClinicalDecision#getCreatedBy()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EReference getClinicalDecision_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getDecisionID <em>Decision ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision ID</em>'.
	 * @see glucose.ClinicalDecision#getDecisionID()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_DecisionID();

	/**
	 * Returns the meta object for the attribute '{@link glucose.ClinicalDecision#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see glucose.ClinicalDecision#getStatus()
	 * @see #getClinicalDecision()
	 * @generated
	 */
	EAttribute getClinicalDecision_Status();

	/**
	 * Returns the meta object for class '{@link glucose.GlucoseDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see glucose.GlucoseDecision
	 * @generated
	 */
	EClass getGlucoseDecision();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getPreviousGlucoseConcentration <em>Previous Glucose Concentration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Glucose Concentration</em>'.
	 * @see glucose.GlucoseDecision#getPreviousGlucoseConcentration()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_PreviousGlucoseConcentration();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getPreviousObservationTime <em>Previous Observation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous Observation Time</em>'.
	 * @see glucose.GlucoseDecision#getPreviousObservationTime()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_PreviousObservationTime();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getSerumGlucoseConcentration <em>Serum Glucose Concentration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serum Glucose Concentration</em>'.
	 * @see glucose.GlucoseDecision#getSerumGlucoseConcentration()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_SerumGlucoseConcentration();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getCurrentInsulinDripRate <em>Current Insulin Drip Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Insulin Drip Rate</em>'.
	 * @see glucose.GlucoseDecision#getCurrentInsulinDripRate()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_CurrentInsulinDripRate();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getCarbohydrateStatus <em>Carbohydrate Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carbohydrate Status</em>'.
	 * @see glucose.GlucoseDecision#getCarbohydrateStatus()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_CarbohydrateStatus();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedInsulinDripRate <em>Recommended Insulin Drip Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Insulin Drip Rate</em>'.
	 * @see glucose.GlucoseDecision#getRecommendedInsulinDripRate()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_RecommendedInsulinDripRate();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedInsulinBolus <em>Recommended Insulin Bolus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Insulin Bolus</em>'.
	 * @see glucose.GlucoseDecision#getRecommendedInsulinBolus()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_RecommendedInsulinBolus();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getRecommendedGlucoseBolus <em>Recommended Glucose Bolus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Glucose Bolus</em>'.
	 * @see glucose.GlucoseDecision#getRecommendedGlucoseBolus()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_RecommendedGlucoseBolus();

	/**
	 * Returns the meta object for the attribute '{@link glucose.GlucoseDecision#getInsulinMode <em>Insulin Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulin Mode</em>'.
	 * @see glucose.GlucoseDecision#getInsulinMode()
	 * @see #getGlucoseDecision()
	 * @generated
	 */
	EAttribute getGlucoseDecision_InsulinMode();

	/**
	 * Returns the meta object for class '{@link glucose.IntensiveCareUnit <em>Intensive Care Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intensive Care Unit</em>'.
	 * @see glucose.IntensiveCareUnit
	 * @generated
	 */
	EClass getIntensiveCareUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link glucose.IntensiveCareUnit#getPatients <em>Patients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patients</em>'.
	 * @see glucose.IntensiveCareUnit#getPatients()
	 * @see #getIntensiveCareUnit()
	 * @generated
	 */
	EReference getIntensiveCareUnit_Patients();

	/**
	 * Returns the meta object for the containment reference list '{@link glucose.IntensiveCareUnit#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see glucose.IntensiveCareUnit#getUsers()
	 * @see #getIntensiveCareUnit()
	 * @generated
	 */
	EReference getIntensiveCareUnit_Users();

	/**
	 * Returns the meta object for enum '{@link glucose.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see glucose.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link glucose.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see glucose.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link glucose.UserActionType <em>User Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Action Type</em>'.
	 * @see glucose.UserActionType
	 * @generated
	 */
	EEnum getUserActionType();

	/**
	 * Returns the meta object for enum '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Carbohydrate Status Type</em>'.
	 * @see glucose.CarbohydrateStatusType
	 * @generated
	 */
	EEnum getCarbohydrateStatusType();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getcalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlucoseFactory getGlucoseFactory();

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
		 * The meta object literal for the '{@link glucose.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.PersonImpl
		 * @see glucose.impl.GlucosePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Person ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ID = eINSTANCE.getPerson_PersonID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__STATUS = eINSTANCE.getPerson_Status();

		/**
		 * The meta object literal for the '{@link glucose.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.PatientImpl
		 * @see glucose.impl.GlucosePackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__WEIGHT = eINSTANCE.getPatient_Weight();

		/**
		 * The meta object literal for the '<em><b>Med Rec Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__MED_REC_NUM = eINSTANCE.getPatient_MedRecNum();

		/**
		 * The meta object literal for the '<em><b>Study ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__STUDY_ID = eINSTANCE.getPatient_StudyID();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__BIRTHDATE = eINSTANCE.getPatient_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__HEIGHT = eINSTANCE.getPatient_Height();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DECISIONS = eINSTANCE.getPatient_Decisions();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__CREATED_BY = eINSTANCE.getPatient_CreatedBy();

		/**
		 * The meta object literal for the '{@link glucose.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.UserImpl
		 * @see glucose.impl.GlucosePackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Account Rights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ACCOUNT_RIGHTS = eINSTANCE.getUser_AccountRights();

		/**
		 * The meta object literal for the '<em><b>Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ACCOUNT_NAME = eINSTANCE.getUser_AccountName();

		/**
		 * The meta object literal for the '<em><b>Password Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD_DIGEST = eINSTANCE.getUser_PasswordDigest();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CREATED_BY = eINSTANCE.getUser_CreatedBy();

		/**
		 * The meta object literal for the '{@link glucose.impl.ClinicalDecisionImpl <em>Clinical Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.ClinicalDecisionImpl
		 * @see glucose.impl.GlucosePackageImpl#getClinicalDecision()
		 * @generated
		 */
		EClass CLINICAL_DECISION = eINSTANCE.getClinicalDecision();

		/**
		 * The meta object literal for the '<em><b>Decision Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__DECISION_TIME_STAMP = eINSTANCE.getClinicalDecision_DecisionTimeStamp();

		/**
		 * The meta object literal for the '<em><b>Observation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__OBSERVATION_DATE = eINSTANCE.getClinicalDecision_ObservationDate();

		/**
		 * The meta object literal for the '<em><b>Patient Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__PATIENT_WEIGHT = eINSTANCE.getClinicalDecision_PatientWeight();

		/**
		 * The meta object literal for the '<em><b>Patient Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__PATIENT_HEIGHT = eINSTANCE.getClinicalDecision_PatientHeight();

		/**
		 * The meta object literal for the '<em><b>Patient Age Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__PATIENT_AGE_DAYS = eINSTANCE.getClinicalDecision_PatientAgeDays();

		/**
		 * The meta object literal for the '<em><b>Advice Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__ADVICE_TEXT = eINSTANCE.getClinicalDecision_AdviceText();

		/**
		 * The meta object literal for the '<em><b>Rules Fired Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__RULES_FIRED_TEXT = eINSTANCE.getClinicalDecision_RulesFiredText();

		/**
		 * The meta object literal for the '<em><b>Rationale Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__RATIONALE_TEXT = eINSTANCE.getClinicalDecision_RationaleText();

		/**
		 * The meta object literal for the '<em><b>Decline Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__DECLINE_COMMENT = eINSTANCE.getClinicalDecision_DeclineComment();

		/**
		 * The meta object literal for the '<em><b>Accept Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__ACCEPT_COMMENT = eINSTANCE.getClinicalDecision_AcceptComment();

		/**
		 * The meta object literal for the '<em><b>Other Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__OTHER_COMMENT = eINSTANCE.getClinicalDecision_OtherComment();

		/**
		 * The meta object literal for the '<em><b>User Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__USER_ACTION = eINSTANCE.getClinicalDecision_UserAction();

		/**
		 * The meta object literal for the '<em><b>Minutes To Next Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION = eINSTANCE.getClinicalDecision_MinutesToNextEvaluation();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_DECISION__CREATED_BY = eINSTANCE.getClinicalDecision_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Decision ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__DECISION_ID = eINSTANCE.getClinicalDecision_DecisionID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_DECISION__STATUS = eINSTANCE.getClinicalDecision_Status();

		/**
		 * The meta object literal for the '{@link glucose.impl.GlucoseDecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.GlucoseDecisionImpl
		 * @see glucose.impl.GlucosePackageImpl#getGlucoseDecision()
		 * @generated
		 */
		EClass GLUCOSE_DECISION = eINSTANCE.getGlucoseDecision();

		/**
		 * The meta object literal for the '<em><b>Previous Glucose Concentration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION = eINSTANCE.getGlucoseDecision_PreviousGlucoseConcentration();

		/**
		 * The meta object literal for the '<em><b>Previous Observation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME = eINSTANCE.getGlucoseDecision_PreviousObservationTime();

		/**
		 * The meta object literal for the '<em><b>Serum Glucose Concentration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION = eINSTANCE.getGlucoseDecision_SerumGlucoseConcentration();

		/**
		 * The meta object literal for the '<em><b>Current Insulin Drip Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE = eINSTANCE.getGlucoseDecision_CurrentInsulinDripRate();

		/**
		 * The meta object literal for the '<em><b>Carbohydrate Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__CARBOHYDRATE_STATUS = eINSTANCE.getGlucoseDecision_CarbohydrateStatus();

		/**
		 * The meta object literal for the '<em><b>Recommended Insulin Drip Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE = eINSTANCE.getGlucoseDecision_RecommendedInsulinDripRate();

		/**
		 * The meta object literal for the '<em><b>Recommended Insulin Bolus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS = eINSTANCE.getGlucoseDecision_RecommendedInsulinBolus();

		/**
		 * The meta object literal for the '<em><b>Recommended Glucose Bolus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS = eINSTANCE.getGlucoseDecision_RecommendedGlucoseBolus();

		/**
		 * The meta object literal for the '<em><b>Insulin Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLUCOSE_DECISION__INSULIN_MODE = eINSTANCE.getGlucoseDecision_InsulinMode();

		/**
		 * The meta object literal for the '{@link glucose.impl.IntensiveCareUnitImpl <em>Intensive Care Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.impl.IntensiveCareUnitImpl
		 * @see glucose.impl.GlucosePackageImpl#getIntensiveCareUnit()
		 * @generated
		 */
		EClass INTENSIVE_CARE_UNIT = eINSTANCE.getIntensiveCareUnit();

		/**
		 * The meta object literal for the '<em><b>Patients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENSIVE_CARE_UNIT__PATIENTS = eINSTANCE.getIntensiveCareUnit_Patients();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENSIVE_CARE_UNIT__USERS = eINSTANCE.getIntensiveCareUnit_Users();

		/**
		 * The meta object literal for the '{@link glucose.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.AccessType
		 * @see glucose.impl.GlucosePackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link glucose.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.StatusType
		 * @see glucose.impl.GlucosePackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '{@link glucose.UserActionType <em>User Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.UserActionType
		 * @see glucose.impl.GlucosePackageImpl#getUserActionType()
		 * @generated
		 */
		EEnum USER_ACTION_TYPE = eINSTANCE.getUserActionType();

		/**
		 * The meta object literal for the '{@link glucose.CarbohydrateStatusType <em>Carbohydrate Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glucose.CarbohydrateStatusType
		 * @see glucose.impl.GlucosePackageImpl#getCarbohydrateStatusType()
		 * @generated
		 */
		EEnum CARBOHYDRATE_STATUS_TYPE = eINSTANCE.getCarbohydrateStatusType();

		/**
		 * The meta object literal for the '<em>calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see glucose.impl.GlucosePackageImpl#getcalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getcalendar();

	}

} //GlucosePackage
