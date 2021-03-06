/**
 */
package pk.nu.mbrp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pk.nu.mbrp.MbrpPackage
 * @generated
 */
public interface MbrpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MbrpFactory eINSTANCE = pk.nu.mbrp.impl.MbrpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirements Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Model</em>'.
	 * @generated
	 */
	RequirementsModel createRequirementsModel();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Non Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Functional Requirement</em>'.
	 * @generated
	 */
	NonFunctionalRequirement createNonFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rationale</em>'.
	 * @generated
	 */
	Rationale createRationale();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Requirement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Relationship</em>'.
	 * @generated
	 */
	RequirementRelationship createRequirementRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MbrpPackage getMbrpPackage();

} //MbrpFactory
