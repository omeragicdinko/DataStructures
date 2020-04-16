package Task1SortTheIP2LocationFile;

import java.io.FileNotFoundException;
import java.io.IOException;



public class RunProg {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		IPAddress[] ipAddresses=new IPAddress[10000];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses);
		
		BubbleSort.sort(ipAddresses);
		
		Writer.WriteToFile("C:/Users/user/Desktop/1.csv",ipAddresses);
		
	}
	
}
