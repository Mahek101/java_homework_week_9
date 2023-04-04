import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */


public class Programme_4_Colors {

    public static void main(String[] args) {
        Programme_4_Colors obj = new Programme_4_Colors();
        obj.colors();
    }


    public void colors(){
        // Create a new ArrayList of strings
        ArrayList<String> list = new ArrayList<>();

        // Add some colors to the ArrayList
        list.add("White");
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");

        for (String color : list){
            System.out.println(color);
        }
    }


}
