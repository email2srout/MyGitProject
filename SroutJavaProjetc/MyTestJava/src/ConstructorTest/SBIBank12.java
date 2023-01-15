package ConstructorTest;

public class SBIBank12 {
	
	int x;
	public SBIBank12()
	{
		x=10;
		System.out.println("X vaue set");
	}
	public void mul()
	{
		System.out.println(this.x*10);
	}

	public static void main(String[] args) {
		
		SBIBank12 sbi121 = new SBIBank12();
		System.out.println(sbi121.x);
		sbi121.mul();
		//static method we cannot use this
		//System.out.println(this.x);
	}

}
