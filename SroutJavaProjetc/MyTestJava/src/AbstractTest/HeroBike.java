package AbstractTest;

public class HeroBike extends BikeClass
{
	HeroBike(int a) 
	  { super(a); // TODO Auto-generated constructor stub 
	  }
	  
	 
	@Override
	void runbike() {
		System.out.println("HeroBike is Runing");
		
	}
	public static void main(String[] args) 
	{
		HeroBike hb = new HeroBike(10);
		hb.runbike();
		hb.finalF2();
		hb.staticF1();
	}

	

}
