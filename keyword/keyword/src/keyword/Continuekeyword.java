package keyword;
//Java Program to demonstrate the use of continue statement,inside the for loop.   
public class Continuekeyword {
	public static void main(String[] args) {  
	    //for loop  
	    for(int i=1;i<=10;i++){  
	        if(i>=6){  
	            //using continue statement  
	            continue;//it will skip the rest of numbers 
	        }  
	        System.out.println(i);  
	    }  
	}  
}
