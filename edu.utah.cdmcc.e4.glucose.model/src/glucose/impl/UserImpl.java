/**
 */
package glucose.impl;

import glucose.AccessType;
import glucose.GlucosePackage;
import glucose.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link glucose.impl.UserImpl#getAccountRights <em>Account Rights</em>}</li>
 *   <li>{@link glucose.impl.UserImpl#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link glucose.impl.UserImpl#getPasswordDigest <em>Password Digest</em>}</li>
 *   <li>{@link glucose.impl.UserImpl#getCreatedBy <em>Created By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends PersonImpl implements User {
	/**
	 * The default value of the '{@link #getAccountRights() <em>Account Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountRights()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCOUNT_RIGHTS_EDEFAULT = AccessType.NORMAL;

	/**
	 * The cached value of the '{@link #getAccountRights() <em>Account Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountRights()
	 * @generated
	 * @ordered
	 */
	protected AccessType accountRights = ACCOUNT_RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountName() <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountName() <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountName()
	 * @generated
	 * @ordered
	 */
	protected String accountName = ACCOUNT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordDigest() <em>Password Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordDigest()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_DIGEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordDigest() <em>Password Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordDigest()
	 * @generated
	 * @ordered
	 */
	protected String passwordDigest = PASSWORD_DIGEST_EDEFAULT;

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
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlucosePackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccountRights() {
		return accountRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountRights(AccessType newAccountRights) {
		AccessType oldAccountRights = accountRights;
		accountRights = newAccountRights == null ? ACCOUNT_RIGHTS_EDEFAULT : newAccountRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.USER__ACCOUNT_RIGHTS, oldAccountRights, accountRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountName(String newAccountName) {
		String oldAccountName = accountName;
		accountName = newAccountName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.USER__ACCOUNT_NAME, oldAccountName, accountName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordDigest() {
		return passwordDigest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordDigest(String newPasswordDigest) {
		String oldPasswordDigest = passwordDigest;
		passwordDigest = newPasswordDigest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.USER__PASSWORD_DIGEST, oldPasswordDigest, passwordDigest));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GlucosePackage.USER__CREATED_BY, oldCreatedBy, createdBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GlucosePackage.USER__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlucosePackage.USER__ACCOUNT_RIGHTS:
				return getAccountRights();
			case GlucosePackage.USER__ACCOUNT_NAME:
				return getAccountName();
			case GlucosePackage.USER__PASSWORD_DIGEST:
				return getPasswordDigest();
			case GlucosePackage.USER__CREATED_BY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GlucosePackage.USER__ACCOUNT_RIGHTS:
				setAccountRights((AccessType)newValue);
				return;
			case GlucosePackage.USER__ACCOUNT_NAME:
				setAccountName((String)newValue);
				return;
			case GlucosePackage.USER__PASSWORD_DIGEST:
				setPasswordDigest((String)newValue);
				return;
			case GlucosePackage.USER__CREATED_BY:
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
			case GlucosePackage.USER__ACCOUNT_RIGHTS:
				setAccountRights(ACCOUNT_RIGHTS_EDEFAULT);
				return;
			case GlucosePackage.USER__ACCOUNT_NAME:
				setAccountName(ACCOUNT_NAME_EDEFAULT);
				return;
			case GlucosePackage.USER__PASSWORD_DIGEST:
				setPasswordDigest(PASSWORD_DIGEST_EDEFAULT);
				return;
			case GlucosePackage.USER__CREATED_BY:
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
			case GlucosePackage.USER__ACCOUNT_RIGHTS:
				return accountRights != ACCOUNT_RIGHTS_EDEFAULT;
			case GlucosePackage.USER__ACCOUNT_NAME:
				return ACCOUNT_NAME_EDEFAULT == null ? accountName != null : !ACCOUNT_NAME_EDEFAULT.equals(accountName);
			case GlucosePackage.USER__PASSWORD_DIGEST:
				return PASSWORD_DIGEST_EDEFAULT == null ? passwordDigest != null : !PASSWORD_DIGEST_EDEFAULT.equals(passwordDigest);
			case GlucosePackage.USER__CREATED_BY:
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
		result.append(" (accountRights: ");
		result.append(accountRights);
		result.append(", accountName: ");
		result.append(accountName);
		result.append(", passwordDigest: ");
		result.append(passwordDigest);
		result.append(')');
		return result.toString();
	}

} //UserImpl
