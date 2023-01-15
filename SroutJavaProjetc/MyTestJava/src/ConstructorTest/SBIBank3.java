package ConstructorTest;

public class SBIBank3 extends SBIBank2{

	public static void main(String[] args) {
		
		//SBIBank2 has constructor and method but by below object of SBIBank3, 
		//only method of SBIBank2 accessible
		SBIBank3 sbi31 = new SBIBank3();
		
	}

}
