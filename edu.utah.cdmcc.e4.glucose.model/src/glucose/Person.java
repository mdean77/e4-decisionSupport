/**
 */
package glucose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Person entity is used as a base class for patients and users.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link glucose.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link glucose.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link glucose.Person#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link glucose.Person#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see glucose.GlucosePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see glucose.GlucosePackage#getPerson_LastName()
	 * @model default=""
	 *        annotation="teneo.jpa appinfo='@Basic(optional=false)'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link glucose.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see glucose.GlucosePackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link glucose.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person ID</em>' attribute.
	 * @see #setPersonID(String)
	 * @see glucose.GlucosePackage#getPerson_PersonID()
	 * @model id="true"
	 *        annotation="teneo.jpa appinfo='@Id \n@GeneratedValue(generator=\"system-uuid\")\n'"
	 * @generated
	 */
	String getPersonID();

	/**
	 * Sets the value of the '{@link glucose.Person#getPersonID <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person ID</em>' attribute.
	 * @see #getPersonID()
	 * @generated
	 */
	void setPersonID(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link glucose.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the person record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see glucose.StatusType
	 * @see #setStatus(StatusType)
	 * @see glucose.GlucosePackage#getPerson_Status()
	 * @model default="0"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link glucose.Person#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see glucose.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getLastName().trim() + \", \" + getFirstName().trim();'"
	 * @generated
	 */
	String getName();

} // Person
