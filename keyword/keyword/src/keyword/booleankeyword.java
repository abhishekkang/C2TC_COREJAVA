package keyword;
import java.util.Scanner;
public class booleankeyword {
	    public static void main(String[] args) {  
	    	 System.out.println("Enter Two Numbers");
	         Scanner aa = new Scanner(System.in);
	         Scanner sc = new Scanner(System.in);
	        int num1= aa.nextInt();
	        int num2= sc.nextInt();  
	        System.out.println("if "+num1+" < "+num2);
	    boolean b1=true;  
	    boolean b2=false;  
	  
	if(num1<num2)  
	{  
		System.out.println(" It is "+ b1);
	}  
	else  
	{  
		System.out.println(" It is  "+ b2);
	}
  }
}
