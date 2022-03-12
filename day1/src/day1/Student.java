package day1;

public class Student {
	int no_of_students;
	
	String Name;
	int grade;
	
	public int getNo_of_students() {
		return no_of_students;
	}

	public void setNo_of_students(int no_of_students) {
		this.no_of_students = no_of_students;
	}

	public void setGrade(int s)
	{ this.grade=s;
	
	}
	
public int getGrade()
{
	return grade;
}
void display()
		{
	System.out.println("Welcome to the class " );
	System.out.println(grade);
	System.out.println(no_of_students);
		}
public static void main(String[] args)
{
	Student stu=new Student();
	stu.display();
	stu.setGrade(10);
	stu.setNo_of_students(10);
	System.out.println(stu.getGrade());
	System.out.println(stu.getNo_of_students());
	
}
}
