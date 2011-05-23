/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 24.05.11
 */

package de.sim;

import de.sim.stack.Stack;

public class Main {

	public static void main(String... args) {
		if (args.length < 1) {
			System.out.println("Error: No input specified!");
			System.exit(1);
		}

		StackCalc calc = new StackCalc();
		Stack stack = calc.calc(args[0]);

		String contents = "";
		while (!stack.isEmpty()) {
			if (!contents.isEmpty())
				contents += ",";
			contents += stack.pop();
		}
		System.out.printf("[%s]\n", contents);
	}
}
