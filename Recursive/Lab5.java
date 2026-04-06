package Recursive;
public class Lab5 {

    // 1. Product of array elements from index to end
    public static int productFromIndex(int[] nums, int index) {
        // Base case:
        if (index >= nums.length)
            return 1;
        // What should happen when index reaches the last element?

        
        // Recursive case:
        return nums[index] * productFromIndex(nums, index + 1);
        // Multiply current element by result of rest of array
    }

    // 2. Check if value exists in array
    public static boolean containsValue(int[] nums, int index, int value) {
        // Base case:
        if (index >= nums.length)
            return false;
        // What if index goes past the array?
        if (nums[index] == value)
            return true;

        // Recursive case:
        return containsValue(nums, index + 1, value);
        // Check current element OR check rest of array
    }

    // 3. Count occurrences of value in array
    public static int countOccurrences(int[] nums, int index, int value) {
        // Base case:
        if (index >= nums.length)
            return 0;
        // What if index goes past the array

        // Recursive case:
        if (nums[index] == value)
        return 1 + countOccurrences(nums, index + 1, value);
    else
        return 0 + countOccurrences(nums, index + 1, value); 
        // Add 1 if match, otherwise 0, then recurse
    }

    // 4. Count all the evens in the array
    public static int countEvens(int[] nums, int index) {
        // Base case:
        if (index >= nums.length)
            return 0;
        // When index goes past the array

        
        // Recursive case:
        if (nums[index] % 2 == 0)
            return 1 + countEvens(nums, index + 1);
        else
            return 0 + countEvens(nums, index + 1);

        // Check if current is even, then recurse
    }

    // 5. Find first index of target
    public static int findFirstIndex(int[] nums, int target, int index) {
        // Base case:
        if (index >= nums.length)
            return -1;
        // What if index goes past the array?


        // Recursive case:
        if (nums[index] == target)
            return index;
        else 
            return findFirstIndex(nums, target, index + 1);
        // If found, return index
        // Otherwise search the rest
    }

    // BONUS: Fibonacci
    public static int fibonacci(int n) {
        // Base cases:
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        // fibonacci(0) = 0
        // fibonacci(1) = 1


        // Recursive case:
        return fibonacci(n - 1) + fibonacci(n - 2);
        // fibonacci(n-1) + fibonacci(n-2)

    }


    // Main method for testing (optional)
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 3};

        System.out.println(productFromIndex(nums, 1)); 
        System.out.println(containsValue(nums, 0, 4)); 
        System.out.println(countOccurrences(nums, 0, 3)); 
        System.out.println(countEvens(nums, 0)); 
        System.out.println(findFirstIndex(nums, 5, 0)); 
        System.out.println(fibonacci(6)); 
    }
}