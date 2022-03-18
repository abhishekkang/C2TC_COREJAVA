package keyword;
abstract class Temple
{  
    abstract void place();  
      
}  
class State extends  Temple
{  
  
    void place() {  
        System.out.println("Temple is at Dharmshala");  
      
    }  
      
}  
  
public class abstractkeyword { 
	public static void main(String[] args) {  
		  
	    State obj=new State();  
	    obj.place();  
	    }         
	}  
