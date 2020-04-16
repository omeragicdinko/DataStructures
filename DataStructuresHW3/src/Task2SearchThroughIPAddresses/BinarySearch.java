package Task2SearchThroughIPAddresses;

public class BinarySearch {

	/* Binary search algorithm for integer arrays */
	public static int search(IPAddress[] elements, long key) {
		int low = 0;									
		int high = elements.length - 1;					
		
		while (low <= high) {							
			int mid = low + (high - low) / 2;			
			if (key < elements[mid].ipFrom) {					
				high = mid - 1;							
			} else if (key > elements[mid].ipTo) {			
				low = mid + 1;							
			} else {									
				return mid;								
			}
		}
		return -1;		
	}
}