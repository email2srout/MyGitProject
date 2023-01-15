package ModifierTest;

public class ProtectedClass1 {
	
	protected int x = 30;
	protected void protected1()
	{
		System.out.println("Protected method");
	}
	

	public static void main(String[] args) {
		ProtectedClass1 pdc1 = new ProtectedClass1();
		System.out.println(pdc1.x);
		pdc1.protected1();

	}

}
