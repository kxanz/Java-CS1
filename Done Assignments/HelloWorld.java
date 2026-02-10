import java.util.Scanner;

public class HelloWorld{
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);

		//This part we are changing 
		int age = sc.nextInt();
		boolean hasID = false;

		if (age>=18){
			System.out.println("Access Granted");
		}
		else if(age>=16 && hasID == true){
			System.out.println("Access Granted");
		
		}else{
			System.out.println("Access Denied"+age);
		}

		System.out.println("I am age"+age+" years old");
		age++;
		System.out.println("Next year I will be "+age);


		int num = 29;
		boolean EvenOdd = num%2 == 0;
		if (EvenOdd == true){
			System.out.print("Even");

		}else{
			System.out.print("Odd");
		}
	}
}