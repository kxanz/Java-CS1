
import java.io.File;
import java.util.Scanner;

public class filereading{

  public void main (String[] args){
    int maxGrade = 0;
    int minGrade = 100;
    double average = 0;
    int totalS = 0;


    File f = new File("grades.txt");

    try {
        Scanner scan = new Scanner(f);

        while(scan.hasNextLine()){

          String name = scan.next();
          int grade = scan.nextInt();

          if (grade > maxGrade) {maxGrade = grade;}
          if (grade < minGrade) {minGrade = grade;}

          average += grade;
          totalS++;
        }

        System.out.println("The max grade is" + maxGrade);
        System.out.println("The lowest grade is" + minGrade);
        System.out.println("The average grade is" + average/totalS);
    } catch (Exception e) {

      System.out.println("Found error:" + e);
    }
  }

}