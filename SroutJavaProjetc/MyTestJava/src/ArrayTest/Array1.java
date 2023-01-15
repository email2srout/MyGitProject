package ArrayTest;

import java.util.Arrays;

public class Array1 {
	public static String [] L1 = {"Ravi","Kavi","Savi","Tobi"};
	
	
	public void declareArray()
	{
		int [] x;
		System.out.println("declare without size");
		String [] name = new String[5];
		System.out.println("declare with size");
		String [] month = {"Jan","Feb","March"};
		System.out.println("declare and set value");
	}
	public void readDatafromArray()
	{
		String [] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		for(int i=0;i<=month.length-1;i++)
		{
			System.out.println("Month::"+month[i]);
		}
	}
	
	public void arrayAutoSize()
	{
		String [] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("Size of month:"+ month.length);
		String [] month1 = {"Jan","Feb","Mar","Apr"};
		System.out.println("size of month1:"+ month1.length);
		month1=month;
		System.out.println("Big Array assinged in to small array");
		for(int i=0;i<=month1.length-1;i++)
		{
			System.out.println("Month::"+month1[i]);
		}
	}
	
	public void copyofArraymethod()
	{
		
	}
	
	public void cloneofArray()
	{
		int [] i= {1,5,8,10};
		int [] j = i.clone();
		for(int x = 0; x<=j.length-1;x++)
		{
			System.out.println(j[x]);
		}
	}
	
	public void sendArrayAsArgument(String[]J)
	{
		String [] K = J.clone();
		for (int i = 0; i <=K.length-1;i++)
		{
			System.out.println(K[i]);
		}
		
		
	}
	public String [] returnArray()
	{
		String [] K = {"Ravi","Kavi","Savi","Tobi"};
		
		return K;
	}
	public  void AraysClassMethods()
	{
		System.out.println("binarySearch(Array, element) predrine Array Class method to get index");
		System.out.println("*******************************************************************");
		int ix = Arrays.binarySearch(L1, "Kavi");
		System.out.println(ix);
		
		System.out.println("sort(array) predefine array class method to sort array value");
		System.out.println("*******************************************************************");
		String[] sname = {"Shiba", "Aru", "Deepak"};
		Arrays.sort(sname);
		for (int i=0;i<=sname.length-1;i++)
		{
			System.out.println(sname[i]);
		}
		System.out.println("compare(array1,array2) to compare array and return 1,-1 0r 0");
		System.out.println("*******************************************************************");
		String[] rname = {"Shiba", "Aru", "Deepak"};
		System.out.println(Arrays.compare(rname, sname));
		
		System.out.println("copyof(array, array length) to copy data");
		System.out.println("*******************************************************************");
		int [] A1= {1,5,8,10};
		int [] A2 = Arrays.copyOf(A1, A1.length);
		for(int x = 0; x<=A2.length-1;x++)
		{
			System.out.println(A2[x]);
		}
		
		System.out.println("equals(Array1,Array2) is used to compare the equality of 2 array return true/false");
		System.out.println("*******************************************************************");
		String[] Aname = {"Shiba", "Aru", "Deepak"};
		String[] Bname = {"Shiba", "Aru", "deepak"};
		System.out.println(Arrays.equals(Aname, Bname));
		
		System.out.println("toString(Array1,Array2) to convert to string");
		System.out.println("*******************************************************************");
		int[] intnom = {1,5,10};
		System.out.println(Arrays.toString(intnom));
		
	}
	
	
	public void md2array()
	{
		int [][] mda = new int[2][3];
		//[] first size is for row
		//[] second size for column
		//first row 
		mda[0][0]=100;// 1st column 
		mda[0][1]=101;// 2nd column
		mda[0][2]=102;//3rd column
		//second row
		mda[1][0]=110;// 1st column 
		mda[1][1]=111;// 2nd column
		mda[1][2]=112;//3rd column
		
		for (int i=0; i<=mda.length-1;i++)
		{
			for (int j=0;j<=mda[i].length-1;j++)
			{
				System.out.println(mda[i][j]);
			}
		}
	}

	public static void main(String[] args) {
		Array1 a1 = new Array1();
		//a1.readDatafromArray();
		//a1.arrayAutoSize();
		//a1.copyofArraymethod();
		//a1.cloneofArray();
		//a1.sendArrayAsArgument(L1);
		//a1.sendArrayAsArgument(a1.returnArray());
		a1.AraysClassMethods();
		//a1.md2array();
		
		
	}

}
