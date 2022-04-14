import java.util.LinkedList;

public class LambdaForEach {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("abhishek");
		ll.add("gautam");
		ll.add("mohit");
		ll.add("vikas");
		ll.forEach((n) -> {
			System.out.println(n);
		});

	}

}
