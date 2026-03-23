/* Luis Munoz
[CS1101] Comprehensive Lab 1
This work is to be done individually. It is not permitted to.
share, reproduce, or alter any part of this assignment for any
purpose. Students are not permitted to share code, upload
this assignment online in any form, or view/receive/
modifying code written by anyone else. This assignment is part. of an academic course at The University of Texas at El Paso and a grade will be assigned for the work produced individually by
the student.
*/

import java.util.Scanner;


public class MinerVacationMenu {
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int order = 1;
    int viewCart = 2;
    int manageOrder = 3;
    int checkout = 4;
    int exit = 5;
    int vacationPriceSummary = 6;

    System.out.println("=== Miner Vacation Planner ===");
    System.out.println("1. Order");
    System.out.println("2. View Cart");
    System.out.println("3. Manage Order");
    System.out.println("4. Checkout");
    System.out.println("5. Exit");
    System.out.println("6. Vacation Price Summary");

    System.out.println("Select an option: ");
    int num = sc.nextInt();

    if (num == order ){
      System.out.println(order());
    }
    if (num == viewCart ){
      System.out.println(viewCart());
    }
    if (num == manageOrder ){
      System.out.println(manageCart());
    }
    if (num == checkout ){
      System.out.println(checkout());
    }
    if (num == exit ){
      System.out.println(exit());
    }
    if (num == vacationPriceSummary){
      System.out.println(vacationPriceSummary());
    }


  }



  public static float order(){

      Scanner scanner = new Scanner(file);
      Scanner sc = new Scanner(System.in);

      
  }




  public static float viewCart(){

  }





  public static float manageCart(){

    

  }





  public static float checkout(){
    
    Scanner scanner = new Scanner(file);
    Scanner sc = new Scanner(System.in);


  }

  public static float exit(){

    Scanner scanner = new Scanner(file);
    Scanner sc = new Scanner(System.in);

  }



  public static float vacationPriceSummary(){

    Scanner scanner = new Scanner(file);
    Scanner sc = new Scanner(System.in);

  } 



  public static float highestPrice(){


  } 


  public static float lowestPrice(){


  }

}







