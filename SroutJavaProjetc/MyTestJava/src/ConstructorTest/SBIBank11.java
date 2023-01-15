package ConstructorTest;

import java.io.FileNotFoundException;

public class SBIBank11 extends SBIBank10
{

	public SBIBank11() throws FileNotFoundException {
		super();
		
	}

	public static void main(String[] args) {
		
		try {
			SBIBank11 sbi11 = new SBIBank11();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
