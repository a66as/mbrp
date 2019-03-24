/**
 */
package pk.nu.mbrp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pk.nu.mbrp.MbrpFactory
 * @model kind="package"
 * @generated
 */
public interface MbrpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mbrp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nu.edu.pk/mbrp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mbrp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MbrpPackage eINSTANCE = pk.nu.mbrp.impl.MbrpPackageImpl.init();

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.RequirementsModelImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Owned Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Stakeholders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS = 1;

	/**
	 * The number of structural features of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.RequirementImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LINKED_RATIONALES = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MBRP_PRIORITY = 5;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RELATED_REQUIREMENTS = 6;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RISK_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COST = 8;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__BUSINESS_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.FunctionalRequirementImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__TITLE = REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES = REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY = REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS = REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__RISK_FACTOR = REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__COST = REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE = REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.NonFunctionalRequirementImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getNonFunctionalRequirement()
	 * @generated
	 */
	int NON_FUNCTIONAL_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__TITLE = REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES = REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY = REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS = REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__RISK_FACTOR = REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__COST = REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE = REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The number of structural features of the '<em>Non Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.RationaleImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.StakeholderImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Linked Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__LINKED_REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.impl.RequirementRelationshipImpl
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationship()
	 * @generated
	 */
	int REQUIREMENT_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT = 1;

	/**
	 * The number of structural features of the '<em>Requirement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Requirement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.StakeholderType
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholderType()
	 * @generated
	 */
	int STAKEHOLDER_TYPE = 7;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.RequirementRelationshipType
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationshipType()
	 * @generated
	 */
	int REQUIREMENT_RELATIONSHIP_TYPE = 8;

	/**
	 * The meta object id for the '{@link pk.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pk.nu.mbrp.StakeholderPriority
	 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholderPriority()
	 * @generated
	 */
	int STAKEHOLDER_PRIORITY = 9;

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.RequirementsModel <em>Requirements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Model</em>'.
	 * @see pk.nu.mbrp.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pk.nu.mbrp.RequirementsModel#getOwnedRequirement <em>Owned Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement</em>'.
	 * @see pk.nu.mbrp.RequirementsModel#getOwnedRequirement()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OwnedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link pk.nu.mbrp.RequirementsModel#getOwnedStakeholders <em>Owned Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Stakeholders</em>'.
	 * @see pk.nu.mbrp.RequirementsModel#getOwnedStakeholders()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OwnedStakeholders();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see pk.nu.mbrp.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pk.nu.mbrp.Requirement#getTitle()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Title();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pk.nu.mbrp.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pk.nu.mbrp.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the reference list '{@link pk.nu.mbrp.Requirement#getLinkedRationales <em>Linked Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Rationales</em>'.
	 * @see pk.nu.mbrp.Requirement#getLinkedRationales()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_LinkedRationales();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see pk.nu.mbrp.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getMbrpPriority <em>Mbrp Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mbrp Priority</em>'.
	 * @see pk.nu.mbrp.Requirement#getMbrpPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_MbrpPriority();

	/**
	 * Returns the meta object for the containment reference list '{@link pk.nu.mbrp.Requirement#getRelatedRequirements <em>Related Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Requirements</em>'.
	 * @see pk.nu.mbrp.Requirement#getRelatedRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RelatedRequirements();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getRiskFactor <em>Risk Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Factor</em>'.
	 * @see pk.nu.mbrp.Requirement#getRiskFactor()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RiskFactor();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see pk.nu.mbrp.Requirement#getCost()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Cost();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Requirement#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Value</em>'.
	 * @see pk.nu.mbrp.Requirement#getBusinessValue()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_BusinessValue();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see pk.nu.mbrp.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.NonFunctionalRequirement <em>Non Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Requirement</em>'.
	 * @see pk.nu.mbrp.NonFunctionalRequirement
	 * @generated
	 */
	EClass getNonFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see pk.nu.mbrp.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Rationale#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pk.nu.mbrp.Rationale#getDescription()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_Description();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see pk.nu.mbrp.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Stakeholder#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see pk.nu.mbrp.Stakeholder#getTitle()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Title();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.Stakeholder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pk.nu.mbrp.Stakeholder#getType()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Type();

	/**
	 * Returns the meta object for the reference list '{@link pk.nu.mbrp.Stakeholder#getLinkedRequirements <em>Linked Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Requirements</em>'.
	 * @see pk.nu.mbrp.Stakeholder#getLinkedRequirements()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_LinkedRequirements();

	/**
	 * Returns the meta object for class '{@link pk.nu.mbrp.RequirementRelationship <em>Requirement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Relationship</em>'.
	 * @see pk.nu.mbrp.RequirementRelationship
	 * @generated
	 */
	EClass getRequirementRelationship();

	/**
	 * Returns the meta object for the attribute '{@link pk.nu.mbrp.RequirementRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pk.nu.mbrp.RequirementRelationship#getType()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EAttribute getRequirementRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link pk.nu.mbrp.RequirementRelationship#getTargetRequirement <em>Target Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Requirement</em>'.
	 * @see pk.nu.mbrp.RequirementRelationship#getTargetRequirement()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EReference getRequirementRelationship_TargetRequirement();

	/**
	 * Returns the meta object for enum '{@link pk.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stakeholder Type</em>'.
	 * @see pk.nu.mbrp.StakeholderType
	 * @generated
	 */
	EEnum getStakeholderType();

	/**
	 * Returns the meta object for enum '{@link pk.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Relationship Type</em>'.
	 * @see pk.nu.mbrp.RequirementRelationshipType
	 * @generated
	 */
	EEnum getRequirementRelationshipType();

	/**
	 * Returns the meta object for enum '{@link pk.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stakeholder Priority</em>'.
	 * @see pk.nu.mbrp.StakeholderPriority
	 * @generated
	 */
	EEnum getStakeholderPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MbrpFactory getMbrpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.RequirementsModelImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Owned Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__OWNED_REQUIREMENT = eINSTANCE.getRequirementsModel_OwnedRequirement();

		/**
		 * The meta object literal for the '<em><b>Owned Stakeholders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS = eINSTANCE.getRequirementsModel_OwnedStakeholders();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.RequirementImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TITLE = eINSTANCE.getRequirement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Linked Rationales</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__LINKED_RATIONALES = eINSTANCE.getRequirement_LinkedRationales();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Mbrp Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MBRP_PRIORITY = eINSTANCE.getRequirement_MbrpPriority();

		/**
		 * The meta object literal for the '<em><b>Related Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__RELATED_REQUIREMENTS = eINSTANCE.getRequirement_RelatedRequirements();

		/**
		 * The meta object literal for the '<em><b>Risk Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__RISK_FACTOR = eINSTANCE.getRequirement_RiskFactor();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__COST = eINSTANCE.getRequirement_Cost();

		/**
		 * The meta object literal for the '<em><b>Business Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__BUSINESS_VALUE = eINSTANCE.getRequirement_BusinessValue();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.FunctionalRequirementImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.NonFunctionalRequirementImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getNonFunctionalRequirement()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_REQUIREMENT = eINSTANCE.getNonFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.RationaleImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__DESCRIPTION = eINSTANCE.getRationale_Description();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.StakeholderImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__TITLE = eINSTANCE.getStakeholder_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAKEHOLDER__TYPE = eINSTANCE.getStakeholder_Type();

		/**
		 * The meta object literal for the '<em><b>Linked Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__LINKED_REQUIREMENTS = eINSTANCE.getStakeholder_LinkedRequirements();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.impl.RequirementRelationshipImpl
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationship()
		 * @generated
		 */
		EClass REQUIREMENT_RELATIONSHIP = eINSTANCE.getRequirementRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_RELATIONSHIP__TYPE = eINSTANCE.getRequirementRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Target Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT = eINSTANCE
				.getRequirementRelationship_TargetRequirement();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.StakeholderType
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholderType()
		 * @generated
		 */
		EEnum STAKEHOLDER_TYPE = eINSTANCE.getStakeholderType();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.RequirementRelationshipType
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationshipType()
		 * @generated
		 */
		EEnum REQUIREMENT_RELATIONSHIP_TYPE = eINSTANCE.getRequirementRelationshipType();

		/**
		 * The meta object literal for the '{@link pk.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pk.nu.mbrp.StakeholderPriority
		 * @see pk.nu.mbrp.impl.MbrpPackageImpl#getStakeholderPriority()
		 * @generated
		 */
		EEnum STAKEHOLDER_PRIORITY = eINSTANCE.getStakeholderPriority();

	}

} //MbrpPackage
