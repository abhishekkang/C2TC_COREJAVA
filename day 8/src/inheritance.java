class Grandparent{
	void disp() {
		System.out.println("granndparent class");
	}
}
class Parent extends Grandparent{
	void disp()
	{ System.out.println("parent class");
	
	}
}
public class inheritance extends Parent
{
	void disp()
	{ System.out.println("child class");
	 } 
	 public static void main(String[] args)
	 {
inheritance i=new inheritance();
i.disp();
 } 

}
