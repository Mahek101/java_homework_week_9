import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HashSet {

    public static void main(String[] args) {
        Programme_8_HashSet obj = new Programme_8_HashSet();
        obj.hashSetMethod();
    }

    public void hashSetMethod(){
        // create a HashSet to store Integer Objects
        HashSet<Integer> set = new HashSet<>();

        // add the numbers 4, 7 and 8 to Sets
        set.add(4);
        set.add(7);
        set.add(8);

        // print the numbers between 1 and 10 that are in the set
        for (int i = 0; i <= 10; i++){
            if (set.contains(i)){
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}
