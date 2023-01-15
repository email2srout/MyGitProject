package InnerClassTest;

public class StaticInnerClass1 {
	
	public static String name ="UST";
	public int age = 20;
	
	public static void OuterF1()
	{
		System.out.println("outer class static methdo");
	}
	public void outerF2()
	{
		System.out.println("Outer class non static");
	}
	
	static class innerx
	{
		public void innerxF1()
		{
			System.out.println("Static Inner Class non ststic method");
			//outerF2();
			//OuterF1();
			//System.out.println(StaticInnerClass1.name);
		}
		public static  void innerxF2()
		{
			System.out.println("Static Inner Class  ststic method");
			OuterF1();
			System.out.println(StaticInnerClass1.name);
		}
	}

	public static void main(String[] args) {
	
		StaticInnerClass1.innerx.innerxF2();
	}

}
