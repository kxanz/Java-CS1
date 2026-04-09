package twoDarrays;
public class InClassExercise5 {
	public static void main(String[] args){
		// test your methods here
		int[][] arr = {{1, 2, 3}, 
					   {4, 5, 6}, 
					   {7, 8, 9}};

		System.out.println(sumDiagonals(arr));
		System.out.println(sumOuter(arr));
		
		int[] result = sumColumns(arr);

		for (int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

	// ex 1
	public static int sumDiagonals(int[][] arr){
        //Create your method here
		int sum = 0;

		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				if (row == col ){
					sum += arr[row][col];
				}
			}	
		}
		return sum;		
	}
	// ex 2
	public static int sumOuter(int[][] arr){
        //Create your method here
		int sum = 0;

		for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				if (arr[row][col] == arr[1][1]) {
					sum -= arr[row][col];
				}
				sum += arr[row][col];
				}
			}
			return sum;
		}

	// ex 3
	public static int[] sumColumns(int[][] arr){
		int[] oneDim = new int[arr[0].length];

        for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				int currentValue = arr[row][col];
				oneDim[col] = oneDim[col] + currentValue;
			}
		}
		return oneDim;
}
}
// ex 3 thinking 
// step 1 abstraction (add the columns) in each row increase
// after we add the column of each row we increase the column