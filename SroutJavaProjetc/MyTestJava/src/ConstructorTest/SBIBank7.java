package ConstructorTest;

public class SBIBank7 {
	
	public SBIBank7()
	{
		System.out.println("Public constructor");
	}

	public void f1()
	{
		System.out.println("Access test of public constructor");
	}
	public static void main(String[] args) 
	{
		//Object allow to create inside class with public constructor
		SBIBank7 sbi71 = new SBIBank7();
		sbi71.f1();
	}

}
