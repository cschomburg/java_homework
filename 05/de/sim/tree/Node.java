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

	public Node() {}

	public Node(char type) {
		m_type = type;
	}

	public Node(float data) {
		m_type = 'l';
		m_data = data;
	}

	public Node getLeftChild() {
		return m_leftChild;
	}

	public void setLeftChild(Node leftChild) {
		m_leftChild = leftChild;
	}

	public Node getRightChild() {
		return m_rightChild;
	}

	public void setRightChild(Node rightChild) {
		m_rightChild = rightChild;
	}

	public float getData() {
		return m_data;
	}

	public char getType() {
		return m_type;
	}

	public void setType(char type) {
		m_type = type;
	}

	public String toString() {
		if (m_type == 'l') {
			return Float.toString(m_data);
		} else {
			return String.format("(%s %s %s)", m_type,
								 m_leftChild.toString(), m_rightChild);
		}
	}
}
