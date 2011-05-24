/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.stack;

/**
 * Ein Integer-Knoten einer verketteten Liste
 */
public class Node {

	private Node m_next;
	private int m_data;

	/**
	 * Erstellt einen Knoten mit einer Zahl
	 *
	 * @param data Zahl
	 */
	public Node(int data) {
		m_data = data;
	}

	/**
	 * Gibt den nächsten Knoten in der Kette zurück
	 *
	 * @return Knoten oder null
	 */
	public Node getNext() {
		return m_next;
	}

	/**
	 * Setzt den nächsten Knoten in der Kette
	 *
	 * @param Knoten
	 */
	public void setNext(Node next) {
		m_next = next;
	}

	/**
	 * Gibt die Zahl des Knotens zurück
	 *
	 * @return Zahl
	 */
	public int getData() {
		return m_data;
	}

	/**
	 * Gibt den Knoten und seinen Nachbarknoten als String zurück
	 *
	 * @return String-Repräsentation
	 */
	@Override public String toString() {
		if (m_next == null)
			return ""+m_data;

		return m_data + "," + m_next.toString();
	}
}
