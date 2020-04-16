package BottomUpMergeSortAlgorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public static void WriteToFile(String path,IPAddress[] ipAddresses) throws IOException{
		File file = new File(path);
		FileWriter fw=new FileWriter(file);
		for (int i=0;i<ipAddresses.length;i++) {
			fw.write(ipAddresses[i].toString()+"\n");
		}
		fw.close();
	}
}
