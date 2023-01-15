package AbstractTest;

public class SR2 extends SR1
{

	public SR2(int z) {
		super(z);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SR2 obj = new SR2(9);
		obj.F1();
		obj.F2();
		obj.F4();
		
	}

	@Override
	public void F1() {
		System.out.println("F1 Override");
		
	}

	@Override
	public int F2() {
		System.out.println("F1 Override");
		return 0;
	}

}
