import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */


public class Programme_9_HashMap {

    public static void main(String[] args) {
        Programme_9_HashMap obj = new Programme_9_HashMap();
        obj.hashMapMethod();
    }

    public void hashMapMethod(){
        // create a HashMap to store String keys and Integer values
        Map<String,Integer> people = new HashMap<>();

        // add some entries to HashMap
        people.put("Ram" , 10);
        people.put("Shyam" , 20);
        people.put("Shiv" , 30);
        people.put("Brahm" , 40);

        // iterate over the value in the Hashmap using a for-each loop
        for (Map.Entry<String,Integer> entry : people.entrySet()){

            System.out.println(entry.getValue());
        }
    }
}
