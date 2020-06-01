package HeapSortAlgorithm;

import java.io.FileNotFoundException;
import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[4637053];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses);

		HeapSort.sort(ipAddresses); //running time: 7989 milliseconds

		Writer.WriteToFile("C:/Users/user/Desktop/2.csv",ipAddresses);
		
	}

}
