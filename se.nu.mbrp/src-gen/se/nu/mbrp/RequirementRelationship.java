/**
 */
package se.nu.mbrp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.nu.mbrp.RequirementRelationship#getType <em>Type</em>}</li>
 *   <li>{@link se.nu.mbrp.RequirementRelationship#getTargetRequirement <em>Target Requirement</em>}</li>
 * </ul>
 *
 * @see se.nu.mbrp.MbrpPackage#getRequirementRelationship()
 * @model
 * @generated
 */
public interface RequirementRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Depends"</code>.
	 * The literals are from the enumeration {@link se.nu.mbrp.RequirementRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.nu.mbrp.RequirementRelationshipType
	 * @see #setType(RequirementRelationshipType)
	 * @see se.nu.mbrp.MbrpPackage#getRequirementRelationship_Type()
	 * @model default="Depends"
	 * @generated
	 */
	RequirementRelationshipType getType();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.RequirementRelationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.nu.mbrp.RequirementRelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RequirementRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Target Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Requirement</em>' reference.
	 * @see #setTargetRequirement(Requirement)
	 * @see se.nu.mbrp.MbrpPackage#getRequirementRelationship_TargetRequirement()
	 * @model required="true"
	 * @generated
	 */
	Requirement getTargetRequirement();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.RequirementRelationship#getTargetRequirement <em>Target Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Requirement</em>' reference.
	 * @see #getTargetRequirement()
	 * @generated
	 */
	void setTargetRequirement(Requirement value);

} // RequirementRelationship
