package de.sim.tree;

public class Node {

	private Node m_leftChild;
	private Node m_rightChild;
	private int m_data;
	private char m_type;

	public Node() {}

	public Node(char type) {
		m_type = type;
	}

	public Node(int data) {
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

	public int getData() {
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
			return Integer.toString(m_data);
		} else {
			return String.format("(%s %s %s)", m_type,
								 m_leftChild.toString(), m_rightChild);
		}
	}
}
