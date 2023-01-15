package ConstructorTest;

public class SBIBank15 {

	int houseno;
	String Name;
	public SBIBank15(int a, String s)
	{
		houseno=a;
		Name=s;
	}
	
	public SBIBank15(SBIBank15 sbi15)
	{	
		houseno=sbi15.houseno;
		Name=sbi15.Name;
	}
	public static void main(String[] args) {

		SBIBank15 sbi151 = new SBIBank15(10,"Shibaram");
		System.out.println(sbi151.houseno);
		System.out.println(sbi151.Name);
		SBIBank15 sbi152 = sbi151; // OBject reference keep an object data by pointing to same memory
		System.out.println(sbi152.houseno);
		System.out.println(sbi152.Name);
		//Copy Object data into another object, at this pointing to different memory
		SBIBank15 sbi153 = new SBIBank15(sbi151);
		

	}

}
