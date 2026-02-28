import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Questions to answer!
// What is the highest monday temperature?
// What is the lowest friday temperature?
// Compute the avg temperature per day of the week
// How many days in total had a temperature higher than 70.0?

public class inclass2{
    public static void main(String[] args) {
        try{
            /**
             * TODO:
             * Initialize the file variable and scanner variable
            */ 
            // YOUR CODE HERE
            File file = new File("temperatures.txt");
            Scanner scanner = new Scanner(file); 
            /**
             * TODO
             * Initialize the variables that you will be needing to
             * perform the counting and calculations
            */
            // YOUR CODE HERE
            double highestMonday = Double.MIN_VALUE;
            double lowestFriday = Double.MAX_VALUE;

            double mondaySum = 0;
            int mondayCount = 0;
            double  tuesdaySum = 0;
            int tuesdayCount = 0;
            double wednesdaySum = 0;
            int wednesdayCount = 0;
            double thursdaySum = 0; 
            int thursdayCount = 0;
            double  fridaySum = 0;
            int  fridayCount = 0;
            int daysAbove70 = 0;

            /**
             * TODO
             * Traverse the file using a loop (what type of loop would be best for this situation?)
             * to extract the contents of the file and perform your calculations
             * You can use as many loops as you want (but can it all be performed using only 1 loop?)
             * Compute the calculations needed
            */
            // YOUR CODE HERE
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue; 

                Scanner lineScanner = new Scanner(line);

                double monday = lineScanner.nextDouble();
                double tuesday = lineScanner.nextDouble();
                double wednesday = lineScanner.nextDouble();
                double thursday = lineScanner.nextDouble();
                double friday = lineScanner.nextDouble();

                mondaySum += monday; mondayCount++;
                tuesdaySum += tuesday; tuesdayCount++;
                wednesdaySum += wednesday; wednesdayCount++;
                thursdaySum += thursday; thursdayCount++;
                fridaySum += friday; fridayCount++;

                if (monday > highestMonday) highestMonday = monday;
                if (friday < lowestFriday) lowestFriday = friday;

                if (monday > 70) daysAbove70++;
                if (tuesday > 70) daysAbove70++;
                if (wednesday > 70) daysAbove70++;
                if (thursday > 70) daysAbove70++;
                if (friday > 70) daysAbove70++;
            }


            /**
             * TODO:
             * Fill the FIXMEs in the print statements below so you are able to display your results
             * to the console
            */
            System.out.println("Highest Monday temperature: " + highestMonday);
            System.out.println("Lowest Friday temperature: " + lowestFriday);
            System.out.println("Days above 70: " + daysAbove70);

            /**
             * Print out the avg temperature per day, complete as needed
            */
            System.out.println("Avg temperature for Monday: " + (mondaySum / mondayCount));
            System.out.println("Avg temperature for Tuesday: " + (tuesdaySum / tuesdayCount));
            System.out.println("Avg temperature for Wednesday: " + (wednesdaySum / wednesdayCount));
            System.out.println("Avg temperature for Thursday: " + (thursdaySum / thursdayCount));
            System.out.println("Avg temperature for Friday: " + (fridaySum / fridayCount));

            scanner.close(); // this line right here just closes the scanner once we are done using it

        } catch(FileNotFoundException e){
            /**
             * TODO
             * Make sure to handle your exceptions so you are able to correctly read the file
            */
            // YOUR CODE HERE
            System.out.println("Found error:" + e);

        }

    }
}