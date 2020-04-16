package Task1SelectionSort;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RunProg {

	public static void main(String[] args) throws IOException,FileNotFoundException {

		IPAddress[] ipAddresses1=new IPAddress[10000];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses1);
		
		SelectionSort.sort(ipAddresses1);
		
		Writer.WriteToFile("C:/Users/user/Desktop/2.csv",ipAddresses1);

	}

}
