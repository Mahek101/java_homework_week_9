import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */


public class Programme_5_Iterate {

    public static void main(String[] args) {
        // create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");

        // get an iterator for the ArrayList
        Iterator<String> iterator = fruits.iterator();

        // use the iterator to iterate through the ArrayList
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
