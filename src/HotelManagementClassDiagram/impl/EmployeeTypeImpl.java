/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.EType;
import HotelManagementClassDiagram.EmployeeType;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.EmployeeTypeImpl#getAcessLevel <em>Acess Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeTypeImpl extends MinimalEObjectImpl.Container implements EmployeeType {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EType TYPE_EDEFAULT = EType.RECEPTIONIST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcessLevel() <em>Acess Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ACESS_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAcessLevel() <em>Acess Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcessLevel()
	 * @generated
	 * @ordered
	 */
	protected int acessLevel = ACESS_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeTypeImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public EmployeeTypeImpl(EType type, int accessLevel){
		this.acessLevel = accessLevel;
		this.type = type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.EMPLOYEE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EType newType) {
		EType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAcessLevel() {
		return acessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcessLevel(int newAcessLevel) {
		int oldAcessLevel = acessLevel;
		acessLevel = newAcessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__ACESS_LEVEL, oldAcessLevel, acessLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__TYPE:
				return getType();
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__ACESS_LEVEL:
				return getAcessLevel();
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
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__TYPE:
				setType((EType)newValue);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__ACESS_LEVEL:
				setAcessLevel((Integer)newValue);
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
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__ACESS_LEVEL:
				setAcessLevel(ACESS_LEVEL_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case HotelManagementClassDiagramPackage.EMPLOYEE_TYPE__ACESS_LEVEL:
				return acessLevel != ACESS_LEVEL_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", acessLevel: ");
		result.append(acessLevel);
		result.append(')');
		return result.toString();
	}

} //EmployeeTypeImpl
