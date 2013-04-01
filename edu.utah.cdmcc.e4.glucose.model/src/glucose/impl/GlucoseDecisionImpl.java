/**
 */
package glucose.impl;

import glucose.CarbohydrateStatusType;
import glucose.GlucoseDecision;
import glucose.GlucosePackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getPreviousGlucoseConcentration <em>Previous Glucose Concentration</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getPreviousObservationTime <em>Previous Observation Time</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getSerumGlucoseConcentration <em>Serum Glucose Concentration</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getCurrentInsulinDripRate <em>Current Insulin Drip Rate</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getCarbohydrateStatus <em>Carbohydrate Status</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getRecommendedInsulinDripRate <em>Recommended Insulin Drip Rate</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getRecommendedInsulinBolus <em>Recommended Insulin Bolus</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getRecommendedGlucoseBolus <em>Recommended Glucose Bolus</em>}</li>
 *   <li>{@link glucose.impl.GlucoseDecisionImpl#getInsulinMode <em>Insulin Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlucoseDecisionImpl extends ClinicalDecisionImpl implements GlucoseDecision {
	/**
	 * The default value of the '{@link #getPreviousGlucoseConcentration() <em>Previous Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousGlucoseConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREVIOUS_GLUCOSE_CONCENTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousGlucoseConcentration() <em>Previous Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousGlucoseConcentration()
	 * @generated
	 * @ordered
	 */
	protected Integer previousGlucoseConcentration = PREVIOUS_GLUCOSE_CONCENTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousObservationTime() <em>Previous Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousObservationTime()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar PREVIOUS_OBSERVATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreviousObservationTime() <em>Previous Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousObservationTime()
	 * @generated
	 * @ordered
	 */
	protected Calendar previousObservationTime = PREVIOUS_OBSERVATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerumGlucoseConcentration() <em>Serum Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerumGlucoseConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERUM_GLUCOSE_CONCENTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerumGlucoseConcentration() <em>Serum Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerumGlucoseConcentration()
	 * @generated
	 * @ordered
	 */
	protected Integer serumGlucoseConcentration = SERUM_GLUCOSE_CONCENTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentInsulinDripRate() <em>Current Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentInsulinDripRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double CURRENT_INSULIN_DRIP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentInsulinDripRate() <em>Current Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentInsulinDripRate()
	 * @generated
	 * @ordered
	 */
	protected Double currentInsulinDripRate = CURRENT_INSULIN_DRIP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarbohydrateStatus() <em>Carbohydrate Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbohydrateStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CarbohydrateStatusType CARBOHYDRATE_STATUS_EDEFAULT = CarbohydrateStatusType.UNCHANGED;

	/**
	 * The cached value of the '{@link #getCarbohydrateStatus() <em>Carbohydrate Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbohydrateStatus()
	 * @generated
	 * @ordered
	 */
	protected CarbohydrateStatusType carbohydrateStatus = CARBOHYDRATE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendedInsulinDripRate() <em>Recommended Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedInsulinDripRate()
	 * @generated
	 * @ordered
	 */
	protected static final Double RECOMMENDED_INSULIN_DRIP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedInsulinDripRate() <em>Recommended Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedInsulinDripRate()
	 * @generated
	 * @ordered
	 */
	protected Double recommendedInsulinDripRate = RECOMMENDED_INSULIN_DRIP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendedInsulinBolus() <em>Recommended Insulin Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedInsulinBolus()
	 * @generated
	 * @ordered
	 */
	protected static final Double RECOMMENDED_INSULIN_BOLUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedInsulinBolus() <em>Recommended Insulin Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedInsulinBolus()
	 * @generated
	 * @ordered
	 */
	protected Double recommendedInsulinBolus = RECOMMENDED_INSULIN_BOLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendedGlucoseBolus() <em>Recommended Glucose Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedGlucoseBolus()
	 * @generated
	 * @ordered
	 */
	protected static final Double RECOMMENDED_GLUCOSE_BOLUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedGlucoseBolus() <em>Recommended Glucose Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedGlucoseBolus()
	 * @generated
	 * @ordered
	 */
	protected Double recommendedGlucoseBolus = RECOMMENDED_GLUCOSE_BOLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsulinMode() <em>Insulin Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulinMode()
	 * @generated
	 * @ordered
	 */
	protected static final String INSULIN_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsulinMode() <em>Insulin Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsulinMode()
	 * @generated
	 * @ordered
	 */
	protected String insulinMode = INSULIN_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlucoseDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlucosePackage.Literals.GLUCOSE_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPreviousGlucoseConcentration() {
		return previousGlucoseConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousGlucoseConcentration(Integer newPreviousGlucoseConcentration) {
		Integer oldPreviousGlucoseConcentration = previousGlucoseConcentration;
		previousGlucoseConcentration = newPreviousGlucoseConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION, oldPreviousGlucoseConcentration, previousGlucoseConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getPreviousObservationTime() {
		return previousObservationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousObservationTime(Calendar newPreviousObservationTime) {
		Calendar oldPreviousObservationTime = previousObservationTime;
		previousObservationTime = newPreviousObservationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME, oldPreviousObservationTime, previousObservationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSerumGlucoseConcentration() {
		return serumGlucoseConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerumGlucoseConcentration(Integer newSerumGlucoseConcentration) {
		Integer oldSerumGlucoseConcentration = serumGlucoseConcentration;
		serumGlucoseConcentration = newSerumGlucoseConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION, oldSerumGlucoseConcentration, serumGlucoseConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCurrentInsulinDripRate() {
		return currentInsulinDripRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentInsulinDripRate(Double newCurrentInsulinDripRate) {
		Double oldCurrentInsulinDripRate = currentInsulinDripRate;
		currentInsulinDripRate = newCurrentInsulinDripRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE, oldCurrentInsulinDripRate, currentInsulinDripRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarbohydrateStatusType getCarbohydrateStatus() {
		return carbohydrateStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbohydrateStatus(CarbohydrateStatusType newCarbohydrateStatus) {
		CarbohydrateStatusType oldCarbohydrateStatus = carbohydrateStatus;
		carbohydrateStatus = newCarbohydrateStatus == null ? CARBOHYDRATE_STATUS_EDEFAULT : newCarbohydrateStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS, oldCarbohydrateStatus, carbohydrateStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRecommendedInsulinDripRate() {
		return recommendedInsulinDripRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedInsulinDripRate(Double newRecommendedInsulinDripRate) {
		Double oldRecommendedInsulinDripRate = recommendedInsulinDripRate;
		recommendedInsulinDripRate = newRecommendedInsulinDripRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE, oldRecommendedInsulinDripRate, recommendedInsulinDripRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRecommendedInsulinBolus() {
		return recommendedInsulinBolus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedInsulinBolus(Double newRecommendedInsulinBolus) {
		Double oldRecommendedInsulinBolus = recommendedInsulinBolus;
		recommendedInsulinBolus = newRecommendedInsulinBolus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS, oldRecommendedInsulinBolus, recommendedInsulinBolus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRecommendedGlucoseBolus() {
		return recommendedGlucoseBolus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendedGlucoseBolus(Double newRecommendedGlucoseBolus) {
		Double oldRecommendedGlucoseBolus = recommendedGlucoseBolus;
		recommendedGlucoseBolus = newRecommendedGlucoseBolus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS, oldRecommendedGlucoseBolus, recommendedGlucoseBolus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsulinMode() {
		return insulinMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsulinMode(String newInsulinMode) {
		String oldInsulinMode = insulinMode;
		insulinMode = newInsulinMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE, oldInsulinMode, insulinMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION:
				return getPreviousGlucoseConcentration();
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME:
				return getPreviousObservationTime();
			case GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION:
				return getSerumGlucoseConcentration();
			case GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE:
				return getCurrentInsulinDripRate();
			case GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS:
				return getCarbohydrateStatus();
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE:
				return getRecommendedInsulinDripRate();
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS:
				return getRecommendedInsulinBolus();
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS:
				return getRecommendedGlucoseBolus();
			case GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE:
				return getInsulinMode();
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
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION:
				setPreviousGlucoseConcentration((Integer)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME:
				setPreviousObservationTime((Calendar)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION:
				setSerumGlucoseConcentration((Integer)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE:
				setCurrentInsulinDripRate((Double)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS:
				setCarbohydrateStatus((CarbohydrateStatusType)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE:
				setRecommendedInsulinDripRate((Double)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS:
				setRecommendedInsulinBolus((Double)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS:
				setRecommendedGlucoseBolus((Double)newValue);
				return;
			case GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE:
				setInsulinMode((String)newValue);
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
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION:
				setPreviousGlucoseConcentration(PREVIOUS_GLUCOSE_CONCENTRATION_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME:
				setPreviousObservationTime(PREVIOUS_OBSERVATION_TIME_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION:
				setSerumGlucoseConcentration(SERUM_GLUCOSE_CONCENTRATION_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE:
				setCurrentInsulinDripRate(CURRENT_INSULIN_DRIP_RATE_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS:
				setCarbohydrateStatus(CARBOHYDRATE_STATUS_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE:
				setRecommendedInsulinDripRate(RECOMMENDED_INSULIN_DRIP_RATE_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS:
				setRecommendedInsulinBolus(RECOMMENDED_INSULIN_BOLUS_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS:
				setRecommendedGlucoseBolus(RECOMMENDED_GLUCOSE_BOLUS_EDEFAULT);
				return;
			case GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE:
				setInsulinMode(INSULIN_MODE_EDEFAULT);
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
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_GLUCOSE_CONCENTRATION:
				return PREVIOUS_GLUCOSE_CONCENTRATION_EDEFAULT == null ? previousGlucoseConcentration != null : !PREVIOUS_GLUCOSE_CONCENTRATION_EDEFAULT.equals(previousGlucoseConcentration);
			case GlucosePackage.GLUCOSE_DECISION__PREVIOUS_OBSERVATION_TIME:
				return PREVIOUS_OBSERVATION_TIME_EDEFAULT == null ? previousObservationTime != null : !PREVIOUS_OBSERVATION_TIME_EDEFAULT.equals(previousObservationTime);
			case GlucosePackage.GLUCOSE_DECISION__SERUM_GLUCOSE_CONCENTRATION:
				return SERUM_GLUCOSE_CONCENTRATION_EDEFAULT == null ? serumGlucoseConcentration != null : !SERUM_GLUCOSE_CONCENTRATION_EDEFAULT.equals(serumGlucoseConcentration);
			case GlucosePackage.GLUCOSE_DECISION__CURRENT_INSULIN_DRIP_RATE:
				return CURRENT_INSULIN_DRIP_RATE_EDEFAULT == null ? currentInsulinDripRate != null : !CURRENT_INSULIN_DRIP_RATE_EDEFAULT.equals(currentInsulinDripRate);
			case GlucosePackage.GLUCOSE_DECISION__CARBOHYDRATE_STATUS:
				return carbohydrateStatus != CARBOHYDRATE_STATUS_EDEFAULT;
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_DRIP_RATE:
				return RECOMMENDED_INSULIN_DRIP_RATE_EDEFAULT == null ? recommendedInsulinDripRate != null : !RECOMMENDED_INSULIN_DRIP_RATE_EDEFAULT.equals(recommendedInsulinDripRate);
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_INSULIN_BOLUS:
				return RECOMMENDED_INSULIN_BOLUS_EDEFAULT == null ? recommendedInsulinBolus != null : !RECOMMENDED_INSULIN_BOLUS_EDEFAULT.equals(recommendedInsulinBolus);
			case GlucosePackage.GLUCOSE_DECISION__RECOMMENDED_GLUCOSE_BOLUS:
				return RECOMMENDED_GLUCOSE_BOLUS_EDEFAULT == null ? recommendedGlucoseBolus != null : !RECOMMENDED_GLUCOSE_BOLUS_EDEFAULT.equals(recommendedGlucoseBolus);
			case GlucosePackage.GLUCOSE_DECISION__INSULIN_MODE:
				return INSULIN_MODE_EDEFAULT == null ? insulinMode != null : !INSULIN_MODE_EDEFAULT.equals(insulinMode);
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
		result.append(" (previousGlucoseConcentration: ");
		result.append(previousGlucoseConcentration);
		result.append(", previousObservationTime: ");
		result.append(previousObservationTime);
		result.append(", serumGlucoseConcentration: ");
		result.append(serumGlucoseConcentration);
		result.append(", currentInsulinDripRate: ");
		result.append(currentInsulinDripRate);
		result.append(", carbohydrateStatus: ");
		result.append(carbohydrateStatus);
		result.append(", recommendedInsulinDripRate: ");
		result.append(recommendedInsulinDripRate);
		result.append(", recommendedInsulinBolus: ");
		result.append(recommendedInsulinBolus);
		result.append(", recommendedGlucoseBolus: ");
		result.append(recommendedGlucoseBolus);
		result.append(", insulinMode: ");
		result.append(insulinMode);
		result.append(')');
		return result.toString();
	}

} //GlucoseDecisionImpl
