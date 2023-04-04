import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11_DeclareTwoArrayList {
    public static void main(String[] args) {
        Programme_11_DeclareTwoArrayList obj = new Programme_11_DeclareTwoArrayList();
        obj.compareArrayList();
    }

    public void compareArrayList(){
        // declare the first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // declare the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // compare the two ArrayLists and add the common elements to the third ArrayList
        ArrayList<String> commonElements = new ArrayList<>();

        // compare the two ArrayLists and add the common elements to the third ArrayList
        for (String element : c1){
            if (c2.contains(element)){
                commonElements.add(element);
            }
        }
        // output the common elements to the console
        System.out.println("The common elements are: ");
        for (String element : commonElements){
            System.out.println(element);
        }


    }
}
