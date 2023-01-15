package SingletonTest;

public class SingleTonClass1 {

	public static SingleTonClass1 stc = new SingleTonClass1();
	public static SingleTonClass1 getSingletonObject()
	{
		return stc;
		
	}
	private SingleTonClass1(){	
	}
	
	public int Num1,Num2;
	
	public void sum(int n1,int n2)
	{
		int sum=n1+n2;
		this.Num1=n1;
		this.Num2=n2;
		System.out.println("Sum:"+sum);
		System.out.println("Num1:"+this.Num1);
		System.out.println("Num2:"+this.Num2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
