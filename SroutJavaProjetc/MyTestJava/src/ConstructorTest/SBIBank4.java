package ConstructorTest;

public class SBIBank4 extends SBIBank2{
	
	int age;
	public static void main(String[] args) {
		//No constructor so JVM call default constructor . 
		SBIBank4 sbi41 = new SBIBank4();
		System.out.println(sbi41.age);

	}

}
