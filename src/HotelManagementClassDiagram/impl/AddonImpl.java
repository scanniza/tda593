/**
 */
package HotelManagementClassDiagram.impl;

import HotelManagementClassDiagram.Addon;
import HotelManagementClassDiagram.HotelManagementClassDiagramPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addon</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddonImpl extends ExtraImpl implements Addon {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddonImpl() {
		super();
	}

	/**
	 * @generated NOT
	 */
	public AddonImpl(String name, String description, double price){
		this.name = name;
		this.description = description;
		//TODO: Price
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HotelManagementClassDiagramPackage.Literals.ADDON;
	}

} //AddonImpl
