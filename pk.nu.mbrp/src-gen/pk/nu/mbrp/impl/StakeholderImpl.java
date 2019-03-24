/**
 */
package pk.nu.mbrp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pk.nu.mbrp.MbrpPackage;
import pk.nu.mbrp.Requirement;
import pk.nu.mbrp.Stakeholder;
import pk.nu.mbrp.StakeholderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pk.nu.mbrp.impl.StakeholderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link pk.nu.mbrp.impl.StakeholderImpl#getType <em>Type</em>}</li>
 *   <li>{@link pk.nu.mbrp.impl.StakeholderImpl#getLinkedRequirements <em>Linked Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends MinimalEObjectImpl.Container implements Stakeholder {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StakeholderType TYPE_EDEFAULT = StakeholderType.PRIMARY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StakeholderType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedRequirements() <em>Linked Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> linkedRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MbrpPackage.Literals.STAKEHOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.STAKEHOLDER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeholderType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StakeholderType newType) {
		StakeholderType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MbrpPackage.STAKEHOLDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getLinkedRequirements() {
		if (linkedRequirements == null) {
			linkedRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this,
					MbrpPackage.STAKEHOLDER__LINKED_REQUIREMENTS);
		}
		return linkedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MbrpPackage.STAKEHOLDER__TITLE:
			return getTitle();
		case MbrpPackage.STAKEHOLDER__TYPE:
			return getType();
		case MbrpPackage.STAKEHOLDER__LINKED_REQUIREMENTS:
			return getLinkedRequirements();
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
		case MbrpPackage.STAKEHOLDER__TITLE:
			setTitle((String) newValue);
			return;
		case MbrpPackage.STAKEHOLDER__TYPE:
			setType((StakeholderType) newValue);
			return;
		case MbrpPackage.STAKEHOLDER__LINKED_REQUIREMENTS:
			getLinkedRequirements().clear();
			getLinkedRequirements().addAll((Collection<? extends Requirement>) newValue);
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
		case MbrpPackage.STAKEHOLDER__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case MbrpPackage.STAKEHOLDER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MbrpPackage.STAKEHOLDER__LINKED_REQUIREMENTS:
			getLinkedRequirements().clear();
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
		case MbrpPackage.STAKEHOLDER__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case MbrpPackage.STAKEHOLDER__TYPE:
			return type != TYPE_EDEFAULT;
		case MbrpPackage.STAKEHOLDER__LINKED_REQUIREMENTS:
			return linkedRequirements != null && !linkedRequirements.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StakeholderImpl
