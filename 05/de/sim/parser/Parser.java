package de.sim.parser;

import de.sim.tree.*;

public class Parser {

	private int m_pos;

	private Node parse(final String tree) {
		Node node = new Node();
		while (m_pos < tree.length()) {
			char c = tree.charAt(m_pos);
			switch (c) {
			case ' ':
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				node.setType(c);
				break;
			case '(':
				m_pos++;
				if (node.getLeftChild() == null) {
					node.setLeftChild(parse(tree));
				} else {
					node.setRightChild(parse(tree));
				}
				break;
			case ')':
				return node;
			default:
				int data = Character.digit(c, 10);
				Node child = new Node(data);
				if (node.getLeftChild() == null) {
					node.setLeftChild(child);
				} else {
					node.setRightChild(child);
				}
			}
			m_pos++;
		}

		return node;
	}

	public Node start(final String tree) {
		m_pos = 1;
		return parse(tree);
	}
}
