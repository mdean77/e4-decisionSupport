/**
 */
package person.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import person.Patient;
import person.PersonPackage;
import person.StatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link person.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link person.impl.PatientImpl#getMedRecNum <em>Med Rec Num</em>}</li>
 *   <li>{@link person.impl.PatientImpl#getStudyID <em>Study ID</em>}</li>
 *   <li>{@link person.impl.PatientImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link person.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link person.impl.PatientImpl#getStatus <em>Status</em>}</li>
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
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

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
	protected static final Date BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.CURRENT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

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
		return PersonPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__WEIGHT, oldWeight, weight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__MED_REC_NUM, oldMedRecNum, medRecNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__STUDY_ID, oldStudyID, studyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.PATIENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonPackage.PATIENT__WEIGHT:
				return getWeight();
			case PersonPackage.PATIENT__MED_REC_NUM:
				return getMedRecNum();
			case PersonPackage.PATIENT__STUDY_ID:
				return getStudyID();
			case PersonPackage.PATIENT__BIRTHDATE:
				return getBirthdate();
			case PersonPackage.PATIENT__HEIGHT:
				return getHeight();
			case PersonPackage.PATIENT__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersonPackage.PATIENT__WEIGHT:
				setWeight((Double)newValue);
				return;
			case PersonPackage.PATIENT__MED_REC_NUM:
				setMedRecNum((String)newValue);
				return;
			case PersonPackage.PATIENT__STUDY_ID:
				setStudyID((String)newValue);
				return;
			case PersonPackage.PATIENT__BIRTHDATE:
				setBirthdate((Date)newValue);
				return;
			case PersonPackage.PATIENT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case PersonPackage.PATIENT__STATUS:
				setStatus((StatusType)newValue);
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
			case PersonPackage.PATIENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PersonPackage.PATIENT__MED_REC_NUM:
				setMedRecNum(MED_REC_NUM_EDEFAULT);
				return;
			case PersonPackage.PATIENT__STUDY_ID:
				setStudyID(STUDY_ID_EDEFAULT);
				return;
			case PersonPackage.PATIENT__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case PersonPackage.PATIENT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PersonPackage.PATIENT__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case PersonPackage.PATIENT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PersonPackage.PATIENT__MED_REC_NUM:
				return MED_REC_NUM_EDEFAULT == null ? medRecNum != null : !MED_REC_NUM_EDEFAULT.equals(medRecNum);
			case PersonPackage.PATIENT__STUDY_ID:
				return STUDY_ID_EDEFAULT == null ? studyID != null : !STUDY_ID_EDEFAULT.equals(studyID);
			case PersonPackage.PATIENT__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case PersonPackage.PATIENT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PersonPackage.PATIENT__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
