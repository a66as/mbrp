/**
 */
package se.nu.mbrp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.nu.mbrp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MbrpFactoryImpl extends EFactoryImpl implements MbrpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MbrpFactory init() {
		try {
			MbrpFactory theMbrpFactory = (MbrpFactory) EPackage.Registry.INSTANCE.getEFactory(MbrpPackage.eNS_URI);
			if (theMbrpFactory != null) {
				return theMbrpFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MbrpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MbrpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MbrpPackage.REQUIREMENTS_MODEL:
			return createRequirementsModel();
		case MbrpPackage.FUNCTIONAL_REQUIREMENT:
			return createFunctionalRequirement();
		case MbrpPackage.RATIONALE:
			return createRationale();
		case MbrpPackage.STAKEHOLDER:
			return createStakeholder();
		case MbrpPackage.REQUIREMENT_RELATIONSHIP:
			return createRequirementRelationship();
		case MbrpPackage.SECURITY_REQUIREMENT:
			return createSecurityRequirement();
		case MbrpPackage.PERFORMANCE_REQUIREMENT:
			return createPerformanceRequirement();
		case MbrpPackage.SAFETY_REQUIREMENT:
			return createSafetyRequirement();
		case MbrpPackage.ROBUSTNESS_REQUIREMENT:
			return createRobustnessRequirement();
		case MbrpPackage.TEST_CASE:
			return createTestCase();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MbrpPackage.STAKEHOLDER_TYPE:
			return createStakeholderTypeFromString(eDataType, initialValue);
		case MbrpPackage.REQUIREMENT_RELATIONSHIP_TYPE:
			return createRequirementRelationshipTypeFromString(eDataType, initialValue);
		case MbrpPackage.STAKEHOLDER_PRIORITY:
			return createStakeholderPriorityFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MbrpPackage.STAKEHOLDER_TYPE:
			return convertStakeholderTypeToString(eDataType, instanceValue);
		case MbrpPackage.REQUIREMENT_RELATIONSHIP_TYPE:
			return convertRequirementRelationshipTypeToString(eDataType, instanceValue);
		case MbrpPackage.STAKEHOLDER_PRIORITY:
			return convertStakeholderPriorityToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModel createRequirementsModel() {
		RequirementsModelImpl requirementsModel = new RequirementsModelImpl();
		return requirementsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementRelationship createRequirementRelationship() {
		RequirementRelationshipImpl requirementRelationship = new RequirementRelationshipImpl();
		return requirementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceRequirement createPerformanceRequirement() {
		PerformanceRequirementImpl performanceRequirement = new PerformanceRequirementImpl();
		return performanceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyRequirement createSafetyRequirement() {
		SafetyRequirementImpl safetyRequirement = new SafetyRequirementImpl();
		return safetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobustnessRequirement createRobustnessRequirement() {
		RobustnessRequirementImpl robustnessRequirement = new RobustnessRequirementImpl();
		return robustnessRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderType createStakeholderTypeFromString(EDataType eDataType, String initialValue) {
		StakeholderType result = StakeholderType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStakeholderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementRelationshipType createRequirementRelationshipTypeFromString(EDataType eDataType,
			String initialValue) {
		RequirementRelationshipType result = RequirementRelationshipType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderPriority createStakeholderPriorityFromString(EDataType eDataType, String initialValue) {
		StakeholderPriority result = StakeholderPriority.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStakeholderPriorityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MbrpPackage getMbrpPackage() {
		return (MbrpPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MbrpPackage getPackage() {
		return MbrpPackage.eINSTANCE;
	}

} //MbrpFactoryImpl
