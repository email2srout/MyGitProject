package OverridingTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BaseClass1 {
	public int sum(int a, int b)
	{
		int r = a+b;
		System.out.println("Base Class Call--"+r);
		return r;
		
	}
	
	public void mul()
	{
		
		int val = 10*10;
		System.out.println("Base Case Call--"+val);
	}
	
	public  void F1()
	{
		System.out.println("Base  method");
		//File file = new File("C:\\demo\\demofile.txt");
		//FileInputStream fis=new FileInputStream(file);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
