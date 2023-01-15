package InterfaceTest;

public class IntroClass4 implements Intrface4
{

	public static void main(String[] args) {
		
		//IntroClass4 ic4 = new IntroClass4();
		Intrface4 ic4 = new IntroClass4();
		ic4.F1();
		ic4.F2();
		System.out.println(Intrface4.F3(5));
		
	}

	@Override
	public void F1() {
		System.out.println("It F1");
		
	}

}
