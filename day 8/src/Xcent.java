
abstract class Mumbai{
	abstract void speedlimit();
	abstract void rashdriving();
	void slowmoving()
	{ System.out.println("no fine ");
	}
}
public class Xcent extends Mumbai
{ private static Xcent s;

void speedlimit()
	{System.out.println("the Limit is 80kmph");
	
	}
	void rashdriving()
	{ 
		System.out.println("Alert voice");
	}
		
	public static void main(String[] args)
	{
		Xcent.s = new Xcent();
		s.speedlimit();
		s.rashdriving();
		
	}
}