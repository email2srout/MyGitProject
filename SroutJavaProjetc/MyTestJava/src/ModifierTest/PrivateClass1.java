package ModifierTest;

public class PrivateClass1 {
	//Outer class cannot private
	private int age=20;
	private String name = "Shibaram";

	private PrivateClass1()
	{
		System.out.println("Private Constructor");
	}
	public PrivateClass1(int a)
	{
		System.out.println(a*a);
		
	}
	private void Private1()
	{
		System.out.println("Private Class but public method");
	}
	
	public static void main(String[] args) 
	{
		PrivateClass1 pc1 = new PrivateClass1();
		pc1.Private1();


	}
	

}
