import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseAnArray {

    public static void main(String[] args) {
        // Array declaration
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] reversed = reverseArray(numbers);
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }

    public static int[] reverseArray(int[] arr) {
        // Reverse array
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }

}
