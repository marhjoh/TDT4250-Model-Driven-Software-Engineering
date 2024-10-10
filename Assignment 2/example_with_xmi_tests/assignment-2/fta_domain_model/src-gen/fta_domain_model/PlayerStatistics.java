/**
 */
package fta_domain_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.PlayerStatistics#getGoals <em>Goals</em>}</li>
 *   <li>{@link fta_domain_model.PlayerStatistics#getAssists <em>Assists</em>}</li>
 *   <li>{@link fta_domain_model.PlayerStatistics#getFouls <em>Fouls</em>}</li>
 *   <li>{@link fta_domain_model.PlayerStatistics#getYellowCards <em>Yellow Cards</em>}</li>
 *   <li>{@link fta_domain_model.PlayerStatistics#getRedCards <em>Red Cards</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics()
 * @model abstract="true"
 * @generated
 */
public interface PlayerStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Goals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' attribute.
	 * @see #setGoals(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics_Goals()
	 * @model
	 * @generated
	 */
	int getGoals();

	/**
	 * Sets the value of the '{@link fta_domain_model.PlayerStatistics#getGoals <em>Goals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals</em>' attribute.
	 * @see #getGoals()
	 * @generated
	 */
	void setGoals(int value);

	/**
	 * Returns the value of the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' attribute.
	 * @see #setAssists(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics_Assists()
	 * @model
	 * @generated
	 */
	int getAssists();

	/**
	 * Sets the value of the '{@link fta_domain_model.PlayerStatistics#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists</em>' attribute.
	 * @see #getAssists()
	 * @generated
	 */
	void setAssists(int value);

	/**
	 * Returns the value of the '<em><b>Fouls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fouls</em>' attribute.
	 * @see #setFouls(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics_Fouls()
	 * @model
	 * @generated
	 */
	int getFouls();

	/**
	 * Sets the value of the '{@link fta_domain_model.PlayerStatistics#getFouls <em>Fouls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fouls</em>' attribute.
	 * @see #getFouls()
	 * @generated
	 */
	void setFouls(int value);

	/**
	 * Returns the value of the '<em><b>Yellow Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow Cards</em>' attribute.
	 * @see #setYellowCards(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics_YellowCards()
	 * @model
	 * @generated
	 */
	int getYellowCards();

	/**
	 * Sets the value of the '{@link fta_domain_model.PlayerStatistics#getYellowCards <em>Yellow Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow Cards</em>' attribute.
	 * @see #getYellowCards()
	 * @generated
	 */
	void setYellowCards(int value);

	/**
	 * Returns the value of the '<em><b>Red Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Cards</em>' attribute.
	 * @see #setRedCards(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getPlayerStatistics_RedCards()
	 * @model
	 * @generated
	 */
	int getRedCards();

	/**
	 * Sets the value of the '{@link fta_domain_model.PlayerStatistics#getRedCards <em>Red Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Cards</em>' attribute.
	 * @see #getRedCards()
	 * @generated
	 */
	void setRedCards(int value);

} // PlayerStatistics
