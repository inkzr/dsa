/**
 * 
 */
package nkb.linit.dsa.binarytree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import javafx.util.Pair;

/**
 * @author enirbis
 *
 */
public class BinaryTree<T> {

	private Node<T> root;

	/**
	 * 
	 */
	public BinaryTree(Node<T> root) {
		this.root = root;
	}

	public void breadthFirst() {
		if (root == null)
			return;

		Queue<Pair<Node<T>, Integer>> queue = new LinkedList<>();
		queue.add(new Pair<>(root, 1));
		while (!queue.isEmpty()) {
			Pair<Node<T>, Integer> node = queue.remove();
			System.out.println(node);

			if (node.getKey().getLeftChild() != null)
				queue.add(new Pair<>(node.getKey().getLeftChild(), node.getValue() + 1));

			if (node.getKey().getRightChild() != null)
				queue.add(new Pair<>(node.getKey().getRightChild(), node.getValue() + 1));
		}
	}

	public void inOrder() {
		if (root == null)
			return;
		Set<Node<T>> visitedNodes = new HashSet<>();
		Stack<Node<T>> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node<T> top = stack.pop();
		}
	}

}
