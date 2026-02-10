import java.util.Scanner;

public class scanners {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Can i have your id");
    int num = sc.nextInt();


    if ( num >= 18  ) {
    System.out.println("Access Granted" );
    }
    else {
      System.out.println( "Access Denied" );
    }


  }

}
