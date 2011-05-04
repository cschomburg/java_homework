/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 05 - Programmieren (Java) - Gruppe 6
 * 03.04.11 - 10.05.11
 */

package de.sim.parser;

import de.sim.tree.*;

/**
 * Parser für eine S-Expression.
 */
public class Parser {

	private int m_pos;

	/**
	 * Parst eine S-Expression an der aktuellen Position
	 * und gibt den Wurzelknoten beo Erfolg zurück.
	 *
	 * @param tree die S-Expression zum Parsen
	 * @return Wurzelknoten oder null bei Parse-Fehler
	 */
	private Node parse(final String tree) {
		Node node = new Node();

		// Durchlaufe Expression
		for ( ; m_pos < tree.length(); m_pos++) {
			char c = tree.charAt(m_pos);
			if (c == ' ') // Leerzeichen ignorieren
				continue;

			// Operator gefunden? Typ setzen
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				node.setType(c);
				continue;
			}

			// Öffnende Klammer? Inhalt parsen und in Kind speichern
			if (c == '(') {
				m_pos++;
				if (node.getLeftChild() == null) {
					node.setLeftChild(parse(tree));
				} else {
					node.setRightChild(parse(tree));
				}
				continue;
			}

			// Schließende Klammer? Fertig und Knoten zurückgeben (Hauptaustrittspunkt)
			if (c == ')') {
				return node;
			}

			// Ansonsten: Eingabe als Zahl werten und speichern
			String number = "";

			// Finde Ende der Zahl
			while (m_pos < tree.length()) {
				c = tree.charAt(m_pos);
				if (c != '.' && (c < '0' || c > '9'))
					break;
				number += c;
				m_pos++;
			}
			m_pos--; // Letztes Zeichen (ungültig) soll erneut gelesen werden

			float data = Float.parseFloat(number);

			// Wert in Kindknoten speichern
			Node child = new Node(data);
			if (node.getLeftChild() == null) {
				node.setLeftChild(child);
			} else {
				node.setRightChild(child);
			}
		}

		// Am Ende des Strings angekommen und nicht durch '('-Bedingung abgebrochen?
		// Dann fehlt wohl eine Klammer
		System.out.println("Fehler: ')' erwartet!");
		return null;
	}

	/**
	 * Startet einen neuen Parse-Vorgang einer S-Expression und gibt
	 * den Wurzelknoten bei Erfolg zurück.
	 *
	 * @param start die S-Expression
	 * @return Wurzelknoten oder null bei Parse-Fehler
	 */
	public Node start(final String tree) {
		m_pos = 1;
		return parse(tree);
	}
}
