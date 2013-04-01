/**
 */
package glucose;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Carbohydrate Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see glucose.GlucosePackage#getCarbohydrateStatusType()
 * @model
 * @generated
 */
public enum CarbohydrateStatusType implements Enumerator {
	/**
	 * The '<em><b>Unchanged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCHANGED(0, "unchanged", "No Change"),

	/**
	 * The '<em><b>Decreased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASED_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASED(1, "decreased", "Decreased or stopped"),

	/**
	 * The '<em><b>Increased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASED_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASED(2, "increased", "Increased or started");

	/**
	 * The '<em><b>Unchanged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unchanged</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCHANGED
	 * @model name="unchanged" literal="No Change"
	 * @generated
	 * @ordered
	 */
	public static final int UNCHANGED_VALUE = 0;

	/**
	 * The '<em><b>Decreased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Decreased</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECREASED
	 * @model name="decreased" literal="Decreased or stopped"
	 * @generated
	 * @ordered
	 */
	public static final int DECREASED_VALUE = 1;

	/**
	 * The '<em><b>Increased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Increased</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREASED
	 * @model name="increased" literal="Increased or started"
	 * @generated
	 * @ordered
	 */
	public static final int INCREASED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Carbohydrate Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CarbohydrateStatusType[] VALUES_ARRAY =
		new CarbohydrateStatusType[] {
			UNCHANGED,
			DECREASED,
			INCREASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Carbohydrate Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CarbohydrateStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Carbohydrate Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarbohydrateStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarbohydrateStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Carbohydrate Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarbohydrateStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarbohydrateStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Carbohydrate Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarbohydrateStatusType get(int value) {
		switch (value) {
			case UNCHANGED_VALUE: return UNCHANGED;
			case DECREASED_VALUE: return DECREASED;
			case INCREASED_VALUE: return INCREASED;
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
	private CarbohydrateStatusType(int value, String name, String literal) {
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
	
} //CarbohydrateStatusType
