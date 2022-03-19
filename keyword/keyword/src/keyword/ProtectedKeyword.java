package keyword;

class C {

	protected String msg = "Try to access the protected variable outside the class within the package";

}

public class ProtectedKeyword {
	public static void main(String[] args) {
		C a = new C();
		System.out.println(a.msg);

	}
}
