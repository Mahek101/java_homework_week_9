package calculate;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculateResult = new Calculator(); // Calculator class object creation
        char result;
        do { // do block executing first time by default
            System.out.print("Please Enter the First Number: ");
            int num1 = input.nextInt();
            System.out.print("Please Enter the Second Number: ");
            int num2 = input.nextInt();
            System.out.print("Please enter the operation symbol +, -, * or / : ");
            char symbol = input.next().charAt(0);
            calculateResult.calculateResult(num1, num2, symbol);
            System.out.println(" ");
            System.out.print("Would you like to do more calculation, Please enter 'Y' or 'N' :  ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y'); // Keep executing do block if user selects Y or y
    }
}
