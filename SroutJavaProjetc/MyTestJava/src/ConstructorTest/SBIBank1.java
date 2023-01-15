package ConstructorTest;

public class SBIBank1 {
	int phone;
	String Name;

	SBIBank1()
	{
		phone =12345;
		Name = "Shibaram";
		
	}
	public static void main(String[] args) 
	{
		//Without constructor
		SBIBank1 sbi1 = new SBIBank1();
		//with constructor
		System.out.println(sbi1.Name);
		System.out.println(sbi1.phone);
		
		
	}

}
