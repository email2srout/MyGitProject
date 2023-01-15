package ConstructorTest;

public class SBIBank14 {
	
	int x;
	int y;
	{
		System.out.println("Instance Bloack");
		this.x=20;
	}
	
	public SBIBank14()
	{
		System.out.println("Constructor");
		this.y=20;
	}

	public static void main(String[] args) 
	{
		SBIBank14 sbi141 = new SBIBank14();
		System.out.println(sbi141.x);
		System.out.println(sbi141.y);
		
		
	}

}
