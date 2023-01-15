package InnerClassTest;

public class NestedInnerClass1 {
	
	public void show()
	{
		System.out.println("Outer Class");
	}
	
	class Department1
	{
		public void show()
		{
			System.out.println("Inner Class");
		}
	}

	public static void main(String[] args) 
	{
		NestedInnerClass1.Department1 ud1 = new NestedInnerClass1().new Department1();
		ud1.show();
		NestedInnerClass1 u1 = new NestedInnerClass1();
		u1.show();
		

	}

}
