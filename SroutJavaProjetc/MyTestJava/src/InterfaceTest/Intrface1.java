package InterfaceTest;

public interface Intrface1 {
	// by default Public static Final  both x and y
	int x = 10;
	public static final int y = 20;
	public static final String Name = "";
	public static final int Phone = 0;
	
	
	void saveInfo();
	void printinfo();
	void duplicateInfo();
	default void defaultcmethod()
	{
		
	}
	static void staticmethod()
	{
		
	}

}
