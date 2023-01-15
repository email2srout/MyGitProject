package ModifierTest;

 class DefaultClass1 {
	
	void default1()
	{
		System.out.println("Default method");
	}

	int x=20;
	public static void main(String[] args) {
		
		DefaultClass1 dc1 = new DefaultClass1();
		System.out.println(dc1.x);
		dc1.default1();
	}

}
