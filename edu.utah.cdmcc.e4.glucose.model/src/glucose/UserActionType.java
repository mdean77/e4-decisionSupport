/**
 */
package glucose;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * These are the four potential actions of a user of our CDS system when clinical data have been entered.
 * When these actions are selected, dirty flags should be turned off because data are saved.
 * <!-- end-model-doc -->
 * @see glucose.GlucosePackage#getUserActionType()
 * @model
 * @generated
 */
public enum UserActionType implements Enumerator {
	/**
	 * The '<em><b>Accept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(0, "Accept", "Accept"),

	/**
	 * The '<em><b>Decline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DECLINE(1, "Decline", "Decline"),

	/**
	 * The '<em><b>Backchart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKCHART_VALUE
	 * @generated
	 * @ordered
	 */
	BACKCHART(2, "Backchart", "Backchart"),

	/**
	 * The '<em><b>Passive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSIVE(3, "Passive", "Passive");

	/**
	 * The '<em><b>Accept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User accepts the advice of the software.  Accept comment will be possible.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT
	 * @model name="Accept"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 0;

	/**
	 * The '<em><b>Decline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User declines to follow advice from the software.  Decline comment will be required.
	 * <!-- end-model-doc -->
	 * @see #DECLINE
	 * @model name="Decline"
	 * @generated
	 * @ordered
	 */
	public static final int DECLINE_VALUE = 1;

	/**
	 * The '<em><b>Backchart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User is entering clinical data for storage but software is not providing advice.  Useful for entering old clinical data.
	 * <!-- end-model-doc -->
	 * @see #BACKCHART
	 * @model name="Backchart"
	 * @generated
	 * @ordered
	 */
	public static final int BACKCHART_VALUE = 2;

	/**
	 * The '<em><b>Passive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSIVE
	 * @model name="Passive"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel null='null'"
	 * @generated
	 * @ordered
	 */
	public static final int PASSIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>User Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserActionType[] VALUES_ARRAY =
		new UserActionType[] {
			ACCEPT,
			DECLINE,
			BACKCHART,
			PASSIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>User Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserActionType get(int value) {
		switch (value) {
			case ACCEPT_VALUE: return ACCEPT;
			case DECLINE_VALUE: return DECLINE;
			case BACKCHART_VALUE: return BACKCHART;
			case PASSIVE_VALUE: return PASSIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UserActionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UserActionType
