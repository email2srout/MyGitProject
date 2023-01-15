package InnerClassTest;

public class MethodLocalInnerClass1 {
	
	private String name = "shibaram";
	public String address = "Bangalore";
	public String  mob = "9731931298";
	
	void Inmethod()
	{
		System.out.println("Inside outer Inner Class");
	}
	public void outerClassMethod()
	{
		int a=10;
		class innerClass1
		{
			int ix = 20;
			void Inmethod()
			{
				System.out.println("Inside Method Inner Class");
			}
		}
		
		innerClass1 ocm1 = new innerClass1();
		ocm1.Inmethod();
		
		
		System.out.println("Inside Method Print");
	}

	
	public class classInner1
	{
		public void F1()
		{
			System.out.println("Inside Nexted Inner Class");
		}
	}
	public static void main(String[] args) {
		
		MethodLocalInnerClass1 mlic1 = new MethodLocalInnerClass1();
		mlic1.outerClassMethod();
	}

}
