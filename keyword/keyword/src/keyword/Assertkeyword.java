package keyword;
import java.util.Scanner;

public class Assertkeyword
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your marks");
         
        Scanner sc = new Scanner(System.in);
         
        int marks = sc.nextInt();
         
        assert marks >= 35:"FAIL";
        System.out.println("Value is "+ marks);
        
    }
}
