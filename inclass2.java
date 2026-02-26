import java.util.Scanner;
import java.io.FIle;
import java.io.FileNotFoundException;
import java.io.FileWriter;

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
            double mondaySum = 0;
            int mondayCount = 0;
            double  tuesdaySum = 0;
            int tuesdayCount = 0;
            double wensdaySum = 0;
            int wensdayCount = 0;
            double thursdaySum = 0; 
            int = thursdayCount = 0;
            double = fridaySum = 0;
            int = fridayCount = 0;
            /**
             * TODO
             * Traverse the file using a loop (what type of loop would be best for this situation?)
             * to extract the contents of the file and perform your calculations
             * You can use as many loops as you want (but can it all be performed using only 1 loop?)
             * Compute the calculations needed
            */
            // YOUR CODE HERE


            /**
             * TODO:
             * Fill the FIXMEs in the print statements below so you are able to display your results
             * to the console
            */
            System.out.println("Highest monday temperature: " + FIXME);
            System.out.println("Lowest friday temperature: " + FIXME);
            System.out.println("Days above 70: " + FIXME);

            /**
             * Print out the avg temperature per day, complete as needed
            */
            System.out.println("Avg temperature for monday: ");

            scan.close(); // this line right here just closes the scanner once we are done using it

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