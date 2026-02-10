import java.util.Scanner;

public class InClassAssignment1DONE {

    /*
     * Q1: Calculate Average
     * Return a double output of the average of four integer numbers
     */
    public static double calculateAverage(int a, int b, int c, int d) {
        // TODO: implement method
        double average = a + b + c + d;
        return average/4;
    }

    /*
     * Q2: FizzBuzz (Classic Interview Question)
     * - If divisible by both 3 and 5 -> print "FizzBuzz"
     * - If divisible only by 5 -> print "Fizz"
     * - If divisible only by 3 -> print "Buzz"
     * - Otherwise, print the number itself
     */
    public static String FizzBuzz(int num) {
        // TODO: implement method

        if (num % 3 == 0 && num % 5 == 0) {
            return ("FizzBuzz");
        } 
        else if(num % 5 == 0){
            return ("Fizz");
        }
        else if(num % 3 == 0){
            return ("Buzz");
        }
        else {
            return String.valueOf(num);
        }
    }

    /*
     * Q3: Minimum Value
     * Take 3 integer inputs and return the smallest number
     */
    public static int MinValue(int x, int a, int c) {
        // TODO: implement method
        int min = Math.min(x, Math.min(a,c));
        return min;
    }

    /*
     * Q4: Fahrenheit to Celsius
     * Convert Fahrenheit to Celsius and return the result
     * Formula: (fahrenheit - 32) * 5 / 9
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        // TODO: implement method
        fahrenheit = fahrenheit -32;
        System.out.println(fahrenheit);
        fahrenheit = fahrenheit * (.5555555);
        System.out.println(fahrenheit);
        return fahrenheit;
    }

    /*
     * Q5: Day of the Week
     * Takes an integer between 1 and 7 and returns the name of the day
     * Use a switch statement
     */
    public static String dayOfWeek(int num1) {
        // TODO: implement method
        switch (num1) {
        case 1:
            return "monday";
        case 2:
            return "tuesday";
        case 3:
            return "wednesday";
        case 4:
            return "thursday";
        case 5:
            return "friday";
        case 6:
            return "saturday";
        case 7:
            return "sunday";
        default:
            return "Invalid day";
    }
    }

    public static void main(String[] args) {
        // Q1: Average
        double avg = calculateAverage(1, 2, 4, 5);
        System.out.println("Q1 Average: " + avg);

        // Q2: FizzBuzz
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer for FizzBuzz: ");
        int num1 = scan.nextInt(); // e.g., scan.nextInt()
        System.out.println("Q2 FizzBuzz: " + FizzBuzz(num1));

        // Q3: Minimum Value
        System.out.println("Q3 MinValue: " + MinValue(10, 20, -5));

        // Q4: Fahrenheit to Celsius
        System.out.println("Q4 Celsius: " + fahrenheitToCelsius(35));

        // Q5: Day of the Week
        System.out.print("Q5 Day of Week: " + dayOfWeek(1));

        scan.close();
    }
}
