/**
 */
package fta_domain_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tie Breaker Rule</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage#getTieBreakerRule()
 * @model
 * @generated
 */
public enum TieBreakerRule implements Enumerator {
	/**
	 * The '<em><b>GOAL DIFFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL_DIFFERENCE(0, "GOAL_DIFFERENCE", "GOAL_DIFFERENCE"),

	/**
	 * The '<em><b>HEAD TO HEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TO_HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_TO_HEAD(1, "HEAD_TO_HEAD", "HEAD_TO_HEAD"),

	/**
	 * The '<em><b>GOALS SCORED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOALS_SCORED_VALUE
	 * @generated
	 * @ordered
	 */
	GOALS_SCORED(2, "GOALS_SCORED", "GOALS_SCORED");

	/**
	 * The '<em><b>GOAL DIFFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_DIFFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_DIFFERENCE_VALUE = 0;

	/**
	 * The '<em><b>HEAD TO HEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_TO_HEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_TO_HEAD_VALUE = 1;

	/**
	 * The '<em><b>GOALS SCORED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOALS_SCORED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GOALS_SCORED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tie Breaker Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TieBreakerRule[] VALUES_ARRAY = new TieBreakerRule[] { GOAL_DIFFERENCE, HEAD_TO_HEAD,
			GOALS_SCORED, };

	/**
	 * A public read-only list of all the '<em><b>Tie Breaker Rule</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TieBreakerRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tie Breaker Rule</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TieBreakerRule get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TieBreakerRule result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tie Breaker Rule</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TieBreakerRule getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TieBreakerRule result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tie Breaker Rule</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TieBreakerRule get(int value) {
		switch (value) {
		case GOAL_DIFFERENCE_VALUE:
			return GOAL_DIFFERENCE;
		case HEAD_TO_HEAD_VALUE:
			return HEAD_TO_HEAD;
		case GOALS_SCORED_VALUE:
			return GOALS_SCORED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TieBreakerRule(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TieBreakerRule
