package ConstructorTest;

public class SBIBank8 
{
	public void f2()
	{
		System.out.println("Protested constructor Test SBIBank8");
	}

	protected SBIBank8()
	{
		System.out.println("Protected constructor of SBIBank8");
	}
	public static void main(String[] args) {
		
		//Public constructor allow to create outside class / inside package 
		SBIBank7 sbi72 = new SBIBank7();
		sbi72.f1();
		SBIBank8 sbi81 = new SBIBank8();
		sbi81.f2();

	}

}
