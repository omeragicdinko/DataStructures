package RadixSortAlgorithm;

import java.io.FileNotFoundException;
import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[4637053];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses);

		RadixSort.sort(ipAddresses); //running time: 12535 milliseconds

		Writer.WriteToFile("C:/Users/user/Desktop/1.csv",ipAddresses);
		
	}

}
