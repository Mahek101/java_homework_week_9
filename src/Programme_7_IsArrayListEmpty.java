import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Programme_7_IsArrayListEmpty {

    public static void main(String[] args) {
        Programme_7_IsArrayListEmpty obj = new Programme_7_IsArrayListEmpty();
        obj.isEmpty();
    }

    public void isEmpty(){
        // create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // check if the ArrayList is empty
        if (names.isEmpty()){
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }
        // add some elements to the ArrayList
        names.add("Ram");
        names.add("Shyam");
        names.add("Sita");
        names.add("Gita");

        // check if the ArrayList is empty again
        if (names.isEmpty()){
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println(("The ArrayList is not empty"));
        }

    }
}
