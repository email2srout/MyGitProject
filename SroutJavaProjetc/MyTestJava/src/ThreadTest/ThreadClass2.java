package ThreadTest;

public class ThreadClass2 implements Runnable
{

	public static void main(String[] args) {
		ThreadClass2 tc2 = new ThreadClass2();
		Thread t = new Thread(tc2);
		t.run();
		for (int j=0;j<5;j++)
		{
			System.out.println("This is main Thread running");
		}
		System.out.println(t.currentThread().getName());

	}

	@Override
	public void run() {
		for (int j=0;j<5;j++)
		{
			System.out.println("This is child Thread running");
		}
		
	}

}
