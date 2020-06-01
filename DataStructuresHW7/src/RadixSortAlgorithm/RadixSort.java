package RadixSortAlgorithm;

public class RadixSort {

	/* Radix sort algorithm (public invocation) */
	public static void sort(IPAddress[] elements) {
		long max = getMax(elements);							// 1
		
		for (long exp = 1; max / exp > 0; exp *= 10) {		// 2
			sort(elements, exp);							// 3
		}
	}

	/* Digit-wise radix sort logic */
	private static void sort(IPAddress[] elements, long exp) {
		IPAddress[] aux = new IPAddress[elements.length];					// 1
		int[] frequency = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};		// 2
		
		for (int i = 0; i < elements.length; i++) {				// 3
			long digit = (elements[i].ipFrom / exp) % 10;				// 3
			frequency[(int) digit]++;									// 3
		}
		
		for (int i = 1; i < 10; i++) {							// 4
			frequency[i] += frequency[i - 1];					// 4
		}
		
		for (int i = elements.length - 1; i >= 0; i--) {		// 5
			long digit = (elements[i].ipFrom / exp) % 10;				// 5
			aux[frequency[(int)digit] - 1] = elements[i];			// 5
			frequency[(int)digit]--;									// 5
		}
		
		for (int i= 0; i < elements.length; i++) {				// 6
			elements[i] = aux[i];								// 6
		}
	}
	
	/* Find the maximum element in the array */
	private static long getMax(IPAddress[] elements) {
		long max = elements[0].ipFrom;							// 1
		for (int i = 1; i < elements.length; i++) {		// 2
			if (elements[i].ipFrom > max) {					// 3
				max = elements[i].ipFrom;						// 3
			}
		}
		return max;										// 4
	}
}


