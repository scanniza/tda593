/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.BookedRoom;
import HotelManagementClassDiagram.BookingController;
import HotelManagementClassDiagram.Hotel;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;

import HotelManagementClassDiagram.MaintenanceController;
import HotelManagementClassDiagram.ManagementController;
import HotelManagementClassDiagram.Room;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getName <em>Name</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getBookingController <em>Booking Controller</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getMaintenanceController <em>Maintenance Controller</em>}</li>
 *   <li>{@link HotelManagementClassDiagram.impl.HotelImpl#getManagementController <em>Management Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HotelImpl extends MinimalEObjectImpl.Container implements Hotel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

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
	 * The cached value of the '{@link #getBookingController() <em>Booking Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingController()
	 * @generated
	 * @ordered
	 */
	protected BookingController bookingController;

	/**
	 * The cached value of the '{@link #getMaintenanceController() <em>Maintenance Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenanceController()
	 * @generated
	 * @ordered
	 */
	protected MaintenanceController maintenanceController;

	/**
	 * The cached value of the '{@link #getManagementController() <em>Management Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementController()
	 * @generated
	 * @ordered
	 */
	protected ManagementController managementController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HotelImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__ADDRESS, oldAddress, address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BookingController getBookingController() {
		return new BookingControllerImpl();
	}

	public BookingController basicGetBookingController() {
		return bookingController;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingController(BookingController newBookingController) {
		BookingController oldBookingController = bookingController;
		bookingController = newBookingController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__BOOKING_CONTROLLER, oldBookingController, bookingController));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementController getManagementController() {
		if (managementController != null && managementController.eIsProxy()) {
			InternalEObject oldManagementController = (InternalEObject)managementController;
			managementController = (ManagementController)eResolveProxy(oldManagementController);
			if (managementController != oldManagementController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER, oldManagementController, managementController));
			}
		}
		return managementController;
	}

	public ManagementController basicGetManagementController() {
		return managementController;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementController(ManagementController newManagementController) {
		ManagementController oldManagementController = managementController;
		managementController = newManagementController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER, oldManagementController, managementController));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceController getMaintenanceController() {
		if (maintenanceController != null && maintenanceController.eIsProxy()) {
			InternalEObject oldMaintenanceController = (InternalEObject)maintenanceController;
			maintenanceController = (MaintenanceController)eResolveProxy(oldMaintenanceController);
			if (maintenanceController != oldMaintenanceController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER, oldMaintenanceController, maintenanceController));
			}
		}
		return maintenanceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceController basicGetMaintenanceController() {
		return maintenanceController;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenanceController(MaintenanceController newMaintenanceController) {
		MaintenanceController oldMaintenanceController = maintenanceController;
		maintenanceController = newMaintenanceController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER, oldMaintenanceController, maintenanceController));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				return getName();
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				return getAddress();
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				return getRank();
			case HotelManagementClassDiagramPackage.HOTEL__BOOKING_CONTROLLER:
				if (resolve) return getBookingController();
				return basicGetBookingController();
			case HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER:
				if (resolve) return getMaintenanceController();
				return basicGetMaintenanceController();
			case HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER:
				if (resolve) return getManagementController();
				return basicGetManagementController();
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				setName((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				setAddress((String)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				setRank((Double)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__BOOKING_CONTROLLER:
				setBookingController((BookingController)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER:
				setMaintenanceController((MaintenanceController)newValue);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER:
				setManagementController((ManagementController)newValue);
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__BOOKING_CONTROLLER:
				setBookingController((BookingController)null);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER:
				setMaintenanceController((MaintenanceController)null);
				return;
			case HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER:
				setManagementController((ManagementController)null);
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
			case HotelManagementClassDiagramPackage.HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HotelManagementClassDiagramPackage.HOTEL__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case HotelManagementClassDiagramPackage.HOTEL__RANK:
				return rank != RANK_EDEFAULT;
			case HotelManagementClassDiagramPackage.HOTEL__BOOKING_CONTROLLER:
				return bookingController != null;
			case HotelManagementClassDiagramPackage.HOTEL__MAINTENANCE_CONTROLLER:
				return maintenanceController != null;
			case HotelManagementClassDiagramPackage.HOTEL__MANAGEMENT_CONTROLLER:
				return managementController != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

	/* Following methods are for factory purposes */

	/**
	 * @generated NOT
	 */
	public Room createRoom(Room room){
		return new RoomImpl(); //new BookedRoomImpl(room);
	}

	/**
	 * @generated NOT
	 */
	public BookedRoom createBookedRoom(Room room){
		return new BookedRoomImpl(); //new BookedRoomImpl(room);
	}

} //HotelImpl
