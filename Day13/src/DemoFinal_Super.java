class Demo {
	String color = "red";

	void display() {
		System.out.println("hello m12");
	}
}

public class DemoFinal_Super extends Demo {
	void display() {
		System.out.println("hello");
		System.out.println(super.color);
	}

	final int studid = 123;

	public static void main(String[] args) {
		DemoFinal_Super df = new DemoFinal_Super();
		df.display();

	}

}
