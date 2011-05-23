/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.operators;

import de.sim.stack.Stack;
import de.sim.operatorbase.Binary;

/**
 * Operator, der eine Multiplikation durchführt
 */
public class Multiplication extends Binary {

	/**
	 * Konstruktor
	 */
	public Multiplication() {
		setSymbol("*");
	}

	/**
	 * Holt zwei Werte vom Stack und schiebt das Produkt darauf
	 *
	 * @param stack ein Stack
	 * @return Erfolg
	 */
	public boolean execute(Stack stack) {
		int[] dataStore = checkParameter(stack);
		if (dataStore == null)
			return false;

		stack.push(dataStore[0] * dataStore[1]);
		return true;
	}
}
