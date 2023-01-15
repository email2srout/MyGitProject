package ConstructorTest;

public class SBIBank2 {
	
	int num;
	SBIBank2()
	{
		System.out.println("Zero Argument");
	}
	SBIBank2(int a)
	{
		System.out.println("With Argument");
		num=a;
	}
	int SBIBank2(int x)
	{
		num=x;
		return num;
		
	}
	public static void main(String[] args) 
	{
		//Call zero argument constructor 
		SBIBank2 sbi21 = new SBIBank2();
		System.out.println(sbi21.num);
		//With Parameter Constructor 
		SBIBank2 sbi22 = new SBIBank2(10);
		System.out.println(sbi22.num);	
		//Call method
		SBIBank2 sbi23 = new SBIBank2();
		int R= sbi23.SBIBank2(30);
		System.out.println(R);
		

	}

}
