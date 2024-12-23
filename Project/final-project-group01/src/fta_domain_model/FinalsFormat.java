/**
 */
package fta_domain_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Finals Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fta_domain_model.Fta_domain_modelPackage#getFinalsFormat()
 * @model
 * @generated
 */
public enum FinalsFormat implements Enumerator {
	/**
	 * The '<em><b>SINGLE FINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_FINAL_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_FINAL(0, "SINGLE_FINAL", "SINGLE_FINAL"),

	/**
	 * The '<em><b>BEST OF THREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_THREE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_OF_THREE(1, "BEST_OF_THREE", "BEST_OF_THREE");

	/**
	 * The '<em><b>SINGLE FINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_FINAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_FINAL_VALUE = 0;

	/**
	 * The '<em><b>BEST OF THREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_OF_THREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEST_OF_THREE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Finals Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FinalsFormat[] VALUES_ARRAY = new FinalsFormat[] { SINGLE_FINAL, BEST_OF_THREE, };

	/**
	 * A public read-only list of all the '<em><b>Finals Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FinalsFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Finals Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinalsFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinalsFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finals Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinalsFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinalsFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Finals Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinalsFormat get(int value) {
		switch (value) {
		case SINGLE_FINAL_VALUE:
			return SINGLE_FINAL;
		case BEST_OF_THREE_VALUE:
			return BEST_OF_THREE;
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
	private FinalsFormat(int value, String name, String literal) {
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

} //FinalsFormat
