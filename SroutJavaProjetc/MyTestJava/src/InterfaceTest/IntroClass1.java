package InterfaceTest;

public class IntroClass1  extends IntroClass3 implements Intrface1,Intrface2,Intrface3 
{

	int px;
	public void F1()
	{
		System.out.println("This from IntroClass1");
	}
	
	public static void main(String[] args) 
	{
		IntroClass1 ic1 = new IntroClass1();
		
		System.out.println(ic1.x);
		ic1.saveInfo();
		ic1.printinfo();
		ic1.createbike();
		ic1.runbike();
		ic1.Interent();
		ic1.printInterest();
		ic1.F1();
		
	}

	@Override
	public void saveInfo() {
		System.out.println("Save Info");
		
	}

	@Override
	public void printinfo() {
		System.out.println("Print Info");
		
	}

	@Override
	public void createbike() {
		System.out.println("Bike Created");
		
	}

	@Override
	public void runbike() {
		System.out.println("Bike Run");
		
	}

	@Override
	public void Interent() {
		System.out.println("Calculate Interest");
		
	}

	@Override
	public void printInterest() {
		System.out.println("Print Interest");
		
	}

	@Override
	public void duplicateInfo() {
		System.out.println("Print Interest");
		
	}

}
