package Comparator;

import java.util.Comparator;

public class BankIciciSort implements Comparator <BankIcici>
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(BankIcici o1, BankIcici o2) {
		
		return o1.Name.compareTo(o2.Name);
	}


}

