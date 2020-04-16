package Task3ShellSort;

public class ShellSort extends AbstractSort {

	/* Shell sort algorithm */
	public static void sort(IPAddress[] elements) {
		int h = 1;														
		while (h < elements.length / 3) {								
			h = 3 * h + 1;												
		}
		
		while (h >= 1) {												
			for (int i = h; i < elements.length; i++) {					
				for (int j = i; j >= h; j -= h) {						
					if (less(elements[j].ipFrom, elements[j - h].ipFrom)) {			
						swap(elements, j, j - h);						
					} else {
						break;											
					}
				}
			}
			h = h / 3;													
		}
	}

	
}
