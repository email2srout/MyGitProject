package InterfaceTest;

public interface Intrface4 {
	
	public abstract void F1();
	default void F2()
	{
		System.out.println("It is a default method");
	}
	static int F3(int i)
	{
		System.out.println("It is Static Method");
		return i*i;
	}

}
