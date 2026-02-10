public class Lab2 {
    // In this lab, we will be working with methods and practicing many ways to use them!

    // inside the main method is where you'll be able to include and test all the other ones
    // that you will be creating

    // We will be testing each required method individually when grading, so make sure to test that they work correctly
    // before submitting!
    public static void main(String[] args) {
        System.out.print(findMax(4, 4));
        System.out.print(isEven(4));
        System.out.print(getPrice("s"));
        System.out.print(isAccessGranted(21, true, "ADMIN"));
        System.out.print(calculate(10.0,5.0,'/'));
        System.out.print(convertTemperature(13.40,true));
        System.out.print(calculateTax(14.90,"USA"));
        System.out.print(isLeapYear(2026));
        System.out.print(timeOfDay(600));
        System.out.print(isValidTriangle(21,2,22));
        // test your methods here
    }

    // For all the required methods, DO NOT change the method's signature (the public static etc...) that we provided.
    // We are providing you that signature this time so it is easier for you to focus on implementing the method only.

    /*
     * The method findMax should return the maximum number between num1 and num2 positive numbers.
     * If they are equal to each other, then the method should return -1
     * */
    public static int findMax(int num1, int num2) {

        if (num1 > num2 ){
            return num1;
        }
        else if (num1 < num2){
            return num2;
        }
        else {
            return -1;
        }
            
    }

    /*
     * The method isEven should return true if the provided integer num is even
     * or false if it is odd
     * */
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
     * The method getPrice, should return the following according to what String size is:
     * 12.99 if the size is "s"
     * 19.99 if the size is "m"
     * 25.99 if the size is "l"
     * else return -1.0
     * */
    public static double getPrice(String size){

        if (size.equals("s")) {
            return 12.99;
        }
        else if (size.equals("m")){
            return 19.99;
        }
        else if (size.equals("l")) {
            return 25.99;
        }
        else return -1.0;
    }

    /*
     * The method isAccessGranted will determine if a user can enter a restricted area.
     * If hasPermit is true and the user is 18 or older, they get access regardless of clearance (return true).
     * If they don't have a permit, they only get access if their clearanceLevel is exactly "ADMIN" and they are over 21.
     * Otherwise, return false.
     * */
    public static boolean isAccessGranted(int age, boolean hasPermit, String clearanceLevel){
        if (hasPermit == true && age >= 18){
            return true;
        } else if (!hasPermit && clearanceLevel.equals("ADMIN") && age >= 21){
            return true;
        }else return false;
    }

    /*
     * The method calculate will use the two provided numbers and return the resulting operation indicated with
     * the operator character. e.g. num1 = 10, num2 = 5, operator = '/', the method should return 2.0 (10/5)
     * If you are performing a division, also check that the second number is not 0. If it is then return 0.0 as the
     * final result instead
     * If the operator is anything else, return -1
     * */
    public static double calculate(double num1, double num2, char operator){
        switch (operator) {
        case '+': return num1 + num2;
        case '-': return num1 - num2;
        case '*': return num1 * num2;
        case '/': return (num2 == 0 ? 0.0 : num1 / num2);
        default: return -1;
    }
    }
    /*
     * The method convertTemperature, will take in a double temp, and a boolean toCelsius.
     * If toCelsius is true, then the method should return the provided temp converted to Celsius (formula is C = (F - 32)*5/9)
     * Otherwise, the formula should return the number converted to Fahrenheit (formula is F = (C*9/5) + 32)
     * */
    public static double convertTemperature(double temperature, boolean toCelsius){
        if (toCelsius == true){
            return (temperature - 32.0)*5.0/9.0;
        } else return 
        (temperature*9.0/5.0) + 32;
    }

    /*
     * The method calculateTax should return the correct total amount (not just the tax amount, but the total+tax)
     * given the provided country:
     * "USA": 7% tax
     * "UK": 20% tax.
     * "GER": 19% tax.
     * "JAP": 10% tax.
     * For any other country code, assume a "Global" rate of 15%.
     * */
    public static double calculateTax(double subtotal, String countryCode){
        if (countryCode.equals("USA")){
            return subtotal*0.07 + subtotal;
        } else if (countryCode.equals("UK")){
            return subtotal*.20 + subtotal;
        }else if (countryCode.equals("GER")){
            return subtotal*.19 + subtotal;
        }else if (countryCode.equals("JAP")){
            return subtotal*.10 + subtotal;
        } else return subtotal*.15 + subtotal;

    }

    /*
     * The method isLeapYear should return true if the provided year is a leap year, false otherwise.
     * A year is considered to be a leap year if it is divisible by four.
     * But if the number is divisible by 100 then it is not a leap year, unless it is also divisible by 400 in that case
     * e.g. the year 1900 was NOT a leap year (is divisible by 4, but also by 100 and not 400).
     * e.g. the year 2000 WAS a leap year (is divisible by 4 and 100, but also 400)
     * */
    public static boolean isLeapYear(int year){
        if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else if (year % 4 == 0) {
        return true;
    } else {
        return false;
    }
    }

    /*
     * The method timeOfDay should return a string indicating whether it is "morning", "afternoon", "evening" or "night"
     * given the provided time in military time
     * 5:00 to 11:59: "Morning"
     * 12:00 to 16:59: "Afternoon"
     * 17:00 to 20:59: "Evening"
     * 21:00 to 4:59: "Night"
     * If the hour is outside 0-2399 then return "invalid" (remember that in military time,
     * times are represented as a combination of hour and minute so 11:30 becomes 1130)
     * */
    public static String timeOfDay(int hour){
        if (hour < 0 || hour > 2359){
            return "Invalid";
        }else if (hour >= 500 && hour <= 1159){
            return "Morning";
        } else if (hour >= 1200 && hour <= 1659){
            return "Afternoon";
        }else if (hour >= 1700 && hour <= 2059){
            return "Evening";
        } else return "Night";
    }
    /*
     * The method validTriangle should return true if it is possible for the 3 provided side lengths to form a triangle
     * false otherwise.
     * For a triangle to be possible the sum of any two sides must be greater than the third,
     * so given side lengths a, b, and c, all the following conditions must be true:
     * a + b > c
     * a + c > b
     * b + c > a
     * */
    public static boolean isValidTriangle(int sideA, int sideB, int sideC){
        if (sideA + sideB > sideC 
            && sideA + sideC > sideB 
            && sideB + sideC > sideA){
            return true;
        } else return false;
    }
}
