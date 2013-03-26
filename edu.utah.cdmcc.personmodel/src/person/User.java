/**
 */
package person;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a clinical user of the software, generally a nurse or physician.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link person.User#getAccountRights <em>Account Rights</em>}</li>
 *   <li>{@link person.User#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link person.User#getPasswordDigest <em>Password Digest</em>}</li>
 * </ul>
 * </p>
 *
 * @see person.PersonPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Person {
	/**
	 * Returns the value of the '<em><b>Account Rights</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link person.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Rights</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Rights</em>' attribute.
	 * @see person.AccessType
	 * @see #setAccountRights(AccessType)
	 * @see person.PersonPackage#getUser_AccountRights()
	 * @model default="0"
	 * @generated
	 */
	AccessType getAccountRights();

	/**
	 * Sets the value of the '{@link person.User#getAccountRights <em>Account Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Rights</em>' attribute.
	 * @see person.AccessType
	 * @see #getAccountRights()
	 * @generated
	 */
	void setAccountRights(AccessType value);

	/**
	 * Returns the value of the '<em><b>Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Name</em>' attribute.
	 * @see #setAccountName(String)
	 * @see person.PersonPackage#getUser_AccountName()
	 * @model
	 * @generated
	 */
	String getAccountName();

	/**
	 * Sets the value of the '{@link person.User#getAccountName <em>Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Name</em>' attribute.
	 * @see #getAccountName()
	 * @generated
	 */
	void setAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Password Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Digest</em>' attribute.
	 * @see #setPasswordDigest(String)
	 * @see person.PersonPackage#getUser_PasswordDigest()
	 * @model
	 * @generated
	 */
	String getPasswordDigest();

	/**
	 * Sets the value of the '{@link person.User#getPasswordDigest <em>Password Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Digest</em>' attribute.
	 * @see #getPasswordDigest()
	 * @generated
	 */
	void setPasswordDigest(String value);

} // User
