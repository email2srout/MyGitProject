package AbstractTest;

public abstract class BikeClass {
	int bikelength;
	//Abstract class constructor 
	BikeClass()
	{
		System.out.println("OK");
	}
	
	
	  BikeClass(int a) {
	  System.out.println("by Constructor setting value to Data Member");
	  this.bikelength = a; System.out.println(bikelength); }

	//Abstract method. it has Abstract Keyword and no body
	abstract void runbike();
	public void px()
	{
		System.out.println("Non Abstract");
	}
	public static void staticF1()
	{
		System.out.println("Static Method");
	}
	public final void finalF2()
	{
		System.out.println("Final Method");
	}

}
