/**
 */
package pk.nu.mbrp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pk.nu.mbrp.RequirementsModel#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link pk.nu.mbrp.RequirementsModel#getOwnedStakeholders <em>Owned Stakeholders</em>}</li>
 * </ul>
 *
 * @see pk.nu.mbrp.MbrpPackage#getRequirementsModel()
 * @model
 * @generated
 */
public interface RequirementsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link pk.nu.mbrp.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' containment reference list.
	 * @see pk.nu.mbrp.MbrpPackage#getRequirementsModel_OwnedRequirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getOwnedRequirement();

	/**
	 * Returns the value of the '<em><b>Owned Stakeholders</b></em>' containment reference list.
	 * The list contents are of type {@link pk.nu.mbrp.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stakeholders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stakeholders</em>' containment reference list.
	 * @see pk.nu.mbrp.MbrpPackage#getRequirementsModel_OwnedStakeholders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stakeholder> getOwnedStakeholders();

} // RequirementsModel
