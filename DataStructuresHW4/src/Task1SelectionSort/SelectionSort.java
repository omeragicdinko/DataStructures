package Task1SelectionSort;

public class SelectionSort extends AbstractSort {
	
	/* Selection sort algorithm */
	public static void sort(IPAddress[] elements) {
		for (int i = 0; i < elements.length; i++) {				
			int min = i;										
			for (int j = i + 1; j < elements.length; j++) {		
				if (less(elements[j].ipFrom, elements[min].ipFrom)) {			
					min = j;									
				}
			}
			swap(elements, i, min);								
		}
	}
}


