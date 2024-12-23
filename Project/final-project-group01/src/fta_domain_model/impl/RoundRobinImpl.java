/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.RoundRobin;
import fta_domain_model.TieBreakerRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Robin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.RoundRobinImpl#getPointsForWin <em>Points For Win</em>}</li>
 *   <li>{@link fta_domain_model.impl.RoundRobinImpl#getPointsForDraw <em>Points For Draw</em>}</li>
 *   <li>{@link fta_domain_model.impl.RoundRobinImpl#getPointsForLoss <em>Points For Loss</em>}</li>
 *   <li>{@link fta_domain_model.impl.RoundRobinImpl#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.impl.RoundRobinImpl#getTieBreakerRule <em>Tie Breaker Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoundRobinImpl extends TournamentFormatImpl implements RoundRobin {
	/**
	 * The default value of the '{@link #getPointsForWin() <em>Points For Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForWin()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_FOR_WIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointsForWin() <em>Points For Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForWin()
	 * @generated
	 * @ordered
	 */
	protected int pointsForWin = POINTS_FOR_WIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsForDraw() <em>Points For Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForDraw()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_FOR_DRAW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointsForDraw() <em>Points For Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForDraw()
	 * @generated
	 * @ordered
	 */
	protected int pointsForDraw = POINTS_FOR_DRAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointsForLoss() <em>Points For Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForLoss()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_FOR_LOSS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPointsForLoss() <em>Points For Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForLoss()
	 * @generated
	 * @ordered
	 */
	protected int pointsForLoss = POINTS_FOR_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRounds() <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRounds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROUNDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRounds() <em>Number Of Rounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRounds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRounds = NUMBER_OF_ROUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTieBreakerRule() <em>Tie Breaker Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieBreakerRule()
	 * @generated
	 * @ordered
	 */
	protected static final TieBreakerRule TIE_BREAKER_RULE_EDEFAULT = TieBreakerRule.GOAL_DIFFERENCE;

	/**
	 * The cached value of the '{@link #getTieBreakerRule() <em>Tie Breaker Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTieBreakerRule()
	 * @generated
	 * @ordered
	 */
	protected TieBreakerRule tieBreakerRule = TIE_BREAKER_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundRobinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.ROUND_ROBIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPointsForWin() {
		return pointsForWin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointsForWin(int newPointsForWin) {
		int oldPointsForWin = pointsForWin;
		pointsForWin = newPointsForWin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN,
					oldPointsForWin, pointsForWin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPointsForDraw() {
		return pointsForDraw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointsForDraw(int newPointsForDraw) {
		int oldPointsForDraw = pointsForDraw;
		pointsForDraw = newPointsForDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW,
					oldPointsForDraw, pointsForDraw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPointsForLoss() {
		return pointsForLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointsForLoss(int newPointsForLoss) {
		int oldPointsForLoss = pointsForLoss;
		pointsForLoss = newPointsForLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS,
					oldPointsForLoss, pointsForLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfRounds() {
		return numberOfRounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfRounds(int newNumberOfRounds) {
		int oldNumberOfRounds = numberOfRounds;
		numberOfRounds = newNumberOfRounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS,
					oldNumberOfRounds, numberOfRounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TieBreakerRule getTieBreakerRule() {
		return tieBreakerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTieBreakerRule(TieBreakerRule newTieBreakerRule) {
		TieBreakerRule oldTieBreakerRule = tieBreakerRule;
		tieBreakerRule = newTieBreakerRule == null ? TIE_BREAKER_RULE_EDEFAULT : newTieBreakerRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE,
					oldTieBreakerRule, tieBreakerRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN:
			return getPointsForWin();
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW:
			return getPointsForDraw();
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS:
			return getPointsForLoss();
		case Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS:
			return getNumberOfRounds();
		case Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE:
			return getTieBreakerRule();
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
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN:
			setPointsForWin((Integer) newValue);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW:
			setPointsForDraw((Integer) newValue);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS:
			setPointsForLoss((Integer) newValue);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS:
			setNumberOfRounds((Integer) newValue);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE:
			setTieBreakerRule((TieBreakerRule) newValue);
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
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN:
			setPointsForWin(POINTS_FOR_WIN_EDEFAULT);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW:
			setPointsForDraw(POINTS_FOR_DRAW_EDEFAULT);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS:
			setPointsForLoss(POINTS_FOR_LOSS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS:
			setNumberOfRounds(NUMBER_OF_ROUNDS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE:
			setTieBreakerRule(TIE_BREAKER_RULE_EDEFAULT);
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
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_WIN:
			return pointsForWin != POINTS_FOR_WIN_EDEFAULT;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_DRAW:
			return pointsForDraw != POINTS_FOR_DRAW_EDEFAULT;
		case Fta_domain_modelPackage.ROUND_ROBIN__POINTS_FOR_LOSS:
			return pointsForLoss != POINTS_FOR_LOSS_EDEFAULT;
		case Fta_domain_modelPackage.ROUND_ROBIN__NUMBER_OF_ROUNDS:
			return numberOfRounds != NUMBER_OF_ROUNDS_EDEFAULT;
		case Fta_domain_modelPackage.ROUND_ROBIN__TIE_BREAKER_RULE:
			return tieBreakerRule != TIE_BREAKER_RULE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pointsForWin: ");
		result.append(pointsForWin);
		result.append(", pointsForDraw: ");
		result.append(pointsForDraw);
		result.append(", pointsForLoss: ");
		result.append(pointsForLoss);
		result.append(", numberOfRounds: ");
		result.append(numberOfRounds);
		result.append(", tieBreakerRule: ");
		result.append(tieBreakerRule);
		result.append(')');
		return result.toString();
	}

} //RoundRobinImpl
