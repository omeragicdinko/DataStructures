package BottomUpMergeSortAlgorithm;

public class BottomUpMergeSort extends AbstractSort {

	/* Bottom-up merge sort implementation */
	public static void sort(IPAddress[] elements) {
		IPAddress[] aux = new IPAddress[elements.length];										// 1
		for (int size = 1; size < elements.length; size *= 2) {						// 2
			for (int low = 0; low < elements.length - size; low += 2 * size) {		// 3
				int mid = low + size - 1;											// 4
				int high = Math.min(low + 2 * size - 1, elements.length - 1);		// 4
				merge(elements, aux, low, mid, high);								// 5
			}
		}
	}
	
	/* Merge the two sorted sub-arrays into a larger sorted (sub)array */
	private static void merge(IPAddress[] elements, IPAddress[] aux, int low, int mid, int high) {
		
		for (int k = low; k <= high; k++) {				// 1
			aux[k] = elements[k];						// 1
		}			
		
		int i = low;									// 2
		int j = mid + 1;								// 2
		for (int k = low; k <= high; k++) {				// 3
			if (i > mid) {								// 4
				elements[k] = aux[j++];					// 4
			} else if (j > high) {						// 5
				elements[k] = aux[i++];					// 5
			} else if (less(aux[j].ipFrom, aux[i].ipFrom)) {			// 6
				elements[k] = aux[j++];					// 6
			} else {									// 7
				elements[k] = aux[i++];					// 7
			}
		}
	}
}

