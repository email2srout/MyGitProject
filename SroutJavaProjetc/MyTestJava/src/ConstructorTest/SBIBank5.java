package ConstructorTest;

public class SBIBank5 {
	
	private SBIBank5()
	{
		System.out.println("Private constructor");
	}
	
	
	public static void main(String[] args) {
		
		//Private constructor allow create object inside class
		SBIBank5 sbi5 = new SBIBank5();
		

	}

}
