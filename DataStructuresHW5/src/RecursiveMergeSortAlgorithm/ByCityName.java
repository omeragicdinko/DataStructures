package RecursiveMergeSortAlgorithm;

import java.util.Comparator;

public class ByCityName implements Comparator<IPAddress>{

	@Override
	public int compare(IPAddress v, IPAddress w) {
		
		return v.cityName.compareTo(w.cityName);
	}
	
}
