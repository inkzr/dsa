/**
 * 
 */
package nkb.linit.dsa.heaps;

import java.util.Random;

/**
 * @author enirbis
 *
 */
public class HeapTestMain {

	/**
	 * 
	 */
	public HeapTestMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws HeapFullException
	 */
	public static void main(String[] args) throws HeapFullException {
		Heap<Integer> maxHeap = new MaxHeap<>(Integer.class);
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			maxHeap.insert(rand.nextInt(100));
		}
		System.out.println("MAX_HEAP");
		System.out.println(maxHeap);
		
		
		Heap<Integer> minHeap = new MinHeap<>(Integer.class);
		for (int i = 0; i < 10; i++) {
			minHeap.insert(rand.nextInt(100));
		}
		System.out.println("MIN_HEAP");
		System.out.println(minHeap);
	}

}
