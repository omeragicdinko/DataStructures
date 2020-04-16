package Task2SearchThroughIPAddresses;

import Task2SearchThroughIPAddresses.BinarySearch;

public class IPAddress implements Comparable<IPAddress>{
	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	
	public IPAddress(long ipFrom,long ipTo,String countryCode,String countryName,String regionName,String cityName) {
		this.ipFrom=ipFrom;
		this.ipTo=ipTo;
		this.countryCode=countryCode;
		this.countryName=countryName;
		this.regionName=regionName;
		this.cityName=cityName;
	}
	
	@Override
	public int compareTo(IPAddress ip) {
		if(this.ipFrom>ip.ipFrom) {
			return 1;
		}
		else if(this.ipFrom<ip.ipFrom) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		return '"'+String.valueOf(this.ipFrom)+'"'+","+'"'+String.valueOf(this.ipTo)+'"'+","+'"'+this.countryCode+'"'+","+'"'+this.countryName+'"'+","+'"'+this.regionName+'"'+","+'"'+this.cityName+'"';
	}
	
	public static void searchLocation(IPAddress[] ipAddresses,long ipAsNumber) {
		int i=BinarySearch.search(ipAddresses, ipAsNumber);
		if(i!=-1) {
			System.out.println("Geographical information about that IP address: \n Country: "+ipAddresses[i].countryName+"\n Region: "+ipAddresses[i].regionName+"\n City: "+ipAddresses[i].cityName);
		}
		else {
			System.out.println("The data has not been found");
		}
	}
	
	
}
