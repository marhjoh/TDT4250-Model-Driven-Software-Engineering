/**
 */
package fta_domain_model.impl;

import fta_domain_model.Fta_domain_modelPackage;
import fta_domain_model.SingleElimination;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Elimination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_domain_model.impl.SingleEliminationImpl#getNumberOfRounds <em>Number Of Rounds</em>}</li>
 *   <li>{@link fta_domain_model.impl.SingleEliminationImpl#isHasThirdPlacePlayoff <em>Has Third Place Playoff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleEliminationImpl extends TournamentFormatImpl implements SingleElimination {
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
	 * The default value of the '{@link #isHasThirdPlacePlayoff() <em>Has Third Place Playoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasThirdPlacePlayoff()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_THIRD_PLACE_PLAYOFF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasThirdPlacePlayoff() <em>Has Third Place Playoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasThirdPlacePlayoff()
	 * @generated
	 * @ordered
	 */
	protected boolean hasThirdPlacePlayoff = HAS_THIRD_PLACE_PLAYOFF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleEliminationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_domain_modelPackage.Literals.SINGLE_ELIMINATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.SINGLE_ELIMINATION__NUMBER_OF_ROUNDS, oldNumberOfRounds, numberOfRounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasThirdPlacePlayoff() {
		return hasThirdPlacePlayoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasThirdPlacePlayoff(boolean newHasThirdPlacePlayoff) {
		boolean oldHasThirdPlacePlayoff = hasThirdPlacePlayoff;
		hasThirdPlacePlayoff = newHasThirdPlacePlayoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fta_domain_modelPackage.SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF, oldHasThirdPlacePlayoff,
					hasThirdPlacePlayoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__NUMBER_OF_ROUNDS:
			return getNumberOfRounds();
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF:
			return isHasThirdPlacePlayoff();
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
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__NUMBER_OF_ROUNDS:
			setNumberOfRounds((Integer) newValue);
			return;
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF:
			setHasThirdPlacePlayoff((Boolean) newValue);
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
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__NUMBER_OF_ROUNDS:
			setNumberOfRounds(NUMBER_OF_ROUNDS_EDEFAULT);
			return;
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF:
			setHasThirdPlacePlayoff(HAS_THIRD_PLACE_PLAYOFF_EDEFAULT);
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
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__NUMBER_OF_ROUNDS:
			return numberOfRounds != NUMBER_OF_ROUNDS_EDEFAULT;
		case Fta_domain_modelPackage.SINGLE_ELIMINATION__HAS_THIRD_PLACE_PLAYOFF:
			return hasThirdPlacePlayoff != HAS_THIRD_PLACE_PLAYOFF_EDEFAULT;
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
		result.append(" (numberOfRounds: ");
		result.append(numberOfRounds);
		result.append(", hasThirdPlacePlayoff: ");
		result.append(hasThirdPlacePlayoff);
		result.append(')');
		return result.toString();
	}

} //SingleEliminationImpl
