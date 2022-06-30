/**
 * 
 */
package nkb.linit.dsa.heaps;

/**
 * @author enirbis
 *
 */
public class MaxHeap<T extends Comparable<T>> extends Heap<T> {

	public MaxHeap(Class<T> clazz) {
		super(clazz);
	}

	@Override
	protected void siftUp(int index) {
		int parentIndex = getParentIndex(index);
		if (parentIndex == -1)
			return;
		if (getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0) {
			swap(parentIndex, index);
			siftUp(parentIndex);
		}
	}

	@Override
	protected void siftDown(int index) {
		int leftChildIndex = getLeftChildIndex(index);
		int rightChildIndex = getRightChildIndex(index);

		int childIndexWithMaxValue = -1;
		if (leftChildIndex != -1 && rightChildIndex != -1) {
			T leftElement = getElementAtIndex(leftChildIndex);
			T rightElement = getElementAtIndex(rightChildIndex);

			if (leftElement.compareTo(rightElement) > 0) {
				childIndexWithMaxValue = leftChildIndex;
			} else {
				childIndexWithMaxValue = rightChildIndex;
			}
		} else if (leftChildIndex == -1) {
			childIndexWithMaxValue = rightChildIndex;
		} else if (rightChildIndex == -1) {
			childIndexWithMaxValue = leftChildIndex;
		}

		if (childIndexWithMaxValue == -1) {
			return;
		}

		if (getElementAtIndex(childIndexWithMaxValue).compareTo(getElementAtIndex(index)) > 0) {
			swap(childIndexWithMaxValue, index);
			siftDown(childIndexWithMaxValue);
		}
	}

}
