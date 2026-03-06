import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4 {
    /*
    * Hello and welcome to Lab 4!
    *
    * The focus of this lab will be to get you really used to working with loops
    * They can be useful for many different things, as we will see here!
    *
    * */

    /*
    *
    * You will be creating a program than reads a text file (in this case "student_grades.txt") containing student names and their respective grades,
    * and then use that information to do other things.
    *
    * For this, start with completing all the helper methods (these MUST be completed), and then complete the requests in the main method to be able to
    * see that your code is executing correctly
    *
    * You are allowed to create as many extra helper methods that you think you may need, the minimum
    * requirement is to have the ones included in this skeleton code.
    *
    * */ 
    static int count = 0;

    public static void main(String[] args) {

        String[] names = new String[100];
        int[] grades = new int[100];

        loadData("student_grades.txt", names, grades);

        // TODO: print the entire list of students
        System.out.println("All Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " " + grades[i]);
        }
        // TODO: print the name of the student with the highest grade
        System.out.println("\nHighest Grade Student:");
        System.out.println(findHighest(grades, names));
        // TODO: print the names of all the students that have grades higher than 80
        System.out.println("\nStudents >= 80:");
        String[] above = findAbove(grades, names, 80);
        for (int i = 0; i < count; i++) {
            if (above[i] != null) {
                System.out.println(above[i]);
            }
        }

        // TODO: print the names of all the students with grades lower than 60
        System.out.println("\nStudents < 60:");
        String[] below = findBelow(grades, names, 60);
        for (int i = 0; i < count; i++) {
            if (below[i] != null) {
                System.out.println(below[i]);
            }
        }
        // TODO: print the average grade of all the students
        System.out.println("\nAverage Grade:");
        System.out.println(calcAverage(grades));
    }
    

    /*
    * Complete the loadData method. This method should receive:
    *   - The name of the file containing the data
    *   - A string array
    *   - A int array
    *
    * The method should then read the data inside the text file and populate the string array with the names of all
    * the students, and also populate the double array with the respective grade of each student.
    *
    * The method does not return anything
    * */
    // TODO: create your method here. Be sure to use the name "loadData" for your method!
    public static void loadData(String filename, String[] names, int[] grades) {

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                names[count] = scanner.next();
                grades[count] = scanner.nextInt();
                count = count + 1;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    /*
    * Complete the findHighest method. The method should receive:
    *   - An int array
    *   - A string array
    *
    * And return the name of the student with the highest grade
    * */
    // TODO: create your method here. Be sure to use the name "findHighest" for your method!
    public static String findHighest(int[] grades, String[] names) {

        int maxIndex = 0;

        for (int i = 1; i < count; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }

        return names[maxIndex];
    }
    /*
     * Complete the findAbove method. The method should receive:
     *   - An int array
     *   - A string array
     *   - An integer value
     *
     * And return a string array containing the names of all the students that have a grade that is
     * equal to or higher than the integer value provided.
     * */
    // TODO: create your method here. Be sure to use the name "findAbove" for your method!
    public static String[] findAbove(int[] grades, String[] names, int value) {

        String[] result = new String[100];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (grades[i] >= value) {
                result[index] = names[i];
                index = index + 1;
            }
        }
        return result;
    }
    /*
     * Complete the findBelow method. The method should receive:
     *   - An int array
     *   - A string array
     *   - An integer value
     *
     * Very similar to the method findAbove, but instead, return a string array containing the names of
     * all the students that have a grade that is less than the provided value
     * */
    // TODO: create your method here. Be sure to use the name "findBelow" for your method!
    public static String[] findBelow(int[] grades, String[] names, int value) {

        String[] result = new String[100];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (grades[i] < value) {
                result[index] = names[i];
                index = index + 1;
            }
        }

        return result;
    }

    /*
     * Complete the calcAverage method. The method should receive:
     *   - An int array
     *
     * Return the average of the values in the array
     * */
    // TODO: create your method here. Be sure to use the name "calcAverage" for your method!
    public static double calcAverage(int[] grades) {

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum = sum + grades[i];
        }

        return (double) sum / count;
    }

}
