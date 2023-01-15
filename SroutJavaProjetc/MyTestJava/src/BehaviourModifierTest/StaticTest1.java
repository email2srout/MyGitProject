package BehaviourModifierTest;

public class StaticTest1 extends FinalTest1
{
	
	public static void F1()
	{
		System.out.println("Static F1 Method Call");
	}

	public int F2(int a, int b)
	{
		return a*b;
		
	}
	public static void main(String[] args) {
		System.out.println("Static Main Method Call");
		StaticTest1.F1();
		FinalTest1 obj = new FinalTest1();
		//obj.age=40;
		StaticTest1 stc1 = new StaticTest1();
		System.out.println(stc1.F2(2,3));
	}

}
