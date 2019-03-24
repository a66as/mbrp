/**
 */
package se.nu.mbrp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.nu.mbrp.Requirement#getTitle <em>Title</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getLinkedRationales <em>Linked Rationales</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getMbrpPriority <em>Mbrp Priority</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getRelatedRequirements <em>Related Requirements</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getRiskFactor <em>Risk Factor</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getCost <em>Cost</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link se.nu.mbrp.Requirement#getTestcases <em>Testcases</em>}</li>
 * </ul>
 *
 * @see se.nu.mbrp.MbrpPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
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
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Linked Rationales</b></em>' reference list.
	 * The list contents are of type {@link se.nu.mbrp.Rationale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Rationales</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Rationales</em>' reference list.
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_LinkedRationales()
	 * @model
	 * @generated
	 */
	EList<Rationale> getLinkedRationales();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link se.nu.mbrp.StakeholderPriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see se.nu.mbrp.StakeholderPriority
	 * @see #setPriority(StakeholderPriority)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	StakeholderPriority getPriority();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see se.nu.mbrp.StakeholderPriority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(StakeholderPriority value);

	/**
	 * Returns the value of the '<em><b>Mbrp Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mbrp Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbrp Priority</em>' attribute.
	 * @see #setMbrpPriority(double)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_MbrpPriority()
	 * @model
	 * @generated
	 */
	double getMbrpPriority();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getMbrpPriority <em>Mbrp Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbrp Priority</em>' attribute.
	 * @see #getMbrpPriority()
	 * @generated
	 */
	void setMbrpPriority(double value);

	/**
	 * Returns the value of the '<em><b>Related Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link se.nu.mbrp.RequirementRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Requirements</em>' containment reference list.
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_RelatedRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementRelationship> getRelatedRequirements();

	/**
	 * Returns the value of the '<em><b>Risk Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Factor</em>' attribute.
	 * @see #setRiskFactor(double)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_RiskFactor()
	 * @model
	 * @generated
	 */
	double getRiskFactor();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getRiskFactor <em>Risk Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Factor</em>' attribute.
	 * @see #getRiskFactor()
	 * @generated
	 */
	void setRiskFactor(double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Cost()
	 * @model
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Business Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Value</em>' attribute.
	 * @see #setBusinessValue(double)
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_BusinessValue()
	 * @model
	 * @generated
	 */
	double getBusinessValue();

	/**
	 * Sets the value of the '{@link se.nu.mbrp.Requirement#getBusinessValue <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Value</em>' attribute.
	 * @see #getBusinessValue()
	 * @generated
	 */
	void setBusinessValue(double value);

	/**
	 * Returns the value of the '<em><b>Testcases</b></em>' reference list.
	 * The list contents are of type {@link se.nu.mbrp.TestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testcases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcases</em>' reference list.
	 * @see se.nu.mbrp.MbrpPackage#getRequirement_Testcases()
	 * @model
	 * @generated
	 */
	EList<TestCase> getTestcases();

} // Requirement
