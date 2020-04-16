package RecursiveMergeSortAlgorithm;

import java.util.Comparator;

public class ByCountryName implements Comparator<IPAddress>{

	@Override
	public int compare(IPAddress v, IPAddress w) {
		
		return v.countryName.compareTo(w.countryName);
	}
	
}
