package Task3ShellSort;

import java.io.FileNotFoundException;
import java.io.IOException;


public class RunProg {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses3=new IPAddress[4637053];
		Reader.readCSV("C:/Users/user/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv", ipAddresses3);
		
		ShellSort.sort(ipAddresses3);
		
		Writer.WriteToFile("C:/Users/user/Desktop/4.csv",ipAddresses3);

	}

}
