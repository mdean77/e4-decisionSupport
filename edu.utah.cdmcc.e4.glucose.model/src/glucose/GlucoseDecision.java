/**
 */
package glucose;

import java.util.Calendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a glucose insulin protocol decision.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link glucose.GlucoseDecision#getPreviousGlucoseConcentration <em>Previous Glucose Concentration</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getPreviousObservationTime <em>Previous Observation Time</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getSerumGlucoseConcentration <em>Serum Glucose Concentration</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getCurrentInsulinDripRate <em>Current Insulin Drip Rate</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getCarbohydrateStatus <em>Carbohydrate Status</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getRecommendedInsulinDripRate <em>Recommended Insulin Drip Rate</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getRecommendedInsulinBolus <em>Recommended Insulin Bolus</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getRecommendedGlucoseBolus <em>Recommended Glucose Bolus</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getInsulinMode <em>Insulin Mode</em>}</li>
 *   <li>{@link glucose.GlucoseDecision#getPatient <em>Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @see glucose.GlucosePackage#getGlucoseDecision()
 * @model
 * @generated
 */
public interface GlucoseDecision extends ClinicalDecision {
	/**
	 * Returns the value of the '<em><b>Previous Glucose Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Glucose Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Glucose Concentration</em>' attribute.
	 * @see #setPreviousGlucoseConcentration(Integer)
	 * @see glucose.GlucosePackage#getGlucoseDecision_PreviousGlucoseConcentration()
	 * @model
	 * @generated
	 */
	Integer getPreviousGlucoseConcentration();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getPreviousGlucoseConcentration <em>Previous Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Glucose Concentration</em>' attribute.
	 * @see #getPreviousGlucoseConcentration()
	 * @generated
	 */
	void setPreviousGlucoseConcentration(Integer value);

	/**
	 * Returns the value of the '<em><b>Previous Observation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Observation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Observation Time</em>' attribute.
	 * @see #setPreviousObservationTime(Calendar)
	 * @see glucose.GlucosePackage#getGlucoseDecision_PreviousObservationTime()
	 * @model dataType="glucose.calendar"
	 * @generated
	 */
	Calendar getPreviousObservationTime();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getPreviousObservationTime <em>Previous Observation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Observation Time</em>' attribute.
	 * @see #getPreviousObservationTime()
	 * @generated
	 */
	void setPreviousObservationTime(Calendar value);

	/**
	 * Returns the value of the '<em><b>Serum Glucose Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serum Glucose Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serum Glucose Concentration</em>' attribute.
	 * @see #setSerumGlucoseConcentration(Integer)
	 * @see glucose.GlucosePackage#getGlucoseDecision_SerumGlucoseConcentration()
	 * @model
	 * @generated
	 */
	Integer getSerumGlucoseConcentration();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getSerumGlucoseConcentration <em>Serum Glucose Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serum Glucose Concentration</em>' attribute.
	 * @see #getSerumGlucoseConcentration()
	 * @generated
	 */
	void setSerumGlucoseConcentration(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Insulin Drip Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Insulin Drip Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Insulin Drip Rate</em>' attribute.
	 * @see #setCurrentInsulinDripRate(Double)
	 * @see glucose.GlucosePackage#getGlucoseDecision_CurrentInsulinDripRate()
	 * @model
	 * @generated
	 */
	Double getCurrentInsulinDripRate();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getCurrentInsulinDripRate <em>Current Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Insulin Drip Rate</em>' attribute.
	 * @see #getCurrentInsulinDripRate()
	 * @generated
	 */
	void setCurrentInsulinDripRate(Double value);

	/**
	 * Returns the value of the '<em><b>Carbohydrate Status</b></em>' attribute.
	 * The literals are from the enumeration {@link glucose.CarbohydrateStatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carbohydrate Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carbohydrate Status</em>' attribute.
	 * @see glucose.CarbohydrateStatusType
	 * @see #setCarbohydrateStatus(CarbohydrateStatusType)
	 * @see glucose.GlucosePackage#getGlucoseDecision_CarbohydrateStatus()
	 * @model
	 * @generated
	 */
	CarbohydrateStatusType getCarbohydrateStatus();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getCarbohydrateStatus <em>Carbohydrate Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carbohydrate Status</em>' attribute.
	 * @see glucose.CarbohydrateStatusType
	 * @see #getCarbohydrateStatus()
	 * @generated
	 */
	void setCarbohydrateStatus(CarbohydrateStatusType value);

	/**
	 * Returns the value of the '<em><b>Recommended Insulin Drip Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Insulin Drip Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Insulin Drip Rate</em>' attribute.
	 * @see #setRecommendedInsulinDripRate(Double)
	 * @see glucose.GlucosePackage#getGlucoseDecision_RecommendedInsulinDripRate()
	 * @model
	 * @generated
	 */
	Double getRecommendedInsulinDripRate();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getRecommendedInsulinDripRate <em>Recommended Insulin Drip Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Insulin Drip Rate</em>' attribute.
	 * @see #getRecommendedInsulinDripRate()
	 * @generated
	 */
	void setRecommendedInsulinDripRate(Double value);

	/**
	 * Returns the value of the '<em><b>Recommended Insulin Bolus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Insulin Bolus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Insulin Bolus</em>' attribute.
	 * @see #setRecommendedInsulinBolus(Double)
	 * @see glucose.GlucosePackage#getGlucoseDecision_RecommendedInsulinBolus()
	 * @model
	 * @generated
	 */
	Double getRecommendedInsulinBolus();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getRecommendedInsulinBolus <em>Recommended Insulin Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Insulin Bolus</em>' attribute.
	 * @see #getRecommendedInsulinBolus()
	 * @generated
	 */
	void setRecommendedInsulinBolus(Double value);

	/**
	 * Returns the value of the '<em><b>Recommended Glucose Bolus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Glucose Bolus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Glucose Bolus</em>' attribute.
	 * @see #setRecommendedGlucoseBolus(Double)
	 * @see glucose.GlucosePackage#getGlucoseDecision_RecommendedGlucoseBolus()
	 * @model
	 * @generated
	 */
	Double getRecommendedGlucoseBolus();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getRecommendedGlucoseBolus <em>Recommended Glucose Bolus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Glucose Bolus</em>' attribute.
	 * @see #getRecommendedGlucoseBolus()
	 * @generated
	 */
	void setRecommendedGlucoseBolus(Double value);

	/**
	 * Returns the value of the '<em><b>Insulin Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulin Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulin Mode</em>' attribute.
	 * @see #setInsulinMode(String)
	 * @see glucose.GlucosePackage#getGlucoseDecision_InsulinMode()
	 * @model
	 * @generated
	 */
	String getInsulinMode();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getInsulinMode <em>Insulin Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulin Mode</em>' attribute.
	 * @see #getInsulinMode()
	 * @generated
	 */
	void setInsulinMode(String value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link glucose.Patient#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' container reference.
	 * @see #setPatient(Patient)
	 * @see glucose.GlucosePackage#getGlucoseDecision_Patient()
	 * @see glucose.Patient#getDecisions
	 * @model opposite="decisions" required="true" transient="false"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link glucose.GlucoseDecision#getPatient <em>Patient</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' container reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

} // GlucoseDecision
