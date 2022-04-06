import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Enter a number to get the limit of your list");
		Scanner m = new Scanner(System.in);
		int L;
		L = m.nextInt();
		int[] values = new int[L];
		System.out.println("Enetr your values in integers ");
		for (int k = 0; k < values.length; k++) {
			Scanner s = new Scanner(System.in);
			values[k] = s.nextInt();
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
