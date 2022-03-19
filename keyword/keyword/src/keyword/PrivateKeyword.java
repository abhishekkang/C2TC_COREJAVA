package keyword;

class B{
	private String msg = "Try to access the private variable outside the class";

}

public class PrivateKeyword {
	public static void main(String[] args) {
		B a = new B();
		// System.out.println(a.msg);
		// the message will not be visible

	}
}
