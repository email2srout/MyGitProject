package ThreadTest;

public class ThreadClass1 extends Thread
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("This is child thread running");
		}
	}
	
	
	
	public static void main(String[] args) {
		ThreadClass1 tc1 = new ThreadClass1();
		tc1.start();
		for (int j=0;j<5;j++)
		{
			System.out.println("This is Main Thread running");
		}
		
		
	}

}
