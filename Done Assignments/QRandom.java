

public class QRandom{
    
    public static void q1(int[] arr, int pivot) {
        int i = 0;
        int k = arr.length - 1;
    
        while (i <= k) {
            while (i <= k && arr[i] < pivot) {
                i++;
            }
            while (i <= k && arr[k] > pivot) {
                k--;
            }
            if (i <= k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k--;
            }
        }
    }

    public static int q2(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static int[] q3(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        int i = 0; 
        int j = 0; 
        int k = 0; 

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++; 
            } else {
                mergedArray[k] = arr2[j];
                j++; 
            }
            k++; 
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}