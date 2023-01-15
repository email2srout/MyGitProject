package ConstructorTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SBIBank10 {
	
	public SBIBank10() throws FileNotFoundException
	{
		System.out.println("Public SBIBank10 Constructor");
		String filepath="File Not Found";
		File fobj = new File(filepath);
		FileInputStream fis = new FileInputStream(fobj);
	}
	


	public static void main(String[] args) {
		
		SBIBank9 sbi92 = new SBIBank9();

	}

}
