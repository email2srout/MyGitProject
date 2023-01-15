package ModifierTest;

public class WithInPackageClass {

	public static void main(String[] args) {
		PrivateClass1 pc2 = new PrivateClass1(10);
		//pc2 private method not access
		//pc2 private variable not access
		DefaultClass1 dc1 = new DefaultClass1();
		System.out.println(dc1.x);
		dc1.default1();
		ProtectedClass1 pdc2 = new ProtectedClass1();
		System.out.println(pdc2.x);
		pdc2.protected1();
	}

}
