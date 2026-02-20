public class Lab3 {
    // In this lab, we will be working with methods and practicing many ways to use them!

    // inside the main method is where you'll be able to include and test all the other ones
    // that you will be creating

    // We will be testing each required method individually when grading, so make sure to test that they work correctly
    // before submitting!
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3, 4, 5};

        System.out.println(q1(arr,2));

        System.out.println(q2(arr,1,4));
        System.out.println(q1(arr,1));

        System.out.println(q3(arr, 0,4));
        
        System.out.println(q4(arr, 4, 0));

        System.out.println(q5(arr, 5));

        System.out.println(q6(arr, 3, 6));

        System.out.println(q7(arr, 1, 4));

        System.out.println(q8(arr, 3));

    }

    /*

    Create a helper method that accepts:

        An array

        An index

    The method should return the value stored at the specified index.
    Your implementation must properly handle edge cases, including:

        The array being null

        The index being negative

        The index being outside the valid range of the array
    */
    public static int q1(int[] arr, int index){
        if (arr == null) {
            return -1;
        } 
        if (index < 0){
            return -1;
        } 
        if (index >= arr.length){
            return -1;
        }
        return arr[index];
    }
    /*
    Create a helper method that accepts three parameters:

        The array that will be modified

        The index of the element to be updated

        The new value that will replace the existing value at that index

    The method should update the specified element in the array accordingly.
    Be sure to properly handle edge cases, including:

        The array being null

        The index being negative

        The index being greater than or equal to the array’s length
    */ 
    public static int q2(int[] arr, int index, int value){
        if (arr == null) return -1;
        if (index < 0 || index >= arr.length) return -1;
        
        arr[index] = value;
        return arr[index];
    }
    /*
    Create a helper method that accepts:

        An array

        The index of the first element

        The index of the second element

    The method should swap the values at the two specified indexes.
    Be sure to validate:

            The array is not null

            Both indexes are within valid bounds

            The indexes are not the same value (if so, no change is required)
    */
    public static int q3(int[] array, int firstIndex,int secondIndex){
        if (array == null) return -1;
        if (firstIndex < 0 || firstIndex >= array.length) return -1;
        if (secondIndex < 0 || secondIndex >= array.length) return -1;
        if (firstIndex == secondIndex) return 0;

        
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return 0;
    }
    /*
    Create a helper method that accepts:

        An array

        A source index

        A destination index

    The method should copy the value from the source index into the destination index.
    Ensure you validate:

        The array is not null

        Both indexes are valid

        Source and destination indexes are within range
    */
    public static int q4(int[] arr, int sourcei, int destinationi){
        if (arr == null) return -1;

        if (sourcei < 0 || sourcei >= arr.length) return -1;
        if (destinationi < 0 || destinationi >= arr.length) return -1;

        arr[destinationi] = arr[sourcei];

        return arr[destinationi];
    }
    /*
    Create a helper method that accepts:

        An array
        An index

    The method should return true if the element at the given index is even.
    Return false otherwise.

    Be sure to properly handle edge cases:

        The array is null (return false)

        The index is negative (return false)

        The index is outside the valid range (return false)
    */
    public static boolean q5(int[] array, int i){
        if (array == null) return false;
        
        if (i < 0 || i >= array.length) return false;
        
        return array[i] % 2 == 0;
        
    }
    /*
    Create a helper method that accepts:

        An array
        An index
        A value

    The method should add the given value to the element at the specified index.

    Be sure to properly handle edge cases:

        The array is null

        The index is invalid

    If any edge case occurs, the array should remain unchanged.
    */
    public static int q6(int[] array, int i, int value){
        if (array == null) return -1;
        if (i < 0 || i >= array.length) return -1;

        array[i] = array[i] + value;

        return array[i];



    }
    /*
    Create a helper method that accepts:

        An array
        Two indexes

    The method should return the difference between the values at the two indexes
    (first index minus second index).

    Be sure to validate:

        The array is not null

        Both indexes are within bounds

        If validation fails, return 0
    */
    public static int q7(int[] arr,int i1,int i2){
        if (arr == null) return 0;
        if (i1 < 0 || i1 >= arr.length) return 0;
        if (i2 < 0 || i2 >= arr.length) return 0;

        return arr[i1] - arr[i2];
    }
    /*
    Create a helper method that accepts:

        An array
        An index

    The method should return the square of the value stored at that index.

    Be sure to validate:

        The array is not null

        The index is within bounds

    If validation fails, return 0.
    */
    public static int q8(int[] arr, int i){
        if (arr == null) return 0;
        if (i < 0 || i >= arr.length) return 0;

        return arr[i] * arr[i];

    }

}