package Task2InsertionSort;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RunProg {

	public static void main(String[] args) throws FileNotFoundException,IOException  {

		IPAddress[] ipAddresses2=new IPAddress[10000];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses2);
		
		InsertionSort.sort(ipAddresses2);
		
		Writer.WriteToFile("C:/Users/user/Desktop/3.csv",ipAddresses2);


	}

}
