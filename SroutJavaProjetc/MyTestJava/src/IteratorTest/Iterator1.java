package IteratorTest;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		
		ArrayList<BankHdfc> Al = new ArrayList<BankHdfc>();
		Al.add(new BankHdfc("avhandra","hdfc100020","123458"));
		Al.add(new BankHdfc("Rajandra","hdfc100021","123459"));
		Al.add(new BankHdfc("Mahendra","hdfc100022","123460"));
		Al.add(new BankHdfc("Surandra","hdfc100023","123433"));
		
//		for(BankHdfc h:Al)
//		{
//			//System.out.println("Name:" +"Account Number:" + "Mobile Num:");
//			System.out.println(h.Name +":"+h.AccountNo+":"+h.Mob);
//		}
		Iterator i = Al.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			BankHdfc dh = (BankHdfc) i.next();
			System.out.println(dh.Name);
			System.out.println(dh.Mob);
			System.out.println(dh.AccountNo);
			
			
			
		}
		
		
	}

}
