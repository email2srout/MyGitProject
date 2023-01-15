package ConstructorTest;

public class SBIBank13 extends SBIBank12{
	
	public void mulchild()
	{
		
		super.mul();
		
	}
	
	public SBIBank13()
	{
		super();
	}

	public static void main(String[] args) 
	{
		
		SBIBank13 sbi131 = new SBIBank13();
		sbi131.mulchild();
		
	}

}
