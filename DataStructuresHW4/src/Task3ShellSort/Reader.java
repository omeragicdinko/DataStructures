package Task3ShellSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Reader {
	
	public static void readCSV(String path, IPAddress[] IPAddresses) throws FileNotFoundException{
		Scanner scanner=new Scanner(new File(path));
		int i=0;
		String modified;
		ArrayList<String> objects;
		while (scanner.hasNextLine()) {
			modified=scanner.nextLine();
			objects=new ArrayList<String>(Arrays.asList(modified.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)")));
			IPAddress k=new IPAddress(Long.parseLong(objects.get(0).replaceAll("\"","")),Long.parseLong(objects.get(1).replaceAll("\"","")),objects.get(2).replaceAll("\"",""),objects.get(3).replaceAll("\"",""),objects.get(4).replaceAll("\"",""),objects.get(5).replaceAll("\"",""));
			IPAddresses[i]=k;
			i++;
		}
		scanner.close();
		}
		
	}

