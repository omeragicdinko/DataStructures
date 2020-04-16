package Task2InsertionSort;

public class InsertionSort extends AbstractSort {
	
	/* Insertion sort algorithm */
	public static void sort(IPAddress[] elements) {
		for (int i = 0; i < elements.length; i++) {				
			for (int j = i; j > 0; j--) {						
				if (less(elements[j].ipFrom, elements[j - 1].ipFrom)) {	
					swap(elements, j, j - 1);					
				} else {
					break;										
				}
			}
		}
	}
}


