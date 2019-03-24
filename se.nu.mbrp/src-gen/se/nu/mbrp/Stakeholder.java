/**
 */
package se.nu.mbrp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.nu.mbrp.Stakeholder#getTitle <em>Title</em>}</li>
 *   <li>{@link se.nu.mbrp.Stakeholder#getType <em>Type</em>}</li>
 *   <li>{@link se.nu.mbrp.Stakeholder#getLinkedRequirements <em>Linked Requirements</em>}</li>
 * </ul>
 *
 * @see se.nu.mbrp.MbrpPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see se.nu.mbrp.MbrpPackage#getStakeholder_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Stakeholder#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Primary"</code>.
	 * The literals are from the enumeration {@link se.nu.mbrp.StakeholderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.nu.mbrp.StakeholderType
	 * @see #setType(StakeholderType)
	 * @see se.nu.mbrp.MbrpPackage#getStakeholder_Type()
	 * @model default="Primary"
	 * @generated
	 */
	StakeholderType getType();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Stakeholder#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.nu.mbrp.StakeholderType
	 * @see #getType()
	 * @generated
	 */
	void setType(StakeholderType value);

	/**
	 * Returns the value of the '<em><b>Linked Requirements</b></em>' reference list.
	 * The list contents are of type {@link se.nu.mbrp.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Requirements</em>' reference list.
	 * @see se.nu.mbrp.MbrpPackage#getStakeholder_LinkedRequirements()
	 * @model
	 * @generated
	 */
	EList<Requirement> getLinkedRequirements();

} // Stakeholder
