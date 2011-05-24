/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim;

import de.sim.stack.Stack;

/**
 * Hauptklasse
 */
public class Main {

	/**
	 * Eintrittspunkt
	 *
	 * @param args Enthält den Eingabe-String
	 */
	public static void main(String... args) {
		if (args.length < 1) {
			System.out.println("Error: No input specified!");
			System.exit(1);
		}

		StackCalc calc = new StackCalc();
		Stack stack = calc.calc(args[0]);
		System.out.println(stack);
	}
}
