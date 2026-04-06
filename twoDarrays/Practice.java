package twoDarrays;

public class Practice {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] oneDarr = addArr(arr);

        for (int i = 0; i < oneDarr.length; i++) {
            System.out.print(oneDarr[i] + " ");
        }
    }

    public static int[] addArr(int[][] arr) {

            int[] oneDarr = new int[arr.length];
        
            for (int row = 0; row < arr.length; row++) {
                int sumRow = 0;
                for (int col = 0; col < arr[row].length; col++) {
                    sumRow += arr[row][col];
                }
                oneDarr[row] = sumRow;
            }
            return oneDarr;
        }
    
}