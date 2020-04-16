package RecursiveMergeSortAlgorithm;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[4637053];
		ipAddresses=Reader.parse("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		
		RecursiveMergeSort.sort(ipAddresses); //average running time after 3 runs: 2010 milliseconds -> faster
		
		//RecursiveMergeSort.sort(ipAddresses, new ByCountryName()); //In this line IP Addresses are sorted by city name because the comparator is implemented in this merge sort implementation
		
		//Please remove the comment from the line 16 to sort it by city name
		
		Writer.WriteToFile("C:/Users/user/Desktop/3.csv",ipAddresses);
		
	}

}
