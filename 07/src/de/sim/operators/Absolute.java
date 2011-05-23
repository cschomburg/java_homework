/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 24.05.11
 */

package de.sim.operators;

import de.sim.stack.Stack;
import de.sim.operatorbase.Operator;
import de.sim.operatorbase.Monoid;

public class Absolute extends Monoid {

	public Absolute() {
		setSymbol("abs");
	}

	public boolean execute(Stack stack) {
		int[] dataStore = checkParameter(stack);
		if (dataStore == null)
			return false;

		stack.push(Math.abs(dataStore[0]));
		return true;
	}
}
