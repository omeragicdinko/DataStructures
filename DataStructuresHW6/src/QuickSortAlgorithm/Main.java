package QuickSortAlgorithm;

import java.io.FileNotFoundException;
import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[4637053];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses);

		QuickSort.sort(ipAddresses); //running time: 1887 milliseconds (without shuffle), 2660 milliseconds (with shuffle)
		
		Writer.WriteToFile("C:/Users/user/Desktop/1.csv",ipAddresses);
		
	}

}
