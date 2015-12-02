/**
 */
package HotelManagementClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HotelManagementClassDiagram.MaintenanceController#getRoomStack <em>Room Stack</em>}</li>
 * </ul>
 *
 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getMaintenanceController()
 * @model
 * @generated
 */
public interface MaintenanceController extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Stack</b></em>' reference list.
	 * The list contents are of type {@link HotelManagementClassDiagram.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Stack</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Stack</em>' reference list.
	 * @see HotelManagementClassDiagram.HotelManagementClassDiagramPackage#getMaintenanceController_RoomStack()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRoomStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void addToStack(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setStatus(Room room, CleaningStatus status);

} // MaintenanceController