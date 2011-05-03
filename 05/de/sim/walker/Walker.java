package de.sim.walker;

import de.sim.tree.*;

public class Walker {

	public int walk(Node node) {
		if (node.getType() == 'l') {
			return node.getData();
		}

		int left = walk(node.getLeftChild());
		int right = walk(node.getRightChild());
		
		switch (node.getType()) {
		case '+': return left + right;
		case '-': return left - right;
		case '*': return left * right;
		case '/': return left / right;
		default: return 0;
		}
	}
}
