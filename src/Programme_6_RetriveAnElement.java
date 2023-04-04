import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme_6_RetriveAnElement {

    public static void main(String[] args) {
        Programme_6_RetriveAnElement obj = new Programme_6_RetriveAnElement();
        obj.retriveArrayElement();
    }

    public void retriveArrayElement(){
        // create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // retrive the element at index 2
        int element = numbers.get(2);

        // print the element to the console
        System.out.println("The element at index 2 is: " + element);
    }
}
