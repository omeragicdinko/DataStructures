package RecursiveMergeSortAlgorithm;

import java.util.Comparator;

public class RecursiveMergeSort extends AbstractSort {
	
	/* Merge sort algorithm (public invocation) */
	public static void sort(IPAddress[] elements) {
		IPAddress[] aux = new IPAddress[elements.length];			// 1
		sort(elements, aux, 0, elements.length-1);	// 2
	}
	
	private static void sort(IPAddress[] elements, IPAddress[] aux, int low, int high) {
		if (high <= low) {								// 1
			return;										// 1
		}
		
		int mid = low + (high - low) / 2;				// 2
		sort(elements, aux, low, mid);					// 3
		sort(elements, aux, mid + 1, high);				// 3
		merge(elements, aux, low, mid, high);			// 4
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

	
	public static void sort(IPAddress[] elements, Comparator<IPAddress> a) {
		IPAddress[] aux = new IPAddress[elements.length];
		sort(elements, aux, 0, elements.length-1,a);
	}
	
	
	private static void sort(IPAddress[] elements, IPAddress[] aux, int low, int high,Comparator<IPAddress> a) {
		if (high <= low) {								// 1
			return;										// 1
		}
		
		int mid = low + (high - low) / 2;				// 2
		sort(elements, aux, low, mid, a);					// 3
		sort(elements, aux, mid + 1, high, a);				// 3
		merge(elements, aux, low, mid, high, a);			// 4
	}

	private static void merge(IPAddress[] elements, IPAddress[] aux, int low, int mid, int high,Comparator<IPAddress> a) {
		
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
			} else if (a.compare(aux[j], aux[i])<0) {			// 6
				elements[k] = aux[j++];					// 6
			} else {									// 7
				elements[k] = aux[i++];					// 7
			}
		}
	}
}