public class whilenforpratice {
  
  public static void main(String[]args){
    int[] arr = {10,22,31,-45,25};

    int maxNum = arr[0];
    int minNum = arr[0];
    double average = 0;
    int sum = 0;
    //Find the maxNum using a loop
    int i = 0;


    while (i < arr.length){
      int value = arr[i];
        if (maxNum < value){
          System.out.print("value");
          maxNum = value;
      }
      i++;
    } 


    //Find the minNum using a do-while loop
    int j = 0;
    do { 
        if (arr[j] < minNum) {
          minNum = arr[j];
        }
        i++;
    } while (i < arr.length);



    //Find the average using a for loop
    for (int k = 0; k < arr.length; k++){
      sum += arr[k];
    }
    average = (double) sum / arr.length;
  }
}
