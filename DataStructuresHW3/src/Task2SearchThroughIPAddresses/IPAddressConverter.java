package Task2SearchThroughIPAddresses;

import java.util.ArrayList;
import java.util.Arrays;

public class IPAddressConverter {
	
	public static long convertToNumber(String read) {
		ArrayList<String> sections=new ArrayList<String>(Arrays.asList(read.split("\\.")));
		long ipAsNumber=16777216*Long.parseLong(sections.get(0)) + 65536*Long.parseLong(sections.get(1)) + 256*Long.parseLong(sections.get(2))+Long.parseLong(sections.get(3)) ;
		return ipAsNumber;
	}
}
