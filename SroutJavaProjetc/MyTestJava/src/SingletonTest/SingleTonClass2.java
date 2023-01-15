package SingletonTest;

public class SingleTonClass2 {

	public static void main(String[] args) {
		SingleTonClass1 stc1 = SingleTonClass1.getSingletonObject();
		stc1.sum(10, 20);

	}

}
