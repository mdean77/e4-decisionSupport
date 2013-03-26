/**
 */
package person.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import person.AccessType;
import person.PersonPackage;
import person.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link person.impl.UserImpl#getAccountRights <em>Account Rights</em>}</li>
 *   <li>{@link person.impl.UserImpl#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link person.impl.UserImpl#getPasswordDigest <em>Password Digest</em>}</li>
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
		return PersonPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.USER__ACCOUNT_RIGHTS, oldAccountRights, accountRights));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.USER__ACCOUNT_NAME, oldAccountName, accountName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PersonPackage.USER__PASSWORD_DIGEST, oldPasswordDigest, passwordDigest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersonPackage.USER__ACCOUNT_RIGHTS:
				return getAccountRights();
			case PersonPackage.USER__ACCOUNT_NAME:
				return getAccountName();
			case PersonPackage.USER__PASSWORD_DIGEST:
				return getPasswordDigest();
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
			case PersonPackage.USER__ACCOUNT_RIGHTS:
				setAccountRights((AccessType)newValue);
				return;
			case PersonPackage.USER__ACCOUNT_NAME:
				setAccountName((String)newValue);
				return;
			case PersonPackage.USER__PASSWORD_DIGEST:
				setPasswordDigest((String)newValue);
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
			case PersonPackage.USER__ACCOUNT_RIGHTS:
				setAccountRights(ACCOUNT_RIGHTS_EDEFAULT);
				return;
			case PersonPackage.USER__ACCOUNT_NAME:
				setAccountName(ACCOUNT_NAME_EDEFAULT);
				return;
			case PersonPackage.USER__PASSWORD_DIGEST:
				setPasswordDigest(PASSWORD_DIGEST_EDEFAULT);
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
			case PersonPackage.USER__ACCOUNT_RIGHTS:
				return accountRights != ACCOUNT_RIGHTS_EDEFAULT;
			case PersonPackage.USER__ACCOUNT_NAME:
				return ACCOUNT_NAME_EDEFAULT == null ? accountName != null : !ACCOUNT_NAME_EDEFAULT.equals(accountName);
			case PersonPackage.USER__PASSWORD_DIGEST:
				return PASSWORD_DIGEST_EDEFAULT == null ? passwordDigest != null : !PASSWORD_DIGEST_EDEFAULT.equals(passwordDigest);
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
