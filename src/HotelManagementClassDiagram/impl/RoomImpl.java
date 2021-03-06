/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Discount;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import HotelManagementClassDiagram.Room;
import HotelManagementClassDiagram.RoomType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getDiscounts <em>Discounts</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getSize <em>Size</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getMaxNbrPeople <em>Max Nbr People</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#isUnderCleaning <em>Under Cleaning</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#isUnderRepair <em>Under Repair</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.RoomImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscounts() <em>Discounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Discount> discounts;

	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected String internalComment = INTERNAL_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNbrPeople() <em>Max Nbr People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrPeople()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NBR_PEOPLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNbrPeople() <em>Max Nbr People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNbrPeople()
	 * @generated
	 * @ordered
	 */
	protected int maxNbrPeople = MAX_NBR_PEOPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderCleaning() <em>Under Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderCleaning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_CLEANING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderCleaning() <em>Under Cleaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderCleaning()
	 * @generated
	 * @ordered
	 */
	protected boolean underCleaning = UNDER_CLEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderRepair() <em>Under Repair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderRepair()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_REPAIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderRepair() <em>Under Repair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderRepair()
	 * @generated
	 * @ordered
	 */
	protected boolean underRepair = UNDER_REPAIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RoomType TYPE_EDEFAULT = RoomType.DOUBLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RoomType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public RoomImpl(int maxNbrPeople, int roomNumber, int size, RoomType type){
		this.maxNbrPeople = maxNbrPeople;
		this.roomNumber = roomNumber;
		this.size = size;
		this.underCleaning = false;
		this.underRepair = false;
		this.type = type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discount> getDiscounts() {
		if (discounts == null) {
			discounts = new EObjectResolvingEList<Discount>(Discount.class, this, HotelManagementClassDiagramPackage.ROOM__DISCOUNTS);
		}
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRoomNumber(int newRoomNumber) {
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSize(double newSize) {
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalComment() {
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalComment(String newInternalComment) {
		String oldInternalComment = internalComment;
		internalComment = newInternalComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT, oldInternalComment, internalComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNbrPeople() {
		return maxNbrPeople;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setMaxNbrPeople(int newMaxNbrPeople) {
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderCleaning() {
		return underCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderCleaning(boolean newUnderCleaning) {
		boolean oldUnderCleaning = underCleaning;
		underCleaning = newUnderCleaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING, oldUnderCleaning, underCleaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderRepair() {
		return underRepair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderRepair(boolean newUnderRepair) {
		boolean oldUnderRepair = underRepair;
		underRepair = newUnderRepair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR, oldUnderRepair, underRepair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RoomType newType) {
		RoomType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.ROOM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDiscount(Discount discount) {
		this.discounts.add(discount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeDiscount(Discount discount) {
		Iterator<Discount> it = this.discounts.iterator();
		while(it.hasNext()) {
			if(it.next().equals(discount)) {
				it.remove();
				break;
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.ROOM__PRICE:
				return getPrice();
			case HotelManagementClassDiagramPackage.ROOM__DISCOUNTS:
				return getDiscounts();
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return getSize();
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				return getInternalComment();
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				return getMaxNbrPeople();
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				return isUnderCleaning();
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				return isUnderRepair();
			case HotelManagementClassDiagramPackage.ROOM__TYPE:
				return getType();
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
			case HotelManagementClassDiagramPackage.ROOM__PRICE:
				setPrice((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__DISCOUNTS:
				getDiscounts().clear();
				getDiscounts().addAll((Collection<? extends Discount>)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				setInternalComment((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				setMaxNbrPeople((Integer)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				setUnderCleaning((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				setUnderRepair((Boolean)newValue);
				return;
			case HotelManagementClassDiagramPackage.ROOM__TYPE:
				setType((RoomType)newValue);
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
			case HotelManagementClassDiagramPackage.ROOM__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__DISCOUNTS:
				getDiscounts().clear();
				return;
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				setInternalComment(INTERNAL_COMMENT_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				setMaxNbrPeople(MAX_NBR_PEOPLE_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				setUnderCleaning(UNDER_CLEANING_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				setUnderRepair(UNDER_REPAIR_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.ROOM__TYPE:
				setType(TYPE_EDEFAULT);
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
			case HotelManagementClassDiagramPackage.ROOM__PRICE:
				return price != PRICE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__DISCOUNTS:
				return discounts != null && !discounts.isEmpty();
			case HotelManagementClassDiagramPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__SIZE:
				return size != SIZE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__INTERNAL_COMMENT:
				return INTERNAL_COMMENT_EDEFAULT == null ? internalComment != null : !INTERNAL_COMMENT_EDEFAULT.equals(internalComment);
			case HotelManagementClassDiagramPackage.ROOM__MAX_NBR_PEOPLE:
				return maxNbrPeople != MAX_NBR_PEOPLE_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_CLEANING:
				return underCleaning != UNDER_CLEANING_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__UNDER_REPAIR:
				return underRepair != UNDER_REPAIR_EDEFAULT;
			case HotelManagementClassDiagramPackage.ROOM__TYPE:
				return type != TYPE_EDEFAULT;
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
			case HotelManagementClassDiagramPackage.ROOM___ADD_DISCOUNT__DISCOUNT:
				addDiscount((Discount)arguments.get(0));
				return null;
			case HotelManagementClassDiagramPackage.ROOM___REMOVE_DISCOUNT__DISCOUNT:
				removeDiscount((Discount)arguments.get(0));
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
		result.append(" (price: ");
		result.append(price);
		result.append(", roomNumber: ");
		result.append(roomNumber);
		result.append(", size: ");
		result.append(size);
		result.append(", internalComment: ");
		result.append(internalComment);
		result.append(", maxNbrPeople: ");
		result.append(maxNbrPeople);
		result.append(", underCleaning: ");
		result.append(underCleaning);
		result.append(", underRepair: ");
		result.append(underRepair);
		result.append(", type: ");
		result.append(type);
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
		result = prime * result + roomNumber;
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
		RoomImpl other = (RoomImpl) obj;
        return roomNumber == other.roomNumber;
    }

} //RoomImpl
