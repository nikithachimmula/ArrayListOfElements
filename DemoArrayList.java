import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	// Main Driver method
	public static void main(String[] args) {
		// Creating an ArrayList
		List<Integer> num1 = new ArrayList<>();
		// Adding elements to our ArrayList
		// using add() method
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);

		// Printing the current ArrayList
		System.out.println(num1);
		// printing iterator object
		Iterator itr = num1.iterator();

		while (itr.hasNext()) {
			// Remove the elements smaller than 20 using
			// Iterator.remove()
			int num = (Integer) itr.next();
			if (num < 20)
				itr.remove();
		}
		// Printing the updated Array List
		System.out.println(num1);
	}

}
