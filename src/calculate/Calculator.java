package calculate;

/**
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculator {
    //Addition instance method with print statement
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
    }
    //Subtraction instance method with print statement
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }
    //Division instance method with print statement
    public void division(int a, int b) {
        try { // try block will execute if user has entered int 2 as 0 for division
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } catch (ArithmeticException e) { // catch block will execute when exception happens printing the error message
            System.out.println(" PROBLEM WITH YOUR SELECTION : DIVISION BY 0 IS MATHEMATICALLY NOT ALLOWED ");
        }
    }
    //Multiplication instance method with print statement
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }

    // Method with nested if else calling one of above methods based on user inserted symbol
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else {
            System.out.println("Invalid Symbol");
        }
    }
}
