/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 05 - Programmieren (Java) - Gruppe 6
 * 03.04.11 - 10.05.11
 */

package de.sim.walker;

import de.sim.tree.*;

/**
 * Klasse zum Durchlaufen von S-Expression-Knoten
 */
public class Walker {

	/**
	 * Wendet je nach Typ Operatoren auf einen Knoten und seine Kinder an und
	 * gibt das Ergebnis zurück.
	 *
	 * @param node der Hauptknoten, der durchlaufen wird
	 * @return eine Zahl als Ergebnis
	 */
	public float walk(Node node) {
		if (node.getType() == 'l') {
			return node.getData();
		}

		float left = walk(node.getLeftChild());
		float right = walk(node.getRightChild());
		
		switch (node.getType()) {
		case '+': return left + right;
		case '-': return left - right;
		case '*': return left * right;
		case '/': return left / right;
		default: return 0.0f;
		}
	}
}
