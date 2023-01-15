package GenericTest;

import java.util.ArrayList;

public class Generic1 <g extends Integer>
{
	g name;
	
	public g getmethod(g n)
	{
		return this.name;
	}
	
	public void setmethod(g n)
	{
		this.name=n;
	}

	public static void main(String[] args) 
	{
		System.out.println("Type sefety----------------------------------");
		ArrayList AL1 = new ArrayList();
		AL1.add("Shibaram");
		AL1.add(1233);
		ArrayList<Integer> AL2 = new ArrayList<Integer>();
		AL2.add(12);
		//AL2.add("shs");
		
		System.out.println("Provide any type of data to method======================");
		Generic1 gc1 = new Generic1();
		gc1.setmethod(100);
		System.out.println(gc1.getmethod(gc1.name));
		gc1.setmethod(1234);
		System.out.println(gc1.name);
		
		
		

	}

}
