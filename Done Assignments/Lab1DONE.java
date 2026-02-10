import java.util.Scanner;

public class Lab1DONE {
	//----------
	// Example exercise
	//----------
	public static void example(){
		String myName = "Luis"; // TODO Change to your own name
		System.out.println("Hi, my name is " + myName + ".");
	}

	//----------
	// Q1
	//----------
	public static void q1(){
		// TODO: initialize variables to fill in the three FIXMEs in the following print.
		// durationOfSong should be a number, durationOfSong is 3.14 for a song length of 3 minutes and 14 seconds.
		String favoriteSong = "Porque Me Tratas Asi";
		String artist = "Wisin & Yandel";
		double durationOfSong = 4.03 ;

		System.out.println("I love listening to " + favoriteSong + " by " + artist + ".");
		System.out.println("The songs duration is "+ durationOfSong);
	}

	//----------
	// Q2
	//----------
	public static void q2(){
		// TODO: initialize variables to fill in the FIXMEs.
		// Each variable type initialized in this question can only be used once.
		// The available datatypes are float, boolean, double, int, and char,string.

		int movieYear = 2026;
		String favoriteMovie = "Marty Supreme";
		double bluerayCost = 40.99;
		float viewerScore = 83;
		char tier = 'S';
		boolean winOscar = false;

		//replace FIXME with the appropriate variable from above
		System.out.println("My favorite movie is called "+ favoriteMovie);

		System.out.println("The movie was released in year " + movieYear + ".");

		System.out.println("A BlueRay copy might sell for $" + bluerayCost + "!");

		System.out.println("The viewer score for this movie is  " + viewerScore );

		System.out.println("Overall, this movies  should be considered " + tier + " tier.");

		System.out.println("And did it win a oscar? " + winOscar);
	}

	//----------
	// Q3
	//----------
	public static void q3(){
		// Change the values for these variables to test your expression
		boolean isExpensive = true;
		boolean friendsGoing = false;

		//TODO
		// Replace the initialization below with a boolean expression that represents
		// the expression below, using the above two boolean variables.
		// I will go to the concert if my friends are going and IS not expensive.
		boolean willAttendConcertResult = friendsGoing && !isExpensive;

		System.out.println("Will I go to the next concert? The answer is " + willAttendConcertResult + ".");
	}

	//----------
	// Q4
	//----------
	public static void q4(){
		// TODO: Fill in the FIXMEs with the appropriate data type, and initialize them with a value
		String favoriteTVShow = "How to Sell Drugs Online";
		int amountOfEpisodes = 24;
		double rating = 7.80;

		// TODO: Initialize the two variables below to test your code with different inputs
		boolean isBingeWorthy = true;
		boolean newSeasonComing = false;
		// TODO: Replace initialization with a boolean expression using the above variables that represents the sentence below.
		// “I will rewatch the show if it is binge-worthy or if their IS NOT new season coming up.”
		boolean willRewatchShow = isBingeWorthy || !newSeasonComing;

		System.out.println("My favorite TV Show is " + favoriteTVShow + " and ran for  " + amountOfEpisodes + "episodes.");
		System.out.println("My rating for the show is  " + rating);
		System.out.println("I will rewatch this show: " + willRewatchShow);

		if (willRewatchShow) {
			System.out.println("i will rewatch the show");
		}
		else {
			System.err.println("i will not watch show");
		}
	}

	//-----------
	// Q5: Create Scanner object and fix userName variable datatype to store user input and output username in terminal
	//-----------
	public static void q5(){
		// TODO: Create your scanner object here
		Scanner var2 = new Scanner(System.in);

		// TODO: Use your scanner object that you just created to take in user input and output the sentence below
		System.out.println("Input your username: ");
		String var1 = var2.nextLine();
		System.out.println("Username is: " + var1);
	}

	//----------
	// Q6
	//----------
	public static void q6(){
		//TODO: Create a scanner to get the user to enter information that we will store
			Scanner var2 = new Scanner(System.in);

		// TODO: add the appropriate data type below, and add more variables if needed
		
		//TODO: Add code to get user to input a movie name, a rating (1 through 5, can have decimals),
		// and the year they saw the movie (has to be a whole number)
		System.out.println("Please Type Your Favorite Movie");
		String movie = var2.nextLine();

    System.out.println("Please Type Your Rating for your favorite movie");
		double movieRating = var2.nextDouble();

		System.out.println("Please type the year you watched the movie");
		int movieYear = var2.nextInt();



		//TODO: Fill out the print statements below with the appropriate variables so you can printout the information that you just gathered
		System.out.println("Rating " + movieRating + "." );
		System.out.println("Rating for the movie: " + movie + " is: " + movieRating);
		System.out.println("The year in which I watched this movie was: " + movieYear);
	}

	//----------
	// Q7
	//----------
	public static void q7(){
		// TODO: Initialize the variables below (try different values so you can test different scenarios)
		Scanner var2 = new Scanner(System.in);

		System.out.println("Type your rating for Breaking Bad");
		Double rating1 = var2.nextDouble() ;
		System.out.println("Type your rating for Stranger Things");
		Double rating2 = var2.nextDouble() ;

		// Compare user preference between movies 1 and 2.
		// If the rating of the movie 1 is bigger than the rating of movie 2 then
		//  print out "I liked movie 1 more than movie 2"
		if (rating1 > rating2) {
			System.out.println("I liked the movie 1 more than movie 2");
		}
		// else, print out "I liked movie 2 more than movie 1"
		else {
			System.out.println("I liked movie 2 more than movie 1");
		}
	}

	// For now, don't worry about the code included in the block below, this is only used to run your program properly
	// and allow us to grade it more easily :)
	// Do not change anything in it or your code might not run at all
	public static void main(String[] args) {
		example();
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}
}