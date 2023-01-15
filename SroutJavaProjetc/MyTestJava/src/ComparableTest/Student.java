package ComparableTest;

public class Student implements Comparable<Student>
{
	public String name;
	public int age;
	public char gender;
	
	public Student(String n, int a, char c)
	{
		this.name=n;
		this.age=a;
		this.gender=c;
	}

	public static void main(String[] args) {
		

	}


	@Override
	public int compareTo(Student o) {
		if (this.age>o.age)
		{
			return 1;
		}
		if (this.age<o.age)
		{
			return -1;
		}
		
		return 0;
	}

}
