/**
 */
package pk.nu.mbrp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pk.nu.mbrp.MbrpPackage;
import pk.nu.mbrp.Requirement;
import pk.nu.mbrp.RequirementRelationship;
import pk.nu.mbrp.RequirementRelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pk.nu.mbrp.impl.RequirementRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link pk.nu.mbrp.impl.RequirementRelationshipImpl#getTargetRequirement <em>Target Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementRelationshipImpl extends MinimalEObjectImpl.Container implements RequirementRelationship {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementRelationshipType TYPE_EDEFAULT = RequirementRelationshipType.DEPENDS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RequirementRelationshipType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetRequirement() <em>Target Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement targetRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MbrpPackage.Literals.REQUIREMENT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementRelationshipType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RequirementRelationshipType newType) {
		RequirementRelationshipType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.REQUIREMENT_RELATIONSHIP__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getTargetRequirement() {
		if (targetRequirement != null && targetRequirement.eIsProxy()) {
			InternalEObject oldTargetRequirement = (InternalEObject) targetRequirement;
			targetRequirement = (Requirement) eResolveProxy(oldTargetRequirement);
			if (targetRequirement != oldTargetRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT, oldTargetRequirement,
							targetRequirement));
			}
		}
		return targetRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetTargetRequirement() {
		return targetRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRequirement(Requirement newTargetRequirement) {
		Requirement oldTargetRequirement = targetRequirement;
		targetRequirement = newTargetRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT, oldTargetRequirement, targetRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TYPE:
			return getType();
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT:
			if (resolve)
				return getTargetRequirement();
			return basicGetTargetRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TYPE:
			setType((RequirementRelationshipType) newValue);
			return;
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT:
			setTargetRequirement((Requirement) newValue);
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
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT:
			setTargetRequirement((Requirement) null);
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
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TYPE:
			return type != TYPE_EDEFAULT;
		case MbrpPackage.REQUIREMENT_RELATIONSHIP__TARGET_REQUIREMENT:
			return targetRequirement != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RequirementRelationshipImpl
