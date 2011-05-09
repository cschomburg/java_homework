/**
 * @author Constantin Schomburg <me@xconstruct.net>
 *
 * Übung 05 - Programmieren (Java) - Gruppe 6
 * 03.04.11 - 10.05.11
 */

package de.sim.tree;

/**
 * Stellt einen Knoten im Expression-Tree dar.
 */
public class Node {

	private Node m_leftChild;
	private Node m_rightChild;
	private float m_data;
	private char m_type;

	/**
	 * Standardkonstruktor: Erzeugt leeren Knoten
	 */
	public Node() {}

	/**
	 * Knoten mit festgelegtem Typ
	 *
	 * @param type Typ
	 */
	public Node(char type) {
		m_type = type;
	}

	/**
	 * Daten-Knoten mit Typ 'l'
	 *
	 * @param data Zahl
	 */
	public Node(float data) {
		m_type = 'l';
		m_data = data;
	}

	/**
	 * Gibt den linken Kindknoten zurück, falls verfügbar
	 *
	 * @return Knoten oder null
	 */
	public Node getLeftChild() {
		return m_leftChild;
	}

	/**
	 * Setzt den linken Kindknoten
	 *
	 * @param leftChild Knoten
	 */
	public void setLeftChild(Node leftChild) {
		m_leftChild = leftChild;
	}

	/**
	 * Gibt den rechten Kindknoten zurück, falls verfügbar
	 *
	 * @return Knoten oder null
	 */
	public Node getRightChild() {
		return m_rightChild;
	}

	/**
	 * Setzt den rechten Kindknoten
	 *
	 * @param rightChild Knoten
	 */
	public void setRightChild(Node rightChild) {
		m_rightChild = rightChild;
	}

	/**
	 * Gibt den Wert des Knotens zurück
	 *
	 * @return Wert, Standard 0
	 */
	public float getData() {
		return m_data;
	}

	/**
	 * Gibt den Typ des Knotens zurück
	 *
	 * @return Typ, 'l' ist ein Datenknoten
	 */
	public char getType() {
		return m_type;
	}

	/**
	 * Setzt den Typ des Knotens
	 *
	 * @param type Typ, 'l' ist ein Datenknoten
	 */
	public void setType(char type) {
		m_type = type;
	}

	/**
	 * Gibt einen String zurück, der den Knoten repräsentiert
	 *
	 * @return String-Repräsentation
	 */
	public String toString() {
		if (m_type == 'l') {
			return Float.toString(m_data);
		} else {
			return String.format("(%s %s %s)", m_type,
								 m_leftChild.toString(), m_rightChild);
		}
	}
}
