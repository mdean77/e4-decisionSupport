/**
 */
package glucose.impl;

import glucose.GlucosePackage;
import glucose.IntensiveCareUnit;
import glucose.Patient;
import glucose.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intensive Care Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link glucose.impl.IntensiveCareUnitImpl#getPatients <em>Patients</em>}</li>
 *   <li>{@link glucose.impl.IntensiveCareUnitImpl#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntensiveCareUnitImpl extends EObjectImpl implements IntensiveCareUnit {
	/**
	 * The cached value of the '{@link #getPatients() <em>Patients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatients()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patients;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntensiveCareUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlucosePackage.Literals.INTENSIVE_CARE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Patient> getPatients() {
		if (patients == null) {
			patients = new EObjectContainmentEList<Patient>(Patient.class, this, GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS);
		}
		return patients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, GlucosePackage.INTENSIVE_CARE_UNIT__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS:
				return ((InternalEList<?>)getPatients()).basicRemove(otherEnd, msgs);
			case GlucosePackage.INTENSIVE_CARE_UNIT__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS:
				return getPatients();
			case GlucosePackage.INTENSIVE_CARE_UNIT__USERS:
				return getUsers();
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
			case GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS:
				getPatients().clear();
				getPatients().addAll((Collection<? extends Patient>)newValue);
				return;
			case GlucosePackage.INTENSIVE_CARE_UNIT__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
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
			case GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS:
				getPatients().clear();
				return;
			case GlucosePackage.INTENSIVE_CARE_UNIT__USERS:
				getUsers().clear();
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
			case GlucosePackage.INTENSIVE_CARE_UNIT__PATIENTS:
				return patients != null && !patients.isEmpty();
			case GlucosePackage.INTENSIVE_CARE_UNIT__USERS:
				return users != null && !users.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntensiveCareUnitImpl
