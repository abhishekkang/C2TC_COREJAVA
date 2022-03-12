import java.util.Scanner;
public class addition {
	public void  add( int x, int y)
	{ System.out.println("the sum is " +(x+y));
	
	}
	public static void  main (String[] args) {
		System.out.println("Enter The Numbers You want to add  ");
		Scanner s=new Scanner(System.in);
	  int  x;
		x=s.nextInt();
		Scanner j=new Scanner(System.in);
		int y;
		y=j.nextInt();
		addition ob =new addition();
		ob.add(x, y);
	}

}
