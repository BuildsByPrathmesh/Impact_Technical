import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Print the ArrayList
        System.out.println("Initial list: " + cars + "\n");

        // Insert element at the beginning of the list
        cars.add(0, "Mazda");
        System.out.println("After inserting at index 0: " + cars + "\n");

        // Get element at index 0
        System.out.println("Element at index 0: " + cars.get(0) + "\n");

        // Set element at index 0
        System.out.println("Replaced element at index 0: " + cars.set(0, "Opel") + "\n");
        System.out.println("After setting index 0 to 'Opel': " + cars + "\n");

        // Remove element at index 0
        cars.remove(0);
        System.out.println("After removing index 0: " + cars + "\n");

        // Print size of the ArrayList
        System.out.println("Size of list: " + cars.size() + "\n");

        // Iterate over the ArrayList
        System.out.println("Iterating over list:\n");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println();

        // Sort the ArrayList
        Collections.sort(cars);
        System.out.println("Sorted list: " + cars + "\n");

        // Clear the ArrayList
        cars.clear();
        System.out.println("After clearing: " + cars + "\n");
    }
}
