/**
 */
package se.nu.mbrp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see se.nu.mbrp.MbrpPackage#getRequirementRelationshipType()
 * @model
 * @generated
 */
public enum RequirementRelationshipType implements Enumerator {
	/**
	 * The '<em><b>Depends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDS(0, "Depends", "Depends"),

	/**
	 * The '<em><b>Derives</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVES_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVES(1, "Derives", "Derives"),

	/**
	 * The '<em><b>Refines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFINES_VALUE
	 * @generated
	 * @ordered
	 */
	REFINES(2, "Refines", "Refines"),

	/**
	 * The '<em><b>Conflicts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICTS(3, "Conflicts", "Conflicts"),

	/**
	 * The '<em><b>Realizes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALIZES_VALUE
	 * @generated
	 * @ordered
	 */
	REALIZES(4, "Realizes", "Realizes");

	/**
	 * The '<em><b>Depends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depends</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDS
	 * @model name="Depends"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDS_VALUE = 0;

	/**
	 * The '<em><b>Derives</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derives</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVES
	 * @model name="Derives"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVES_VALUE = 1;

	/**
	 * The '<em><b>Refines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Refines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFINES
	 * @model name="Refines"
	 * @generated
	 * @ordered
	 */
	public static final int REFINES_VALUE = 2;

	/**
	 * The '<em><b>Conflicts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conflicts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICTS
	 * @model name="Conflicts"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICTS_VALUE = 3;

	/**
	 * The '<em><b>Realizes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realizes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALIZES
	 * @model name="Realizes"
	 * @generated
	 * @ordered
	 */
	public static final int REALIZES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Requirement Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementRelationshipType[] VALUES_ARRAY = new RequirementRelationshipType[] { DEPENDS,
			DERIVES, REFINES, CONFLICTS, REALIZES, };

	/**
	 * A public read-only list of all the '<em><b>Requirement Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementRelationshipType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementRelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementRelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementRelationshipType get(int value) {
		switch (value) {
		case DEPENDS_VALUE:
			return DEPENDS;
		case DERIVES_VALUE:
			return DERIVES;
		case REFINES_VALUE:
			return REFINES;
		case CONFLICTS_VALUE:
			return CONFLICTS;
		case REALIZES_VALUE:
			return REALIZES;
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
	private RequirementRelationshipType(int value, String name, String literal) {
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

} //RequirementRelationshipType
