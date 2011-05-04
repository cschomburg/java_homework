/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 05 - Programmieren (Java) - Gruppe 6
 * 03.04.11 - 10.05.11
 */

package de.sim;

import de.sim.tree.*;
import de.sim.parser.*;
import de.sim.walker.*;

/**
 * Hauptklasse.
 */
public class Main {

	/**
	 * Erwartet eine S-Expression als Parameter und gibt das Ergebnis aus.
	 * "test" lässt ein paar Testfälle durchlaufen und gibt true/false aus.
	 * 
	 * @param args String-Array von Argumenten
	 */
	public static void main(String... args) {
		if (args.length < 1) {
			System.out.println("Fehler: Eine S-Expression wird benoetigt!");
			return;
		}

		Parser parser = new Parser();
		Walker walker = new Walker();

		// Simple Tests
		if (args[0].equals("test")) {
			System.out.println(walker.walk(parser.start(  "(+ 1 3)"              )) ==  4.0f);
			System.out.println(walker.walk(parser.start(  "(- 1.5 2)"            )) == -0.5f);
			System.out.println(walker.walk(parser.start(  "(* (+ 1 2) 0.5)"      )) ==  1.5f);
			System.out.println(walker.walk(parser.start(  "(/ (* 3 2) (- 1 0.5))")) == 12.0f);
			System.exit(0);
		}

		Node root = parser.start(args[0]);
		if (root != null) {
			float result = walker.walk(root);
			System.out.println(result);
		}
	}
}
