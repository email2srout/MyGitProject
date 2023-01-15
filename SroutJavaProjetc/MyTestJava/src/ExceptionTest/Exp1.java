package ExceptionTest;

public class Exp1 {

	public void ex1()
	{
		try {
		int i=0/0;
		//System.out.println(i);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Fix the issue");
		}
	}
	
	public void exp2()
	{
		try {
		ArithmeticException ar =  new ArithmeticException("Ari");
		throw ar;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void exp3()throws ArithmeticException
	{
		int x=0/0;
		
	}
	
	public void exp4()
	{
		exp3();
		
	}
	public void exp5()
	{
		try {
			throw  new Exp2("User Exp");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		
		Exp1 obj = new Exp1();
		//obj.ex1();
		//obj.exp4();
		obj.exp5();
		
	}

}
