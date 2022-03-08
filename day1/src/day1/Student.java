package day1;

public class Student {
	int no_of_students;
	String Name;
	int grade;
	public void setGrade(int s)
	{ this.grade=s;
	
	}
public int getGrade()
{ return grade;
}
void display()
		{
	System.out.println("Welcome to the class " );
	System.out.print(grade);
	
	
		}
public static void main(String[] args)
{
	Student stu=new Student();
	stu.display();
	stu.setGrade(10);
	System.out.println(stu.getGrade());
	
}
}
