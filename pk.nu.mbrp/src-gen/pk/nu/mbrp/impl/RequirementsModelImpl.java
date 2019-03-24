/**
 */
package pk.nu.mbrp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pk.nu.mbrp.MbrpPackage;
import pk.nu.mbrp.Requirement;
import pk.nu.mbrp.RequirementsModel;
import pk.nu.mbrp.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pk.nu.mbrp.impl.RequirementsModelImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link pk.nu.mbrp.impl.RequirementsModelImpl#getOwnedStakeholders <em>Owned Stakeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsModelImpl extends MinimalEObjectImpl.Container implements RequirementsModel {
	/**
	 * The cached value of the '{@link #getOwnedRequirement() <em>Owned Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> ownedRequirement;

	/**
	 * The cached value of the '{@link #getOwnedStakeholders() <em>Owned Stakeholders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> ownedStakeholders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MbrpPackage.Literals.REQUIREMENTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getOwnedRequirement() {
		if (ownedRequirement == null) {
			ownedRequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this,
					MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT);
		}
		return ownedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getOwnedStakeholders() {
		if (ownedStakeholders == null) {
			ownedStakeholders = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this,
					MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS);
		}
		return ownedStakeholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT:
			return ((InternalEList<?>) getOwnedRequirement()).basicRemove(otherEnd, msgs);
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS:
			return ((InternalEList<?>) getOwnedStakeholders()).basicRemove(otherEnd, msgs);
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
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT:
			return getOwnedRequirement();
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS:
			return getOwnedStakeholders();
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
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT:
			getOwnedRequirement().clear();
			getOwnedRequirement().addAll((Collection<? extends Requirement>) newValue);
			return;
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS:
			getOwnedStakeholders().clear();
			getOwnedStakeholders().addAll((Collection<? extends Stakeholder>) newValue);
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
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT:
			getOwnedRequirement().clear();
			return;
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS:
			getOwnedStakeholders().clear();
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
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_REQUIREMENT:
			return ownedRequirement != null && !ownedRequirement.isEmpty();
		case MbrpPackage.REQUIREMENTS_MODEL__OWNED_STAKEHOLDERS:
			return ownedStakeholders != null && !ownedStakeholders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsModelImpl
