import java.util.Scanner;
abstract class Calculator
{
	abstract void addition();
	abstract void table();
	abstract void substraction();
	abstract void divison();
	abstract void multipication();
	private static Calculator k;
	void display()
	{System.out.println("Enter The Numbers You want to calculate ");
	 Scanner s=new Scanner(System.in);
	 float  x;
	 x=s.nextFloat();
	 Scanner j=new Scanner(System.in);
	 float y;
	 y=j.nextFloat();
	}
}
public class calc extends Calculator 
{
	private static calc q;
	void addition()
	  {System.out.println("Enter The Numbers You want to calculate ");
	  Scanner s=new Scanner(System.in);
	  float  x;
	  x=s.nextFloat();
	  Scanner j=new Scanner(System.in);
	  float y;
	  y=j.nextFloat();
	     System.out.println("the sum is " +(x+y));
       }
 void substraction()
 {System.out.println("Enter The Numbers You want to calculate ");
 Scanner s=new Scanner(System.in);
 float  x;
 x=s.nextFloat();
 Scanner j=new Scanner(System.in);
 float y;
 y=j.nextFloat();
		System.out.println("the substraction  is " +(x-y));
 }
 void divison()
 {System.out.println("Enter The Numbers You want to calculate ");
 Scanner s=new Scanner(System.in);
 float  x;
 x=s.nextFloat();
 Scanner j=new Scanner(System.in);
 float y;
 y=j.nextFloat();
 System.out.println("the divison is " +(x/y));}
 void multipication()
 { System.out.println("Enter The Numbers You want to calculate ");
 Scanner s=new Scanner(System.in);
 float  x;
 x=s.nextFloat();
 Scanner j=new Scanner(System.in);
 float y;
 y=j.nextFloat();
 System.out.println("the Multipication is " +(x*y));}
	void table()
	{System.out.println("Enter The Number ");
	Scanner s=new Scanner(System.in);
	 float num;
		num=s.nextFloat();
		int i;
		for (i =1;i<=10;++i)
		{ System.out.println((num)+"*"+(i)+"="+(num*i)+"\n");}
	}
	public static void  main (String[] args) 
	{ calc.q = new calc();
	int mthd;
		System.out.println("type 1 for addition \n"+
		"type 2 for substraction \n"+
				"type 3 for multipication \n"+
		"type 4 for divison \n"+
				"type 5 for table \n");
	Scanner kkr =new Scanner(System.in);
	mthd=kkr.nextInt();
	if(mthd== 1)
	{q.addition();}
	if(mthd==2) 
	{q.substraction();}
	if(mthd == 3)
	{q.multipication();}
	if(mthd==4)
	{q.divison();}
	else q.table();
	
	
}

}
