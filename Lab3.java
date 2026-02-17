public class Lab3 {
    // In this lab, we will be working with methods and practicing many ways to use them!

    // inside the main method is where you'll be able to include and test all the other ones
    // that you will be creating

    // We will be testing each required method individually when grading, so make sure to test that they work correctly
    // before submitting!
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.print(q1(arr,2));

        arr [1] = 4;
        System.out.print(q1(arr,1));

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

        arr [1] = 4;

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
        if (array == null) {
            return;
        } 
        else if (firstIndex < 0 || firstIndex >= array.length){
            return;
        } else if (firstIndex == secondIndex)

        return arr[index];
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
    public static FIXME q4(FIXME,FIXME,FIXME){

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
    public static FIXME q5(FIXME,FIXME){

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
    public static FIXME q6(FIXME,FIXME,FIXME){

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
    public static FIXME q7(FIXME,FIXME,FIXME){

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
    public static FIXME q8(FIXME,FIXME){

    }

