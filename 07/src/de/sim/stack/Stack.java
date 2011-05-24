/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 07 - Programmieren (Java) - Gruppe 6
 * 17.05.11 - 31.05.11
 */

package de.sim.stack;

/**
 * Ein Stapelspeicher
 */
public class Stack {

	private Node m_topNode;

	/**
	 * Legt eine Zahl oben auf dem Speicher ab
	 *
	 * @param data Zahl
	 */
	public void push(int data) {
		Node node = new Node(data);
		if (m_topNode != null)
			node.setNext(m_topNode);
		m_topNode = node;
	}

	/**
	 * Nimmt die oberste Zahl vom Speicher und gibt sie zurück
	 *
	 * @return Zahl oder -1, wenn leer
	 */
	public int pop() {
		if (m_topNode == null)
			return -1;

		int data = peek();
		m_topNode = m_topNode.getNext();
		return data;
	}

	/**
	 * Gibt die oberste Zahl vom Speicher zurück
	 *
	 * @return Zahl oder -1, wenn leer
	 */
	public int peek() {
		if (m_topNode == null)
			return -1;

		return m_topNode.getData();
	}

	/**
	 * Gibt zurück, ob der Speicher leer ist
	 *
	 * @return Boolean
	 */
	public boolean isEmpty() {
		return m_topNode == null;
	}

	/**
	 * Gibt den Stack in String-Form zurück
	 *
	 * @return String-Repräsentation
	 */
	@Override public String toString() {
		if (isEmpty())
			return "[]";

		return "["+m_topNode.toString()+"]";
	}
}
