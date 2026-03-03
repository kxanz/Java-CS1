import java.util.Scanner;

public class NumberUtilities {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;

        // Use a while loop instead of do-while
        while (choice != 4) {

            printMenu();
            choice = in.nextInt();
            int n;
            switch (choice) {

                case 1:
                    System.out.print("Enter n (>= 0) for factorial: ");
                    //Code goes here
                    n = in.nextInt();
                    if (n < 0 ) {
                        System.out.println("Entered a incorrect number");
                    } else System.out.println(n + "! = " + factorial(n));
                    break;

                case 2:
                    System.out.println( "Enter n (> 0) to check prime: ");
                    //Code goes here
                    n = in.nextInt();
                    if (n < 0 ) {
                        System.out.println("Entered a incorrect number");
                    }else System.out.println(n + " is Prime " + isPrime(n));
                    break;

                case 3:
                    System.out.print("Enter n (> 0) to reverse digits: ");
                    //code goes here 
                    n = in.nextInt();
                    if ( n < 0 ) {
                        System.out.println("Entered a incorrect number");
                    } else System.out.println(n + " reverse digits = " + reverseDigits(n));
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println(); // spacing
        }

        in.close();
    }

    // =============================
    // ===== Methods to Complete ===
    // =============================

    // 1) Print the menu
    public static void printMenu() {
        //Code Goes here 
        System.out.println("=== Number Utilities Menu ===");
        System.out.println("1 Factorial");
        System.out.println("2 Check Prime");
        System.out.println("3 Reverse Digits");
        System.out.println("4 Exit");
        System.out.print("Enter your choice: ");
    }



    // 2) Compute factorial (0! = 1)
    public static long factorial(int n) {
        //Code Goes here 
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 3) Check if number is prime
    public static boolean isPrime(int n) {
        //Code Goes here 
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 7) Reverse digits of a number
    public static int reverseDigits(int n) {
        //Code Goes Here 
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;

    }
}