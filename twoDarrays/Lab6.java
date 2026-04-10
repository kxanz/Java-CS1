package twoDarrays;

public class Lab6 {
    /*
    * Welcome to Lab 5!
    *
    * The focus of this lab will be to make you comfortable dealing and working
    * with 2D arrays.
    *
    * Complete all the methods requested below, make sure to test them!
    * Also, please do not modify the method's signature!
    * */
    public static void main(String[] args) {
        // Make sure to test the methods that you've completed here in main!
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        // Method 1
        System.out.println(sumDiagonals(arr));
        // Method 2
        spiral(arr);
        System.out.println();
        // Method 3
        int[] colSum = sumColumns(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(colSum[i]);
        }
        //Method 4
        System.out.println(getMiddle(arr));

        //Method 5
        System.out.println(arraysAreEqual(arr, arr));

        //Method 6
        int[][] swapped = rowSwap(arr, 0, 2);
        for (int row = 0; row < swapped.length; row++){
            for (int col = 0; col < swapped[row].length; col++){
                System.out.print(swapped[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //Method 7
        int[][] cropped = cropArray(arr, 1, 2, 2, 2);

        for (int row = 0; row < cropped.length; row++){
            for (int col = 0; col < cropped[row].length; col++){
                System.out.print(cropped[row][col] + " ");
            }
            System.out.println();
        }
    }   


    /*
     * This method returns the sum of the numbers in both diagonals of a
     * squared 2D array.
     *
     * e.g.
     * 1 2 3
     * 4 5 6
     * 7 8 9
     * The answer would be 1+5+9 (upper left to lower right)  + 3+5+7 (upper right to lower left)
     * = 30
     * */
    public static int sumDiagonals(int[][] arr){
        //Create your method here
        int sum = 0;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (row == col || row + col == arr.length - 1){
                    sum += arr[row][col];
                }
            }
        }
        return sum;
    }


    /*
    * This method prints out all the elements in a squared array in spiral order.
    * Starting in the top left corner and then going right, down, left, up until you reach the middle
    *
    * e.g.
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * output = 1 2 3 6 9 8 7 4 5
    *
    * 1 2
    * 3 4
    * output = 1 2 4 3
    * */
    public static void spiral(int[][] arr){
        //Create your method here
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
    
        while (top <= bottom && left <= right){
    
            for (int col = left; col <= right; col++){
                System.out.print(arr[top][col] + " ");
            }
            top++;
    
            for (int row = top; row <= bottom; row++){
                System.out.print(arr[row][right] + " ");
            }
            right--;
    
            if (top <= bottom){
                for (int col = right; col >= left; col--){
                    System.out.print(arr[bottom][col] + " ");
                }
                bottom--;
            }
    
            if (left <= right){
                for (int row = bottom; row >= top; row--){
                    System.out.print(arr[row][left] + " ");
                }
                left++;
            }
        }
    }

    /*
    * This method returns a new 1D array with the sum of each of the columns in a squared array
    *
    * e.g.
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * output = [12 15 18]
    *
    *
    * 1 2
    * 3 4
    * output = [4 6]
    * */
    public static int[] sumColumns(int[][] arr){
        //Create your method here
        int[] oneDim = new int[arr[0].length];

        for (int row = 0; row < arr.length; row++){
			for (int col = 0; col < arr[row].length; col++){
				int currentValue = arr[row][col];
				oneDim[col] = oneDim[col] + currentValue;
			}
		}
		return oneDim;
    }

    /*
    * Given a squared 2D array, this method returns the element at the middle position
    * of the whole array. If there is no exact middle element, then it returns the avg of the elements
    * that form the middle square
    *
    * e.g.
    * 1 2 3 1 1
    * 4 5 6 2 2
    * 7 8 9 7 8
    * 3 4 5 6 8.,
    * 7 8 9 2 3
    * output = 9.0
    *
    * 1 2 5 6
    * 3 4 7 8
    * 1 2 5 6
    * 3 4 7 8
    * output = 1+2+3+4/4 = 10/4 = 2.5
    *
    * */
    public static double getMiddle(int[][] arr){
        //Create your method here
        int mid = arr.length / 2;
        
        if (arr.length % 2 == 0){
            double sum = 0;

            sum += arr[mid][mid] + arr[mid - 1][mid] + arr[mid][mid - 1] + arr[mid - 1][mid - 1];
            return sum / 4;
        }

        return arr[mid][mid];
    }

    /*
    * Given two 2D arrays, return true if they are exactly the same, false otherwise
    *
    * e.g.
    * 1 2 3    1 2 3
    * 4 5 6    4 5 6
    * 7 8 9    7 8 9
    * output = true
    *
    * 1 2      2 3
    * 3 4      1 4
    * output = false
    * */
    public static boolean arraysAreEqual(int[][] arr1, int[][] arr2){
        //Create your method here
        if (arr1.length != arr2.length) {
            return false;
        }

        for ( int i = 0; i < arr1.length; i++){
            if ( arr1[i].length != arr2[i].length){
                return false;
            }
            for ( int j = 0; j < arr1[i].length; j++){
                if ( arr1[i][j] != arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    * Given a 2D array, and two integers rowAIndex and rowBIndex, swap the elements
    * in the two rows given, and return the resulting array
    *
    * e.g.
    * rowAIndex = 0, rowBIndex = 2
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * output =
    * 7 8 9
    * 4 5 6
    * 1 2 3
    *
    * rowAIndex = 0, rowBIndex = 1
    * 1 2
    * 3 4
    * output =
    * 3 4
    * 1 2
    * */
    public static int[][] rowSwap(int[][] arr, int rowAIndex, int rowBIndex){
        //Create your method here
        int[] temp = arr[rowAIndex]; 
        
        arr[rowAIndex] = arr[rowBIndex];
        arr[rowBIndex] = temp;


        return arr;
    }

    /*
    * Given the following parameters:
    * arr = 2D array
    * startRow = the first row to be kept
    * startCol = the first column to be kept
    * endRow = the last row to be kept
    * endCol = the last column to be kept
    *
    * return a smaller 2D array containing the elements in the given range
    *
    * e.g.
    * 1 2 3
    * 4 5 6
    * 7 8 9
    * startRow = 1, startCol = 1, endRow = 2, endCol = 2
    * output:
    * 5 6
    * 8 9
    *
    *
    * 1 2
    * 3 4
    * startRow = 0, startCol = 0, endRow = 0, endCol = 1
    * output:
    * 1 2
    * */
    public static int[][] cropArray(int[][] arr, int startRow, int startCol, int endRow, int endCol){

        int numRows = endRow - startRow + 1;
        int numCols = endCol - startCol + 1;

        int[][] newArray = new int[numRows][numCols];

        int newRow = 0;

        for (int row = startRow; row <= endRow; row++) {
            int newCol = 0;

            for (int col = startCol; col <= endCol; col++){
                newArray[newRow][newCol] = arr[row][col];
                newCol++;
            }

            newRow++;
        }

       return newArray;
    }





}
