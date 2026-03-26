package Recursive;

public class recursive {

    public static int multiply(int[] arr, int index) {
        if (index >= arr.length) return arr[index];

        return arr[index] * multiply(arr, ++index);
            } 

    public static int sumDigits(int n){
        n = Math.abs(n);

        if(n < 5) return n; 

        return n + sumDigits(n + 1);
    } 
}