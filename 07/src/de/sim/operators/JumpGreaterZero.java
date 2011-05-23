/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 24.05.11
 */

package de.sim.operators;

import de.sim.stack.Stack;
import de.sim.operatorbase.Tertiary;

public class JumpGreaterZero extends Tertiary {

	public JumpGreaterZero() {
		setSymbol("jgz");
	}

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
