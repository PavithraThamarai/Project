package org.green;

import java.io.File;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Pavithra\\Downloads");
		//boolean b= f.createNewFile();
		//System.out.println(b);
		//String[] s= f.list();
		//for(String x:s)
		File[] l= f.listFiles();
		for(File x:l)
		{
			System.out.println(x);
		}
	}

}
