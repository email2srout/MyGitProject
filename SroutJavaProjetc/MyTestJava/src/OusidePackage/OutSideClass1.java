package OusidePackage;

import ConstructorTest.SBIBank7;
import ConstructorTest.SBIBank8;

public class OutSideClass1 {

	public static void main(String[] args) {
		SBIBank7 sbi73 = new SBIBank7();
		sbi73.f1();
		//Object create not allow outside package 
		//SBIBank8 sbi83 = new SBIBank8();

	}

}
