/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Customer;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getCustomerID <em>Customer ID</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getBonusPoints <em>Bonus Points</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getMiscInfo <em>Misc Info</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.CustomerImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected static final int CUSTOMER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCustomerID() <em>Customer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerID()
	 * @generated
	 * @ordered
	 */
	protected int customerID = CUSTOMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBonusPoints() <em>Bonus Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonusPoints() <em>Bonus Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusPoints()
	 * @generated
	 * @ordered
	 */
	protected int bonusPoints = BONUS_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiscInfo() <em>Misc Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String MISC_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiscInfo() <em>Misc Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiscInfo()
	 * @generated
	 * @ordered
	 */
	protected String miscInfo = MISC_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final double RANK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected double rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public CustomerImpl(int id, String name, String city,String country, String gender, String phoneNumber, String postalCode,
						String ssnumber, String street, String title){
		super(name, title, gender, ssnumber, phoneNumber, country, city, postalCode, street);
		this.customerID = id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerID(int newCustomerID) {
		int oldCustomerID = customerID;
		customerID = newCustomerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID, oldCustomerID, customerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonusPoints() {
		return bonusPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonusPoints(int newBonusPoints) {
		int oldBonusPoints = bonusPoints;
		bonusPoints = newBonusPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS, oldBonusPoints, bonusPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiscInfo() {
		return miscInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiscInfo(String newMiscInfo) {
		String oldMiscInfo = miscInfo;
		miscInfo = newMiscInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO, oldMiscInfo, miscInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(double newRank) {
		double oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.CUSTOMER__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBonusPoints(int bonusPoints) {
		this.bonusPoints += bonusPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				return getCustomerID();
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				return getBonusPoints();
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				return getMiscInfo();
			case HotelManagementClassDiagramPackage.CUSTOMER__RANK:
				return getRank();
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				setBonusPoints((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				setMiscInfo((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__RANK:
				setRank((Double)newValue);
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				setCustomerID(CUSTOMER_ID_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				setBonusPoints(BONUS_POINTS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				setMiscInfo(MISC_INFO_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.CUSTOMER__RANK:
				setRank(RANK_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.CUSTOMER__CUSTOMER_ID:
				return customerID != CUSTOMER_ID_EDEFAULT;
			case HotelManagementClassDiagramPackage.CUSTOMER__BONUS_POINTS:
				return bonusPoints != BONUS_POINTS_EDEFAULT;
			case HotelManagementClassDiagramPackage.CUSTOMER__MISC_INFO:
				return MISC_INFO_EDEFAULT == null ? miscInfo != null : !MISC_INFO_EDEFAULT.equals(miscInfo);
			case HotelManagementClassDiagramPackage.CUSTOMER__RANK:
				return rank != RANK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HotelManagementClassDiagramPackage.CUSTOMER___ADD_BONUS_POINTS__INT:
				addBonusPoints((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (customerID: ");
		result.append(customerID);
		result.append(", bonusPoints: ");
		result.append(bonusPoints);
		result.append(", miscInfo: ");
		result.append(miscInfo);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerID;
		return result;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerImpl other = (CustomerImpl) obj;
		if (customerID != other.customerID)
			return false;
		return true;
	}
	

} //CustomerImpl
