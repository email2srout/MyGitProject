package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class BankObjectClass {

	public static void main(String[] args) 
	{
		ArrayList<BankIcici> AL2 = new ArrayList<BankIcici>();
		AL2.add(new BankIcici("Shibaram",10));
		AL2.add(new BankIcici("Arabinda",10));
		AL2.add(new BankIcici("Sanjay",10));
		AL2.add(new BankIcici("Monajo",10));
		AL2.add(new BankIcici("Dasarathi",10));
		Collections.sort(AL2, new BankIciciSort());
		for(BankIcici BI:AL2)
		{
			System.out.println(BI.Name+":"+BI.Age);
		}

	}

}
