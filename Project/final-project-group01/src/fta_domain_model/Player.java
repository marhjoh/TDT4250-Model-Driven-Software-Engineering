/**
 */
package fta_domain_model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.Player#getName <em>Name</em>}</li>
 *   <li>{@link fta_domain_model.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link fta_domain_model.Player#getPlayerstatistics <em>Playerstatistics</em>}</li>
 *   <li>{@link fta_domain_model.Player#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link fta_domain_model.Player#getAge <em>Age</em>}</li>
 *   <li>{@link fta_domain_model.Player#getNumber <em>Number</em>}</li>
 *   <li>{@link fta_domain_model.Player#getPlayerID <em>Player ID</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"MIDFIELDER"</code>.
	 * The literals are from the enumeration {@link fta_domain_model.PlayerPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see fta_domain_model.PlayerPosition
	 * @see #setPosition(PlayerPosition)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_Position()
	 * @model default="MIDFIELDER"
	 * @generated
	 */
	PlayerPosition getPosition();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see fta_domain_model.PlayerPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PlayerPosition value);

	/**
	 * Returns the value of the '<em><b>Playerstatistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playerstatistics</em>' containment reference.
	 * @see #setPlayerstatistics(PlayerStatistics)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_Playerstatistics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PlayerStatistics getPlayerstatistics();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getPlayerstatistics <em>Playerstatistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playerstatistics</em>' containment reference.
	 * @see #getPlayerstatistics()
	 * @generated
	 */
	void setPlayerstatistics(PlayerStatistics value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_Age()
	 * @model derived="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link fta_domain_model.Player#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Player ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player ID</em>' attribute.
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayer_PlayerID()
	 * @model default="0" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPlayerID();

} // Player
