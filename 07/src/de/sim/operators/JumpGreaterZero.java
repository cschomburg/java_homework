/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.operators;

import de.sim.stack.Stack;
import de.sim.operatorbase.Tertiary;

/**
 * Operator, der einen bedingten Sprung durchführt
 */
public class JumpGreaterZero extends Tertiary {

	/**
	 * Konstruktor
	 */
	public JumpGreaterZero() {
		setSymbol("jgz");
	}

	/**
	 * Wenn der erste Wert größer null ist, schiebe den zweiten Wert zurück auf,
	 * den Stack, ansonsten den dritten
	 *
	 * @param stack ein Stack
	 * @return Ergebnis
	 */
	public boolean execute(Stack stack) {
		int[] dataStore = checkParameter(stack);
		if (dataStore == null)
			return false;

		if (dataStore[0] > 0) {
			stack.push(dataStore[1]);
		} else {
			stack.push(dataStore[2]);
		}
		return true;
	}
}
