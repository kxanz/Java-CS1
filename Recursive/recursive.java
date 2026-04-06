package Recursive;

public class recursive {

    public static int multiply(int[] arr, int index) {
        if (index >= arr.length) return arr[index];

        return arr[index] * multiply(arr, ++index);
            } 

    public static int sumDigits(int n){
        n = Math.abs(n);

        if(n < 10) return n; 

        return (n % 10) + sumDigits(n / 10);
    } 
}