package BottomUpMergeSortAlgorithm;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[4637053];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses);
	
		BottomUpMergeSort.sort(ipAddresses); //average running time after 3 runs: 3151 milliseconds -> slower
		
		Writer.WriteToFile("C:/Users/user/Desktop/2.csv",ipAddresses);
		
	}

}
