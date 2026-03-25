public class recursive {
    public static void mult(int[] arr){
        if (arr.length == 0){
            return;
        }
    }

    public static int multiply(int[] arr, int index) {
        if (index >= arr.length) return 1;
        return arr[index] * multiply(arr, index + 1);
    }
}