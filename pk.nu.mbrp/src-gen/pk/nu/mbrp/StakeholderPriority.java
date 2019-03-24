/**
 */
package pk.nu.mbrp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stakeholder Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pk.nu.mbrp.MbrpPackage#getStakeholderPriority()
 * @model
 * @generated
 */
public enum StakeholderPriority implements Enumerator {
	/**
	 * The '<em><b>Must Have</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUST_HAVE_VALUE
	 * @generated
	 * @ordered
	 */
	MUST_HAVE(0, "MustHave", "MustHave"),

	/**
	 * The '<em><b>Should Have</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOULD_HAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SHOULD_HAVE(1, "ShouldHave", "ShouldHave"),

	/**
	 * The '<em><b>Could Have</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COULD_HAVE_VALUE
	 * @generated
	 * @ordered
	 */
	COULD_HAVE(2, "CouldHave", "CouldHave");

	/**
	 * The '<em><b>Must Have</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Must Have</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUST_HAVE
	 * @model name="MustHave"
	 * @generated
	 * @ordered
	 */
	public static final int MUST_HAVE_VALUE = 0;

	/**
	 * The '<em><b>Should Have</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Should Have</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOULD_HAVE
	 * @model name="ShouldHave"
	 * @generated
	 * @ordered
	 */
	public static final int SHOULD_HAVE_VALUE = 1;

	/**
	 * The '<em><b>Could Have</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Could Have</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COULD_HAVE
	 * @model name="CouldHave"
	 * @generated
	 * @ordered
	 */
	public static final int COULD_HAVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Stakeholder Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StakeholderPriority[] VALUES_ARRAY = new StakeholderPriority[] { MUST_HAVE, SHOULD_HAVE,
			COULD_HAVE, };

	/**
	 * A public read-only list of all the '<em><b>Stakeholder Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StakeholderPriority> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stakeholder Priority</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StakeholderPriority get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StakeholderPriority result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stakeholder Priority</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StakeholderPriority getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StakeholderPriority result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stakeholder Priority</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StakeholderPriority get(int value) {
		switch (value) {
		case MUST_HAVE_VALUE:
			return MUST_HAVE;
		case SHOULD_HAVE_VALUE:
			return SHOULD_HAVE;
		case COULD_HAVE_VALUE:
			return COULD_HAVE;
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
	private StakeholderPriority(int value, String name, String literal) {
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

} //StakeholderPriority
