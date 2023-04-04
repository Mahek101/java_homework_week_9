import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes)
 * using if else and while loop.
 */

public class Programme_2_Marksheet {

    static String name;
    static int roll, math, sci, eng;
    static int total;
    static double percentage;
    static String Grade;
    static String result;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Student Name: ");
        name = scan.nextLine();
        System.out.println("Please enter Student Roll Number: ");
        roll = scan.nextInt();
        System.out.println("Please enter Math marks: ");

        // while loops ensuring the program does not go forward until correct mark values are entered.
        math = scan.nextInt();
        while (math < 0 || math > 100) {
            System.out.println("Invalid Math marks, marks between 0 to 100");
            System.out.println("Please enter correct Math marks: ");
            math = scan.nextInt();
        }
        System.out.println("Please enter Science marks: ");
        sci = scan.nextInt();
        while (sci < 0 || sci > 100) {
            System.out.println("Invalid Science marks, marks between 0 to 100");
            System.out.println("Please enter correct Science marks: ");
            sci = scan.nextInt();
        }
        System.out.println("Please enter English marks: ");
        eng = scan.nextInt();
        while (eng < 0 || eng > 100) {
            System.out.println("Invalid English marks, marks between 0 to 100");
            System.out.println("Please enter correct English marks:");
            eng = scan.nextInt();
        }
        // if else statements ensuring all the inserted marks are not out of permitted values
        // if the values are within permitted range it will print result
        // if the values are outside permitted values it will print error message
        if (math >= 0 && math <= 100 && sci >= 0 && sci <= 100 && eng >= 0 && eng <= 100) {
            result1();
            print();
        } else {
            System.out.println("The marks value should be between 0 to 100");
        }
        scan.close();
    }


    // Static method calculating total, percentage & allocating Pass, Fail and Grade using Conditions.
    public static void result1() {
        total = math + eng + sci;
        percentage = (total / 3);
        if ((math < 35) || (sci < 35) || (eng < 35)) {
            percentage = 0.0;
            result = "Fail";
            Grade = "N/A";
        } else if ((percentage >= 35) && percentage < 50) {
            result = "Pass";
            Grade = "C";
        } else if ((percentage >= 50) && percentage < 60) {
            result = "Pass";
            Grade = "B";
        } else if ((percentage >= 60) && (percentage < 80)) {
            result = "Pass";
            Grade = "A";
        } else if (percentage >= 80) {
            result = "Pass";
            Grade = "A++";
        }
    }
    // Print method calling all variables and printing desired output
    public static void print(){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                 |");
        System.out.println("| Roll No:" + roll + "                 |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + math + "                   |");
        System.out.println("| Science:" + sci + "               |");
        System.out.println("| English:" + eng + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + Grade + "                 |");
        System.out.println("|___________________________|");
    }

    }


