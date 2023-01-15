package StringTest;

public class String1 {
	
	String XS = "ShibaramRout1";
	int Age =34;
	public void SF1()
	{
		System.out.println("Method");
	}
	
	public String toString()
	{
		return XS +":"+ Age;
		
	}

	public static void main(String[] args) 
	{
		System.out.println("String are immuitable=================================");
		String s = "shibaram";
		s.concat("Rout");
		System.out.println(s);
		
		
		System.out.println("String Litral refer to same memory location if value same==================");
		String Name1 = "Dasarathi";
		String Name2 = "Dasarathi";
		System.out.println(Name1==Name2);
		
		System.out.println("String object always create in new memory location==========================");
		String s2 = new String("Rout");
		String s3 = new String("Rout");
		System.out.println(s2==s3);
		
		System.out.println("String Constructor=====================================");
		String obj1 = new String();
		System.out.println(obj1);
		String obj2 = new String("shibaram");
		System.out.println(obj2);
		char[] ch1 = {'a','b','c'};
		String obj3 = new String(ch1);
		System.out.println(obj3);
		StringBuffer obj4 = new StringBuffer("shibaram rout");
		String obj5 = new String(obj4);
		System.out.println(obj5);
		
		System.out.println("String Class Method Use======================");
		String m1= "Shiba";
		String m2= "ram";
		String m3 = new String("ShibaRam");
		String m4 = new String("Rout");
		m1.concat(m2);
		System.out.println(m1);
		m3.concat(m4);
		System.out.println(m3);
		String m5 = m1.concat(m2);
		System.out.println(m5);
		System.out.println(m5.charAt(3));
		System.out.println(m5.equals(m3));
		System.out.println(m5.equalsIgnoreCase(m3));
		System.out.println(m3.substring(4));
		System.out.println(m3.length());
		System.out.println(m3.replace('h', 'x'));
		System.out.println(m3);
		System.out.println(m3.toLowerCase());
		System.out.println(m3.toUpperCase());
		System.out.println(m3.indexOf('b'));
		System.out.println(m3.lastIndexOf('a'));
		
		String1 sobj1 = new String1();
		String1 sobj2 = new String1();
		System.out.println(sobj1);
		System.out.println(sobj2);
		
		
		
		
		

	}

}
