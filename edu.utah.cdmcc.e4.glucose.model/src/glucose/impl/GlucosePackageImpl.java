/**
 */
package glucose.impl;

import glucose.AccessType;
import glucose.CarbohydrateStatusType;
import glucose.ClinicalDecision;
import glucose.GlucoseDecision;
import glucose.GlucoseFactory;
import glucose.GlucosePackage;
import glucose.IntensiveCareUnit;
import glucose.Patient;
import glucose.Person;
import glucose.StatusType;
import glucose.User;
import glucose.UserActionType;

import java.util.Calendar;
import java.text.DateFormat;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlucosePackageImpl extends EPackageImpl implements GlucosePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glucoseDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intensiveCareUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carbohydrateStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see glucose.GlucosePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlucosePackageImpl() {
		super(eNS_URI, GlucoseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GlucosePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlucosePackage init() {
		if (isInited) return (GlucosePackage)EPackage.Registry.INSTANCE.getEPackage(GlucosePackage.eNS_URI);

		// Obtain or create and register package
		GlucosePackageImpl theGlucosePackage = (GlucosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GlucosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GlucosePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGlucosePackage.createPackageContents();

		// Initialize created meta-data
		theGlucosePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlucosePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlucosePackage.eNS_URI, theGlucosePackage);
		return theGlucosePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonID() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Weight() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_MedRecNum() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_StudyID() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Birthdate() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Height() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Status() {
		return (EAttribute)patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Decisions() {
		return (EReference)patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_CreatedBy() {
		return (EReference)patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_AccountRights() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_AccountName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_PasswordDigest() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_CreatedBy() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalDecision() {
		return clinicalDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_DecisionTimeStamp() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_ObservationDate() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_PatientWeight() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_PatientHeight() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_PatientAgeDays() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_AdviceText() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_RulesFiredText() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_RationaleText() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_DeclineComment() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_AcceptComment() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_OtherComment() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_UserAction() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_MinutesToNextEvaluation() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalDecision_CreatedBy() {
		return (EReference)clinicalDecisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalDecision_DecisionID() {
		return (EAttribute)clinicalDecisionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlucoseDecision() {
		return glucoseDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_PreviousGlucoseConcentration() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_PreviousObservationTime() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_SerumGlucoseConcentration() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_CurrentInsulinDripRate() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_CarbohydrateStatus() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_RecommendedInsulinDripRate() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_RecommendedInsulinBolus() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_RecommendedGlucoseBolus() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlucoseDecision_InsulinMode() {
		return (EAttribute)glucoseDecisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntensiveCareUnit() {
		return intensiveCareUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntensiveCareUnit_Patients() {
		return (EReference)intensiveCareUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntensiveCareUnit_Users() {
		return (EReference)intensiveCareUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserActionType() {
		return userActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarbohydrateStatusType() {
		return carbohydrateStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getcalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlucoseFactory getGlucoseFactory() {
		return (GlucoseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__PERSON_ID);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__WEIGHT);
		createEAttribute(patientEClass, PATIENT__MED_REC_NUM);
		createEAttribute(patientEClass, PATIENT__STUDY_ID);
		createEAttribute(patientEClass, PATIENT__BIRTHDATE);
		createEAttribute(patientEClass, PATIENT__HEIGHT);
		createEAttribute(patientEClass, PATIENT__STATUS);
		createEReference(patientEClass, PATIENT__DECISIONS);
		createEReference(patientEClass, PATIENT__CREATED_BY);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ACCOUNT_RIGHTS);
		createEAttribute(userEClass, USER__ACCOUNT_NAME);
		createEAttribute(userEClass, USER__PASSWORD_DIGEST);
		createEReference(userEClass, USER__CREATED_BY);

		clinicalDecisionEClass = createEClass(CLINICAL_DECISION);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECISION_TIME_STAMP);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__OBSERVATION_DATE);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_WEIGHT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_HEIGHT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__PATIENT_AGE_DAYS);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__ADVICE_TEXT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__RULES_FIRED_TEXT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__RATIONALE_TEXT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECLINE_COMMENT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__ACCEPT_COMMENT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__OTHER_COMMENT);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__USER_ACTION);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__MINUTES_TO_NEXT_EVALUATION);
		createEReference(clinicalDecisionEClass, CLINICAL_DECISION__CREATED_BY);
		createEAttribute(clinicalDecisionEClass, CLINICAL_DECISION__DECISION_ID);

		glucoseDecisionEClass = createEClass(GLUCOSE_DECISION);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__CARBOHYDRATE_STATUS);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS);
		createEAttribute(glucoseDecisionEClass, GLUCOSE_DECISION__INSULIN_MODE);

		intensiveCareUnitEClass = createEClass(INTENSIVE_CARE_UNIT);
		createEReference(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__PATIENTS);
		createEReference(intensiveCareUnitEClass, INTENSIVE_CARE_UNIT__USERS);

		// Create enums
		accessTypeEEnum = createEEnum(ACCESS_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);
		userActionTypeEEnum = createEEnum(USER_ACTION_TYPE);
		carbohydrateStatusTypeEEnum = createEEnum(CARBOHYDRATE_STATUS_TYPE);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patientEClass.getESuperTypes().add(this.getPerson());
		userEClass.getESuperTypes().add(this.getPerson());
		glucoseDecisionEClass.getESuperTypes().add(this.getClinicalDecision());

		// Initialize classes and features; add operations and parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", "", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonID(), ecorePackage.getEString(), "personID", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(personEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_Weight(), ecorePackage.getEDoubleObject(), "weight", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_MedRecNum(), ecorePackage.getEString(), "medRecNum", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_StudyID(), ecorePackage.getEString(), "studyID", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Birthdate(), this.getcalendar(), "birthdate", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Height(), ecorePackage.getEDoubleObject(), "height", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Status(), this.getStatusType(), "status", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Decisions(), this.getGlucoseDecision(), null, "decisions", null, 0, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPatient_Decisions().getEKeys().add(this.getClinicalDecision_ObservationDate());
		getPatient_Decisions().getEKeys().add(this.getClinicalDecision_UserAction());
		initEReference(getPatient_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(patientEClass, ecorePackage.getEString(), "getBirthdateString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(patientEClass, ecorePackage.getEInt(), "getTodayAgeYears", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(patientEClass, ecorePackage.getEInt(), "getTodayAgeDays", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(patientEClass, ecorePackage.getEInt(), "getDeltaAgeYears", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getcalendar(), "date", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(patientEClass, ecorePackage.getEInt(), "getDeltaAgeDays", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getcalendar(), "date", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_AccountRights(), this.getAccessType(), "accountRights", "0", 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_AccountName(), ecorePackage.getEString(), "accountName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PasswordDigest(), ecorePackage.getEString(), "passwordDigest", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clinicalDecisionEClass, ClinicalDecision.class, "ClinicalDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClinicalDecision_DecisionTimeStamp(), this.getcalendar(), "decisionTimeStamp", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_ObservationDate(), this.getcalendar(), "observationDate", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_PatientWeight(), ecorePackage.getEDouble(), "patientWeight", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_PatientHeight(), ecorePackage.getEDouble(), "patientHeight", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_PatientAgeDays(), ecorePackage.getEInt(), "patientAgeDays", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_AdviceText(), ecorePackage.getEString(), "adviceText", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_RulesFiredText(), ecorePackage.getEString(), "rulesFiredText", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_RationaleText(), ecorePackage.getEString(), "rationaleText", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_DeclineComment(), ecorePackage.getEString(), "declineComment", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_AcceptComment(), ecorePackage.getEString(), "acceptComment", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_OtherComment(), ecorePackage.getEString(), "otherComment", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_UserAction(), this.getUserActionType(), "userAction", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_MinutesToNextEvaluation(), ecorePackage.getEInt(), "minutesToNextEvaluation", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClinicalDecision_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClinicalDecision_DecisionID(), ecorePackage.getEString(), "decisionID", null, 0, 1, ClinicalDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(clinicalDecisionEClass, null, "advise", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(glucoseDecisionEClass, GlucoseDecision.class, "GlucoseDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlucoseDecision_PreviousGlucoseConcentration(), ecorePackage.getEIntegerObject(), "previousGlucoseConcentration", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_PreviousObservationTime(), this.getcalendar(), "previousObservationTime", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_SerumGlucoseConcentration(), ecorePackage.getEIntegerObject(), "serumGlucoseConcentration", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_CurrentInsulinDripRate(), ecorePackage.getEDoubleObject(), "currentInsulinDripRate", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_CarbohydrateStatus(), this.getCarbohydrateStatusType(), "carbohydrateStatus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_RecommendedInsulinDripRate(), ecorePackage.getEDoubleObject(), "recommendedInsulinDripRate", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_RecommendedInsulinBolus(), ecorePackage.getEDoubleObject(), "recommendedInsulinBolus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_RecommendedGlucoseBolus(), ecorePackage.getEDoubleObject(), "recommendedGlucoseBolus", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlucoseDecision_InsulinMode(), ecorePackage.getEString(), "insulinMode", null, 0, 1, GlucoseDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intensiveCareUnitEClass, IntensiveCareUnit.class, "IntensiveCareUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntensiveCareUnit_Patients(), this.getPatient(), null, "patients", null, 0, -1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntensiveCareUnit_Patients().getEKeys().add(this.getPerson_LastName());
		getIntensiveCareUnit_Patients().getEKeys().add(this.getPerson_FirstName());
		getIntensiveCareUnit_Patients().getEKeys().add(this.getPatient_MedRecNum());
		getIntensiveCareUnit_Patients().getEKeys().add(this.getPatient_StudyID());
		initEReference(getIntensiveCareUnit_Users(), this.getUser(), null, "users", null, 0, -1, IntensiveCareUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getIntensiveCareUnit_Users().getEKeys().add(this.getPerson_LastName());
		getIntensiveCareUnit_Users().getEKeys().add(this.getPerson_FirstName());

		// Initialize enums and add enum literals
		initEEnum(accessTypeEEnum, AccessType.class, "AccessType");
		addEEnumLiteral(accessTypeEEnum, AccessType.NORMAL);
		addEEnumLiteral(accessTypeEEnum, AccessType.ADMINISTRATIVE);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.CURRENT);
		addEEnumLiteral(statusTypeEEnum, StatusType.ARCHIVED);
		addEEnumLiteral(statusTypeEEnum, StatusType.INVALID);
		addEEnumLiteral(statusTypeEEnum, StatusType.SAMPLE);

		initEEnum(userActionTypeEEnum, UserActionType.class, "UserActionType");
		addEEnumLiteral(userActionTypeEEnum, UserActionType.ACCEPT);
		addEEnumLiteral(userActionTypeEEnum, UserActionType.DECLINE);
		addEEnumLiteral(userActionTypeEEnum, UserActionType.BACKCHART);
		addEEnumLiteral(userActionTypeEEnum, UserActionType.PASSIVE);

		initEEnum(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.class, "CarbohydrateStatusType");
		addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.UNCHANGED);
		addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.DECREASED);
		addEEnumLiteral(carbohydrateStatusTypeEEnum, CarbohydrateStatusType.INCREASED);

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "@GenericGenerator(name=\"system-uuid\", strategy = \"uuid\")"
		   });				
		addAnnotation
		  (getPerson_LastName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Basic(optional=false)"
		   });		
		addAnnotation
		  (getPerson_PersonID(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")\n"
		   });			
		addAnnotation
		  (patientEClass, 
		   source, 
		   new String[] {
			 "appinfo", "import java.util.GregorianCalendar;"
		   });																				
		addAnnotation
		  (getClinicalDecision_DecisionID(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id \n@GeneratedValue(generator=\"system-uuid\")"
		   });						
	}

} //GlucosePackageImpl
