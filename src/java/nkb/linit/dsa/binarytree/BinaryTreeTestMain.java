/**
 * 
 */
package nkb.linit.dsa.binarytree;

/**
 * @author enirbis
 *
 */
public class BinaryTreeTestMain {

	/**
	 * 
	 */
	public BinaryTreeTestMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Character> a = new Node<>('A');
		Node<Character> b = new Node<>('B');
		Node<Character> c = new Node<>('C');
		Node<Character> d = new Node<>('D');
		Node<Character> e = new Node<>('E');
		Node<Character> f = new Node<>('F');
		Node<Character> g = new Node<>('G');
		Node<Character> h = new Node<>('H');
		a.setLeftChild(b);
		a.setRightChild(c);
		b.setLeftChild(e);
		b.setRightChild(f);
		f.setLeftChild(h);
		e.setRightChild(g);

		/*
		 * System.out.println(a); System.out.println(b); System.out.println(c);
		 * System.out.println(d); System.out.println(f); System.out.println(g);
		 * System.out.println(h); System.out.println(e);
		 */

		BinaryTree<Character> bt = new BinaryTree<>(a);
		bt.breadthFirst();
	}

}
