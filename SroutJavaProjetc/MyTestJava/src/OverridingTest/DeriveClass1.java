package OverridingTest;

public class DeriveClass1 extends BaseClass1
{
	private void f1()
	{
		System.out.println("Derive class  method");
	}
	public int sum(int a, int b,int c)
	{
		int r = a+b+c;
		System.out.println("Derive Class Call::"+r);
		return r;
	}
	
	public void mul(int a, int b, int c)
	{
		int val = a*b*c;
		System.out.println("Derive Class Call::"+val);
	}
	
	public void mul()
	{
		int val = 5*5;
		System.out.println("Derive Case Call--"+val);
	}

	public static void main(String[] args) 
	{
		BaseClass1 bc1 = new DeriveClass1();
		//System.out.println(bc1.sum(10,4));
		//bc1.mul();
		System.out.println("------------------------------");
		DeriveClass1 dc1 = new DeriveClass1();
		//System.out.println(dc1.sum(10, 5));
		//dc1.mul();
		System.out.println("--------------------------------");
		//dc1.mul(1, 2, 3);
		//dc1.sum(5, 10, 15);
		System.out.println("--------------------------------");
		bc1.F1();
		dc1.f1();
		
		
	}

}
