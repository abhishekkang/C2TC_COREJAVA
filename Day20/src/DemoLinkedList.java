import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Iterator;

public class DemoLinkedList {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Abhishek");
		al.add("Kang");
		al.add("Kshitiz");
		al.add("Rahul");

		System.out.println(al);

		al.set(2, "Tns");
		System.out.println(al);

		al.add(2, "Rohit");
		System.out.println(al);

		al.remove(1);
		System.out.println(al);
		System.out.println();

		System.out.println("Forloop:");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println("Advance Forloop:");
		for (String str : al)
			System.out.println(str);

		System.out.println();
		System.out.println("While loop:");
		int count = 0;
		while (al.size() > count) {
			System.out.println(al.get(count));
			count++;
		}
		System.out.println();
		System.out.println("Iterator:");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
