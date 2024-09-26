/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.DataStorage#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link fta_domain_model.DataStorage#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getDataStorage()
 * @model
 * @generated
 */
public interface DataStorage extends EObject {
	/**
	 * Returns the value of the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type</em>' attribute.
	 * @see #setStorageType(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getDataStorage_StorageType()
	 * @model
	 * @generated
	 */
	String getStorageType();

	/**
	 * Sets the value of the '{@link fta_domain_model.DataStorage#getStorageType <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type</em>' attribute.
	 * @see #getStorageType()
	 * @generated
	 */
	void setStorageType(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getDataStorage_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link fta_domain_model.DataStorage#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // DataStorage
