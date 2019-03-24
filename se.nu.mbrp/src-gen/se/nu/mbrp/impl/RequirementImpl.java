/**
 */
package se.nu.mbrp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.nu.mbrp.MbrpPackage;
import se.nu.mbrp.Rationale;
import se.nu.mbrp.Requirement;
import se.nu.mbrp.RequirementRelationship;
import se.nu.mbrp.StakeholderPriority;
import se.nu.mbrp.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getLinkedRationales <em>Linked Rationales</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getMbrpPriority <em>Mbrp Priority</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getRelatedRequirements <em>Related Requirements</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getRiskFactor <em>Risk Factor</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getBusinessValue <em>Business Value</em>}</li>
 *   <li>{@link se.nu.mbrp.impl.RequirementImpl#getTestcases <em>Testcases</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedRationales() <em>Linked Rationales</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedRationales()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> linkedRationales;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final StakeholderPriority PRIORITY_EDEFAULT = StakeholderPriority.MUST_HAVE;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected StakeholderPriority priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMbrpPriority() <em>Mbrp Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbrpPriority()
	 * @generated
	 * @ordered
	 */
	protected static final double MBRP_PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMbrpPriority() <em>Mbrp Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbrpPriority()
	 * @generated
	 * @ordered
	 */
	protected double mbrpPriority = MBRP_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedRequirements() <em>Related Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRelationship> relatedRequirements;

	/**
	 * The default value of the '{@link #getRiskFactor() <em>Risk Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double RISK_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRiskFactor() <em>Risk Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskFactor()
	 * @generated
	 * @ordered
	 */
	protected double riskFactor = RISK_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusinessValue() <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected static final double BUSINESS_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBusinessValue() <em>Business Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessValue()
	 * @generated
	 * @ordered
	 */
	protected double businessValue = BUSINESS_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestcases() <em>Testcases</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testcases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MbrpPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getLinkedRationales() {
		if (linkedRationales == null) {
			linkedRationales = new EObjectResolvingEList<Rationale>(Rationale.class, this,
					MbrpPackage.REQUIREMENT__LINKED_RATIONALES);
		}
		return linkedRationales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderPriority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(StakeholderPriority newPriority) {
		StakeholderPriority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__PRIORITY, oldPriority,
					priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMbrpPriority() {
		return mbrpPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMbrpPriority(double newMbrpPriority) {
		double oldMbrpPriority = mbrpPriority;
		mbrpPriority = newMbrpPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__MBRP_PRIORITY,
					oldMbrpPriority, mbrpPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementRelationship> getRelatedRequirements() {
		if (relatedRequirements == null) {
			relatedRequirements = new EObjectContainmentEList<RequirementRelationship>(RequirementRelationship.class,
					this, MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS);
		}
		return relatedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRiskFactor() {
		return riskFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskFactor(double newRiskFactor) {
		double oldRiskFactor = riskFactor;
		riskFactor = newRiskFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__RISK_FACTOR, oldRiskFactor,
					riskFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBusinessValue() {
		return businessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessValue(double newBusinessValue) {
		double oldBusinessValue = businessValue;
		businessValue = newBusinessValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT__BUSINESS_VALUE,
					oldBusinessValue, businessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestcases() {
		if (testcases == null) {
			testcases = new EObjectResolvingEList<TestCase>(TestCase.class, this, MbrpPackage.REQUIREMENT__TESTCASES);
		}
		return testcases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS:
			return ((InternalEList<?>) getRelatedRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT__TITLE:
			return getTitle();
		case MbrpPackage.REQUIREMENT__DESCRIPTION:
			return getDescription();
		case MbrpPackage.REQUIREMENT__ID:
			return getId();
		case MbrpPackage.REQUIREMENT__LINKED_RATIONALES:
			return getLinkedRationales();
		case MbrpPackage.REQUIREMENT__PRIORITY:
			return getPriority();
		case MbrpPackage.REQUIREMENT__MBRP_PRIORITY:
			return getMbrpPriority();
		case MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS:
			return getRelatedRequirements();
		case MbrpPackage.REQUIREMENT__RISK_FACTOR:
			return getRiskFactor();
		case MbrpPackage.REQUIREMENT__COST:
			return getCost();
		case MbrpPackage.REQUIREMENT__BUSINESS_VALUE:
			return getBusinessValue();
		case MbrpPackage.REQUIREMENT__TESTCASES:
			return getTestcases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT__TITLE:
			setTitle((String) newValue);
			return;
		case MbrpPackage.REQUIREMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MbrpPackage.REQUIREMENT__ID:
			setId((String) newValue);
			return;
		case MbrpPackage.REQUIREMENT__LINKED_RATIONALES:
			getLinkedRationales().clear();
			getLinkedRationales().addAll((Collection<? extends Rationale>) newValue);
			return;
		case MbrpPackage.REQUIREMENT__PRIORITY:
			setPriority((StakeholderPriority) newValue);
			return;
		case MbrpPackage.REQUIREMENT__MBRP_PRIORITY:
			setMbrpPriority((Double) newValue);
			return;
		case MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS:
			getRelatedRequirements().clear();
			getRelatedRequirements().addAll((Collection<? extends RequirementRelationship>) newValue);
			return;
		case MbrpPackage.REQUIREMENT__RISK_FACTOR:
			setRiskFactor((Double) newValue);
			return;
		case MbrpPackage.REQUIREMENT__COST:
			setCost((Double) newValue);
			return;
		case MbrpPackage.REQUIREMENT__BUSINESS_VALUE:
			setBusinessValue((Double) newValue);
			return;
		case MbrpPackage.REQUIREMENT__TESTCASES:
			getTestcases().clear();
			getTestcases().addAll((Collection<? extends TestCase>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__LINKED_RATIONALES:
			getLinkedRationales().clear();
			return;
		case MbrpPackage.REQUIREMENT__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__MBRP_PRIORITY:
			setMbrpPriority(MBRP_PRIORITY_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS:
			getRelatedRequirements().clear();
			return;
		case MbrpPackage.REQUIREMENT__RISK_FACTOR:
			setRiskFactor(RISK_FACTOR_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__COST:
			setCost(COST_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__BUSINESS_VALUE:
			setBusinessValue(BUSINESS_VALUE_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT__TESTCASES:
			getTestcases().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case MbrpPackage.REQUIREMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MbrpPackage.REQUIREMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MbrpPackage.REQUIREMENT__LINKED_RATIONALES:
			return linkedRationales != null && !linkedRationales.isEmpty();
		case MbrpPackage.REQUIREMENT__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case MbrpPackage.REQUIREMENT__MBRP_PRIORITY:
			return mbrpPriority != MBRP_PRIORITY_EDEFAULT;
		case MbrpPackage.REQUIREMENT__RELATED_REQUIREMENTS:
			return relatedRequirements != null && !relatedRequirements.isEmpty();
		case MbrpPackage.REQUIREMENT__RISK_FACTOR:
			return riskFactor != RISK_FACTOR_EDEFAULT;
		case MbrpPackage.REQUIREMENT__COST:
			return cost != COST_EDEFAULT;
		case MbrpPackage.REQUIREMENT__BUSINESS_VALUE:
			return businessValue != BUSINESS_VALUE_EDEFAULT;
		case MbrpPackage.REQUIREMENT__TESTCASES:
			return testcases != null && !testcases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", id: ");
		result.append(id);
		result.append(", priority: ");
		result.append(priority);
		result.append(", mbrpPriority: ");
		result.append(mbrpPriority);
		result.append(", riskFactor: ");
		result.append(riskFactor);
		result.append(", cost: ");
		result.append(cost);
		result.append(", businessValue: ");
		result.append(businessValue);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
