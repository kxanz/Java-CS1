public class whilenforpratice {
  
  public static void main(String[]args){
    int[] arr = {10,22,31,-45,25};

    int maxNum = arr[0];
    int minNum = arr[0];
    double average = 0;
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
    i = 0;
    //Find the minNum using a do-while loop
    do { 
        int newValue = arr[i];
        if(minNum < newValue){
          System.out.print(newValue);
        }
        i++;
    } while (i < arr.length);
    //Find the average using a for loop
    double sum = 0;
    for (int i = 0,i < arr.length;i++)
  }
}
