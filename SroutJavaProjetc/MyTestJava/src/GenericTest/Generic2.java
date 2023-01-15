package GenericTest;

public class Generic2 <A extends Integer,B extends String>{
	
	A Num;
	B Name;
	int x;
	public void setval(A a, B b)
	{
		this.Name=b;
		this.Num=a;
	}
	
	public A getNum()
	{
		return Num;
	}
	public B getName()
	{
		return Name;
		
	}
	public static void main(String[] args) 
	{
		Generic2 gc2 = new Generic2();
		gc2.setval(123, "shibaram");
		//gc2.setval("shibaram", 1223);
		System.out.println(gc2.getName());
		System.out.println(gc2.getNum());

	}

}
