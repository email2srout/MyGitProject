package MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass1 {
	


	public static void main(String[] args) {
		StudentMap sm1 = new StudentMap("shibaram",10);
		StudentMap sm2 = new StudentMap("Sanja",11);
		StudentMap sm3 = new StudentMap("Arabinda",13);
		StudentMap sm4 = new StudentMap("Subash",20);
		StudentMap sm5 = new StudentMap("Dasarathi",30);
	HashMap<StudentMap, Integer> hm = new HashMap<StudentMap, Integer>();
	hm.put(sm1, 1);
	hm.put(sm2, 2);
	hm.put(sm3, 3);
	hm.put(sm4, 4);
	hm.put(sm5, 5);
	
	for(Entry<StudentMap, Integer>d: hm.entrySet())
	{
		System.out.println(d.getValue());
		StudentMap smp = d.getKey();
		System.out.println(smp.Age);
		System.out.println(smp.Name);
	}

	}

}
