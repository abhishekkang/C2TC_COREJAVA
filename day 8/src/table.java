import java.util.Scanner;
public class table {
	public static void  main (String[] args) 
	{System.out.println("Enter The Number ");
	Scanner s=new Scanner(System.in);
	 int num;
		num=s.nextInt();
		int i;
		for (i =1;i<=10;++i)
		{ System.out.println((num)+"*"+(i)+"="+(num*i)+"\n");
	}
}
}