package DataTypeTest;

public class Test1 {
	
	public void V1()
	{
		final  int x=10;
		System.out.println(x);
		
	}
	

	public static void main(String[] args) {
		System.out.println("Test1");
		int x = 10;
		@SuppressWarnings("removal")
		Integer ix=11;
		System.out.println(ix);
		ix =x;
		System.out.println(x);
		int x1 = 10;
		double x2 = 100;
		x1=(int) x2;
				
		 
		

	}

}
