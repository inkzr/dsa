/**
 * 
 */
package nkb.linit.dsa.heaps;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ink
 *
 */
public abstract class Heap<T extends Comparable<T>> {

	private static int MAX_SIZE = 10;

	private T[] hArray;

	private int count;

	/**
	 * @param hArray
	 */
	@SuppressWarnings("unchecked")
	public Heap(Class<T> clazz) {
		this.hArray = (T[]) Array.newInstance(clazz, MAX_SIZE);
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == hArray.length;
	}

	public T getElementAtIndex(int index) {
		return hArray[index];
	}

	public int getParentIndex(int childIndex) {
		if (childIndex < 1 || childIndex >= count)
			return -1;
		int parentIndex = (childIndex - 1) / 2;
		return parentIndex;
	}

	public int getLeftChildIndex(int parentIndex) {
		if (parentIndex < 0)
			return -1;
		int leftChildIndex = 2 * parentIndex + 1;
		if (leftChildIndex >= count)
			return -1;
		return leftChildIndex;
	}

	public int getRightChildIndex(int parentIndex) {
		if (parentIndex < 0)
			return -1;
		int rightChildIndex = 2 * parentIndex + 2;
		if (rightChildIndex >= count)
			return -1;
		return rightChildIndex;
	}

	protected void swap(int firstElementIndex, int secondElementIndex) {
		T temp = hArray[firstElementIndex];
		hArray[firstElementIndex] = hArray[secondElementIndex];
		hArray[secondElementIndex] = temp;

	}

	public T getHighestPriority() throws HeapEmptyException {
		if (count == 0)
			throw new HeapEmptyException("There is no more element in heap.");
		return hArray[0];
	}

	public void insert(T data) throws HeapFullException {
		if (count >= hArray.length)
			throw new HeapFullException("There is not space left for new element.");
		hArray[count] = data;
		count++;
		siftUp(count - 1);
	}

	public T removeHighestPriority() throws HeapEmptyException {
		if (count == 0)
			throw new HeapEmptyException("There is no more element in heap.");
		T data = hArray[count - 1];
		hArray[count - 1] = null;
		count--;
		siftDown(0);
		return data;
	}

	protected abstract void siftUp(int index);

	protected abstract void siftDown(int index);

	@Override
	public String toString() {
		return Arrays.toString(hArray);
	}

	public String toTree() {
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		idx++;
		
		return sb.toString();
	}
}
