package ComparableTest;

import java.util.ArrayList;
import java.util.Collections;

public class Studentobj {

	public static void main(String[] args) {
		ArrayList<Student> AL1 = new ArrayList<Student>();
		AL1.add(new Student("Shibaram1",14,'F'));
		AL1.add(new Student("Shibaram2",11,'M'));
		AL1.add(new Student("Shibaram3",13,'F'));
		AL1.add(new Student("Shibaram4",17,'M'));
		Collections.sort(AL1);
		for(Student S:AL1)
		{
			System.out.println(S.age+":"+S.name+":"+S.gender);
		}
		
	
		
		

	}

}
