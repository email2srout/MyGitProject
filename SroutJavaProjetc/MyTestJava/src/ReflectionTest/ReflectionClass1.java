package ReflectionTest;

import java.lang.reflect.Method;

public class ReflectionClass1 {
	
	int Age=10;
	String Name="Shibaram";
	ReflectionClass1()
	{
		System.out.println("Zero Argument");
	}
	ReflectionClass1(int a)
	{
		System.out.println("1 Argument");
	}
	
	public void F1()
	{
		System.out.println("F1");
	}
	public void F2()
	{
		System.out.println("F1");
	}
	public static void main(String[] args) 
	{
		ReflectionClass1 ox = new ReflectionClass1();
		Class c = ox.getClass();
		System.out.println(c.getName());
		Method[] x = c.getMethods();
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
		
		

	}

}
