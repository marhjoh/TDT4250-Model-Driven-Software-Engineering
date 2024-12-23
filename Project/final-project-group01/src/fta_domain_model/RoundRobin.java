/**
 */
package fta_domain_model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Robin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.RoundRobin#getPointsForWin <em>Points For Win</em>}</li>
 *   <li>{@link fta_domain_model.RoundRobin#getPointsForDraw <em>Points For Draw</em>}</li>
 *   <li>{@link fta_domain_model.RoundRobin#getPointsForLoss <em>Points For Loss</em>}</li>
 *   <li>{@link fta_domain_model.RoundRobin#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.RoundRobin#getTieBreakerRule <em>Tie Breaker Rule</em>}</li>
 * </ul>
 *
 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin()
 * @model
 * @generated
 */
public interface RoundRobin extends TournamentFormat {
	/**
	 * Returns the value of the '<em><b>Points For Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points For Win</em>' attribute.
	 * @see #setPointsForWin(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin_PointsForWin()
	 * @model
	 * @generated
	 */
	int getPointsForWin();

	/**
	 * Sets the value of the '{@link fta_domain_model.RoundRobin#getPointsForWin <em>Points For Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points For Win</em>' attribute.
	 * @see #getPointsForWin()
	 * @generated
	 */
	void setPointsForWin(int value);

	/**
	 * Returns the value of the '<em><b>Points For Draw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points For Draw</em>' attribute.
	 * @see #setPointsForDraw(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin_PointsForDraw()
	 * @model
	 * @generated
	 */
	int getPointsForDraw();

	/**
	 * Sets the value of the '{@link fta_domain_model.RoundRobin#getPointsForDraw <em>Points For Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points For Draw</em>' attribute.
	 * @see #getPointsForDraw()
	 * @generated
	 */
	void setPointsForDraw(int value);

	/**
	 * Returns the value of the '<em><b>Points For Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points For Loss</em>' attribute.
	 * @see #setPointsForLoss(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin_PointsForLoss()
	 * @model
	 * @generated
	 */
	int getPointsForLoss();

	/**
	 * Sets the value of the '{@link fta_domain_model.RoundRobin#getPointsForLoss <em>Points For Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points For Loss</em>' attribute.
	 * @see #getPointsForLoss()
	 * @generated
	 */
	void setPointsForLoss(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Rounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #setNumberOfRounds(int)
	 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin_NumberOfRounds()
	 * @model
	 * @generated
	 */
	int getNumberOfRounds();

	/**
	 * Sets the value of the '{@link fta_domain_model.RoundRobin#getNumberOfRounds <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rounds</em>' attribute.
	 * @see #getNumberOfRounds()
	 * @generated
	 */
	void setNumberOfRounds(int value);

	/**
	 * Returns the value of the '<em><b>Tie Breaker Rule</b></em>' attribute.
	 * The default value is <code>"GOAL_DIFFERENCE"</code>.
	 * The literals are from the enumeration {@link fta_domain_model.TieBreakerRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tie Breaker Rule</em>' attribute.
	 * @see fta_domain_model.TieBreakerRule
	 * @see #setTieBreakerRule(TieBreakerRule)
	 * @see fta_domain_model.Fta_domain_modelPackage#getRoundRobin_TieBreakerRule()
	 * @model default="GOAL_DIFFERENCE"
	 * @generated
	 */
	TieBreakerRule getTieBreakerRule();

	/**
	 * Sets the value of the '{@link fta_domain_model.RoundRobin#getTieBreakerRule <em>Tie Breaker Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tie Breaker Rule</em>' attribute.
	 * @see fta_domain_model.TieBreakerRule
	 * @see #getTieBreakerRule()
	 * @generated
	 */
	void setTieBreakerRule(TieBreakerRule value);

} // RoundRobin
