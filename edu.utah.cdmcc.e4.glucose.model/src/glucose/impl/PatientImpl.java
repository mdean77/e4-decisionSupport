/**
 */
package glucose.impl;

import glucose.GlucoseDecision;
import glucose.GlucosePackage;
import glucose.Patient;
import glucose.User;

import java.text.DateFormat;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link glucose.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getDecisions <em>Decisions</em>}</li>
 *   <li>{@link glucose.impl.PatientImpl#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientImpl extends PersonImpl implements Patient {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedRecNum() <em>Med Rec Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedRecNum()
	 * @generated
	 * @ordered
	 */
	protected static final String MED_REC_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedRecNum() <em>Med Rec Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedRecNum()
	 * @generated
	 * @ordered
	 */
	protected String medRecNum = MED_REC_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudyID() <em>Study ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyID()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudyID() <em>Study ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyID()
	 * @generated
	 * @ordered
	 */
	protected String studyID = STUDY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Calendar birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecisions() <em>Decisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<GlucoseDecision> decisions;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected User createdBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlucosePackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Double newWeight) {
		Double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedRecNum() {
		return medRecNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedRecNum(String newMedRecNum) {
		String oldMedRecNum = medRecNum;
		medRecNum = newMedRecNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__MED_REC_NUM, oldMedRecNum, medRecNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudyID() {
		return studyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyID(String newStudyID) {
		String oldStudyID = studyID;
		studyID = newStudyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__STUDY_ID, oldStudyID, studyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Calendar newBirthdate) {
		Calendar oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		Double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlucoseDecision> getDecisions() {
		if (decisions == null) {
			decisions = new EObjectContainmentEList<GlucoseDecision>(GlucoseDecision.class, this, GlucosePackage.PATIENT__DECISIONS);
		}
		return decisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCreatedBy() {
		if (createdBy != null && createdBy.eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject)createdBy;
			createdBy = (User)eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlucosePackage.PATIENT__CREATED_BY, oldCreatedBy, createdBy));
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(User newCreatedBy) {
		User oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.PATIENT__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthdateString() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		return df.format(birthdate.getTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTodayAgeYears() {
		return getDeltaAgeYears(new GregorianCalendar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTodayAgeDays() {
		return getDeltaAgeDays(new GregorianCalendar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeltaAgeYears(Calendar date) {
		long millisBetween = Math.abs(getBirthdate().getTimeInMillis()
						- date.getTimeInMillis());
		return (int) ((millisBetween / (1000 * 60 * 60 * 24)) / 365);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeltaAgeDays(Calendar date) {
		long millisBetween = Math.abs(getBirthdate().getTimeInMillis()
			- date.getTimeInMillis());
		return (int) (millisBetween / (1000 * 60 * 60 * 24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlucosePackage.PATIENT__DECISIONS:
				return ((InternalEList<?>)getDecisions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlucosePackage.PATIENT__WEIGHT:
				return getWeight();
			case GlucosePackage.PATIENT__MED_REC_NUM:
				return getMedRecNum();
			case GlucosePackage.PATIENT__STUDY_ID:
				return getStudyID();
			case GlucosePackage.PATIENT__BIRTHDATE:
				return getBirthdate();
			case GlucosePackage.PATIENT__HEIGHT:
				return getHeight();
			case GlucosePackage.PATIENT__DECISIONS:
				return getDecisions();
			case GlucosePackage.PATIENT__CREATED_BY:
				if (resolve) return getCreatedBy();
				return basicGetCreatedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GlucosePackage.PATIENT__WEIGHT:
				setWeight((Double)newValue);
				return;
			case GlucosePackage.PATIENT__MED_REC_NUM:
				setMedRecNum((String)newValue);
				return;
			case GlucosePackage.PATIENT__STUDY_ID:
				setStudyID((String)newValue);
				return;
			case GlucosePackage.PATIENT__BIRTHDATE:
				setBirthdate((Calendar)newValue);
				return;
			case GlucosePackage.PATIENT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case GlucosePackage.PATIENT__DECISIONS:
				getDecisions().clear();
				getDecisions().addAll((Collection<? extends GlucoseDecision>)newValue);
				return;
			case GlucosePackage.PATIENT__CREATED_BY:
				setCreatedBy((User)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GlucosePackage.PATIENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case GlucosePackage.PATIENT__MED_REC_NUM:
				setMedRecNum(MED_REC_NUM_EDEFAULT);
				return;
			case GlucosePackage.PATIENT__STUDY_ID:
				setStudyID(STUDY_ID_EDEFAULT);
				return;
			case GlucosePackage.PATIENT__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case GlucosePackage.PATIENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GlucosePackage.PATIENT__DECISIONS:
				getDecisions().clear();
				return;
			case GlucosePackage.PATIENT__CREATED_BY:
				setCreatedBy((User)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GlucosePackage.PATIENT__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case GlucosePackage.PATIENT__MED_REC_NUM:
				return MED_REC_NUM_EDEFAULT == null ? medRecNum != null : !MED_REC_NUM_EDEFAULT.equals(medRecNum);
			case GlucosePackage.PATIENT__STUDY_ID:
				return STUDY_ID_EDEFAULT == null ? studyID != null : !STUDY_ID_EDEFAULT.equals(studyID);
			case GlucosePackage.PATIENT__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case GlucosePackage.PATIENT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case GlucosePackage.PATIENT__DECISIONS:
				return decisions != null && !decisions.isEmpty();
			case GlucosePackage.PATIENT__CREATED_BY:
				return createdBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (weight: ");
		result.append(weight);
		result.append(", medRecNum: ");
		result.append(medRecNum);
		result.append(", studyID: ");
		result.append(studyID);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
