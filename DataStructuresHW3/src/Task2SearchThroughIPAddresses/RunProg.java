package Task2SearchThroughIPAddresses;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class RunProg {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		IPAddress[] ipAddresses=new IPAddress[10000];
		
		Reader.readCSV("C:/Users/user/Desktop/1.csv",ipAddresses);
		System.out.println("Please input the ip address which you want to seach for below:");
		Scanner read=new Scanner(System.in);
		String ip=read.nextLine();
		
		long pp=IPAddressConverter.convertToNumber(ip);
		
		
		IPAddress.searchLocation(ipAddresses,pp);
		
		read.close();
	}
	
}
