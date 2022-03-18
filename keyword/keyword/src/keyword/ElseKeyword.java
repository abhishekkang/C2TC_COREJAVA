package keyword;
import java.util.Scanner;
public class ElseKeyword {
	public static void main(String[] args) {  
	    //defining a variable 
		System.out.println("Enter number to check whether it is even or odd");  
		Scanner n = new Scanner(System.in);
	    int number= n.nextInt();
	    //Check if the number is divisible by 2 or not  
	    if(number%2==0){  
	        System.out.println("even number");  
	    }else{  
	        System.out.println("odd number");  
	    }  
	}  
	}  