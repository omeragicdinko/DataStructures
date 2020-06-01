package HeapSortAlgorithm;

public class HeapSort {
	
	/* Heap sort algorithm */
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable [] elements) {
		BinaryHeap<IPAddress> heap = new BinaryHeap<IPAddress>();	// 1
		
		for (int i = 0; i < elements.length; i++) {				// 2
			heap.insert((IPAddress) elements[i]);							// 2
		}
		
		for (int i = elements.length - 1; i >= 0; i--) {		// 3
			elements[i] = heap.delMax();						// 3
		}
	}
}
