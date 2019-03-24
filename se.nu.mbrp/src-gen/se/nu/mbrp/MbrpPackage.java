/**
 */
package se.nu.mbrp;

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
 * @see se.nu.mbrp.MbrpFactory
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
	MbrpPackage eINSTANCE = se.nu.mbrp.impl.MbrpPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.RequirementsModelImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementsModel()
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
	 * The feature id for the '<em><b>Testcases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__TESTCASES = 2;

	/**
	 * The number of structural features of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirements Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.RequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirement()
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
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TESTCASES = 10;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.FunctionalRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getFunctionalRequirement()
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
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__TESTCASES = REQUIREMENT__TESTCASES;

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
	 * The meta object id for the '{@link se.nu.mbrp.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.NonFunctionalRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getNonFunctionalRequirement()
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
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__TESTCASES = REQUIREMENT__TESTCASES;

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
	 * The meta object id for the '{@link se.nu.mbrp.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.RationaleImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRationale()
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
	 * The meta object id for the '{@link se.nu.mbrp.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.StakeholderImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholder()
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
	 * The meta object id for the '{@link se.nu.mbrp.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.RequirementRelationshipImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationship()
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
	 * The meta object id for the '{@link se.nu.mbrp.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.SecurityRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__TITLE = NON_FUNCTIONAL_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__DESCRIPTION = NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__ID = NON_FUNCTIONAL_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__LINKED_RATIONALES = NON_FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__PRIORITY = NON_FUNCTIONAL_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__MBRP_PRIORITY = NON_FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__RELATED_REQUIREMENTS = NON_FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__RISK_FACTOR = NON_FUNCTIONAL_REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__COST = NON_FUNCTIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__BUSINESS_VALUE = NON_FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__TESTCASES = NON_FUNCTIONAL_REQUIREMENT__TESTCASES;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.PerformanceRequirementImpl <em>Performance Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.PerformanceRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getPerformanceRequirement()
	 * @generated
	 */
	int PERFORMANCE_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__TITLE = NON_FUNCTIONAL_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__DESCRIPTION = NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__ID = NON_FUNCTIONAL_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__LINKED_RATIONALES = NON_FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__PRIORITY = NON_FUNCTIONAL_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__MBRP_PRIORITY = NON_FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__RELATED_REQUIREMENTS = NON_FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__RISK_FACTOR = NON_FUNCTIONAL_REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__COST = NON_FUNCTIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__BUSINESS_VALUE = NON_FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT__TESTCASES = NON_FUNCTIONAL_REQUIREMENT__TESTCASES;

	/**
	 * The number of structural features of the '<em>Performance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT_FEATURE_COUNT = NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Performance Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_REQUIREMENT_OPERATION_COUNT = NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.SafetyRequirementImpl <em>Safety Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.SafetyRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getSafetyRequirement()
	 * @generated
	 */
	int SAFETY_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__TITLE = NON_FUNCTIONAL_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__DESCRIPTION = NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__ID = NON_FUNCTIONAL_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__LINKED_RATIONALES = NON_FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__PRIORITY = NON_FUNCTIONAL_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__MBRP_PRIORITY = NON_FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__RELATED_REQUIREMENTS = NON_FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__RISK_FACTOR = NON_FUNCTIONAL_REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__COST = NON_FUNCTIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__BUSINESS_VALUE = NON_FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT__TESTCASES = NON_FUNCTIONAL_REQUIREMENT__TESTCASES;

	/**
	 * The number of structural features of the '<em>Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT_FEATURE_COUNT = NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_REQUIREMENT_OPERATION_COUNT = NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.RobustnessRequirementImpl <em>Robustness Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.RobustnessRequirementImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRobustnessRequirement()
	 * @generated
	 */
	int ROBUSTNESS_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__TITLE = NON_FUNCTIONAL_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__DESCRIPTION = NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__ID = NON_FUNCTIONAL_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Linked Rationales</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__LINKED_RATIONALES = NON_FUNCTIONAL_REQUIREMENT__LINKED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__PRIORITY = NON_FUNCTIONAL_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__MBRP_PRIORITY = NON_FUNCTIONAL_REQUIREMENT__MBRP_PRIORITY;

	/**
	 * The feature id for the '<em><b>Related Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__RELATED_REQUIREMENTS = NON_FUNCTIONAL_REQUIREMENT__RELATED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__RISK_FACTOR = NON_FUNCTIONAL_REQUIREMENT__RISK_FACTOR;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__COST = NON_FUNCTIONAL_REQUIREMENT__COST;

	/**
	 * The feature id for the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__BUSINESS_VALUE = NON_FUNCTIONAL_REQUIREMENT__BUSINESS_VALUE;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT__TESTCASES = NON_FUNCTIONAL_REQUIREMENT__TESTCASES;

	/**
	 * The number of structural features of the '<em>Robustness Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT_FEATURE_COUNT = NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robustness Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUSTNESS_REQUIREMENT_OPERATION_COUNT = NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.impl.TestCaseImpl
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.StakeholderType
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholderType()
	 * @generated
	 */
	int STAKEHOLDER_TYPE = 12;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.RequirementRelationshipType
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationshipType()
	 * @generated
	 */
	int REQUIREMENT_RELATIONSHIP_TYPE = 13;

	/**
	 * The meta object id for the '{@link se.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.nu.mbrp.StakeholderPriority
	 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholderPriority()
	 * @generated
	 */
	int STAKEHOLDER_PRIORITY = 14;

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.RequirementsModel <em>Requirements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Model</em>'.
	 * @see se.nu.mbrp.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the containment reference list '{@link se.nu.mbrp.RequirementsModel#getOwnedRequirement <em>Owned Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement</em>'.
	 * @see se.nu.mbrp.RequirementsModel#getOwnedRequirement()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OwnedRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link se.nu.mbrp.RequirementsModel#getOwnedStakeholders <em>Owned Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Stakeholders</em>'.
	 * @see se.nu.mbrp.RequirementsModel#getOwnedStakeholders()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_OwnedStakeholders();

	/**
	 * Returns the meta object for the containment reference list '{@link se.nu.mbrp.RequirementsModel#getTestcases <em>Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcases</em>'.
	 * @see se.nu.mbrp.RequirementsModel#getTestcases()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Testcases();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see se.nu.mbrp.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see se.nu.mbrp.Requirement#getTitle()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Title();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.nu.mbrp.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see se.nu.mbrp.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the reference list '{@link se.nu.mbrp.Requirement#getLinkedRationales <em>Linked Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Rationales</em>'.
	 * @see se.nu.mbrp.Requirement#getLinkedRationales()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_LinkedRationales();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see se.nu.mbrp.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getMbrpPriority <em>Mbrp Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mbrp Priority</em>'.
	 * @see se.nu.mbrp.Requirement#getMbrpPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_MbrpPriority();

	/**
	 * Returns the meta object for the containment reference list '{@link se.nu.mbrp.Requirement#getRelatedRequirements <em>Related Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Requirements</em>'.
	 * @see se.nu.mbrp.Requirement#getRelatedRequirements()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RelatedRequirements();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getRiskFactor <em>Risk Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Factor</em>'.
	 * @see se.nu.mbrp.Requirement#getRiskFactor()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RiskFactor();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see se.nu.mbrp.Requirement#getCost()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Cost();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Requirement#getBusinessValue <em>Business Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Value</em>'.
	 * @see se.nu.mbrp.Requirement#getBusinessValue()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_BusinessValue();

	/**
	 * Returns the meta object for the reference list '{@link se.nu.mbrp.Requirement#getTestcases <em>Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testcases</em>'.
	 * @see se.nu.mbrp.Requirement#getTestcases()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Testcases();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see se.nu.mbrp.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.NonFunctionalRequirement <em>Non Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Requirement</em>'.
	 * @see se.nu.mbrp.NonFunctionalRequirement
	 * @generated
	 */
	EClass getNonFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see se.nu.mbrp.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Rationale#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.nu.mbrp.Rationale#getDescription()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_Description();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see se.nu.mbrp.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Stakeholder#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see se.nu.mbrp.Stakeholder#getTitle()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Title();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.Stakeholder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.nu.mbrp.Stakeholder#getType()
	 * @see #getStakeholder()
	 * @generated
	 */
	EAttribute getStakeholder_Type();

	/**
	 * Returns the meta object for the reference list '{@link se.nu.mbrp.Stakeholder#getLinkedRequirements <em>Linked Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Requirements</em>'.
	 * @see se.nu.mbrp.Stakeholder#getLinkedRequirements()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_LinkedRequirements();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.RequirementRelationship <em>Requirement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Relationship</em>'.
	 * @see se.nu.mbrp.RequirementRelationship
	 * @generated
	 */
	EClass getRequirementRelationship();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.RequirementRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.nu.mbrp.RequirementRelationship#getType()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EAttribute getRequirementRelationship_Type();

	/**
	 * Returns the meta object for the reference '{@link se.nu.mbrp.RequirementRelationship#getTargetRequirement <em>Target Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Requirement</em>'.
	 * @see se.nu.mbrp.RequirementRelationship#getTargetRequirement()
	 * @see #getRequirementRelationship()
	 * @generated
	 */
	EReference getRequirementRelationship_TargetRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see se.nu.mbrp.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.PerformanceRequirement <em>Performance Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Requirement</em>'.
	 * @see se.nu.mbrp.PerformanceRequirement
	 * @generated
	 */
	EClass getPerformanceRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.SafetyRequirement <em>Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Requirement</em>'.
	 * @see se.nu.mbrp.SafetyRequirement
	 * @generated
	 */
	EClass getSafetyRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.RobustnessRequirement <em>Robustness Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robustness Requirement</em>'.
	 * @see se.nu.mbrp.RobustnessRequirement
	 * @generated
	 */
	EClass getRobustnessRequirement();

	/**
	 * Returns the meta object for class '{@link se.nu.mbrp.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see se.nu.mbrp.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.TestCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see se.nu.mbrp.TestCase#getId()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Id();

	/**
	 * Returns the meta object for the attribute '{@link se.nu.mbrp.TestCase#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see se.nu.mbrp.TestCase#getPriority()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Priority();

	/**
	 * Returns the meta object for enum '{@link se.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stakeholder Type</em>'.
	 * @see se.nu.mbrp.StakeholderType
	 * @generated
	 */
	EEnum getStakeholderType();

	/**
	 * Returns the meta object for enum '{@link se.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Relationship Type</em>'.
	 * @see se.nu.mbrp.RequirementRelationshipType
	 * @generated
	 */
	EEnum getRequirementRelationshipType();

	/**
	 * Returns the meta object for enum '{@link se.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stakeholder Priority</em>'.
	 * @see se.nu.mbrp.StakeholderPriority
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
		 * The meta object literal for the '{@link se.nu.mbrp.impl.RequirementsModelImpl <em>Requirements Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.RequirementsModelImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementsModel()
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
		 * The meta object literal for the '<em><b>Testcases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__TESTCASES = eINSTANCE.getRequirementsModel_Testcases();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.RequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirement()
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
		 * The meta object literal for the '<em><b>Testcases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__TESTCASES = eINSTANCE.getRequirement_Testcases();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.FunctionalRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.NonFunctionalRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getNonFunctionalRequirement()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_REQUIREMENT = eINSTANCE.getNonFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.RationaleImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRationale()
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
		 * The meta object literal for the '{@link se.nu.mbrp.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.StakeholderImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholder()
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
		 * The meta object literal for the '{@link se.nu.mbrp.impl.RequirementRelationshipImpl <em>Requirement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.RequirementRelationshipImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationship()
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
		 * The meta object literal for the '{@link se.nu.mbrp.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.SecurityRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.PerformanceRequirementImpl <em>Performance Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.PerformanceRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getPerformanceRequirement()
		 * @generated
		 */
		EClass PERFORMANCE_REQUIREMENT = eINSTANCE.getPerformanceRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.SafetyRequirementImpl <em>Safety Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.SafetyRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getSafetyRequirement()
		 * @generated
		 */
		EClass SAFETY_REQUIREMENT = eINSTANCE.getSafetyRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.RobustnessRequirementImpl <em>Robustness Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.RobustnessRequirementImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRobustnessRequirement()
		 * @generated
		 */
		EClass ROBUSTNESS_REQUIREMENT = eINSTANCE.getRobustnessRequirement();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.impl.TestCaseImpl
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ID = eINSTANCE.getTestCase_Id();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__PRIORITY = eINSTANCE.getTestCase_Priority();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.StakeholderType <em>Stakeholder Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.StakeholderType
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholderType()
		 * @generated
		 */
		EEnum STAKEHOLDER_TYPE = eINSTANCE.getStakeholderType();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.RequirementRelationshipType <em>Requirement Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.RequirementRelationshipType
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getRequirementRelationshipType()
		 * @generated
		 */
		EEnum REQUIREMENT_RELATIONSHIP_TYPE = eINSTANCE.getRequirementRelationshipType();

		/**
		 * The meta object literal for the '{@link se.nu.mbrp.StakeholderPriority <em>Stakeholder Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.nu.mbrp.StakeholderPriority
		 * @see se.nu.mbrp.impl.MbrpPackageImpl#getStakeholderPriority()
		 * @generated
		 */
		EEnum STAKEHOLDER_PRIORITY = eINSTANCE.getStakeholderPriority();

	}

} //MbrpPackage
