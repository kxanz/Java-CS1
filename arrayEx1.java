public class arrayEx1 {
  


  public static boolean isArrayEven(int[] arr){
    int size = arr.length;
    if(size%2==0){
      return true;
    }else{
    return false;
    }
  }
  
  public static void main(String[]args){
    
    int[] Array = new int[5];
    System.out.println(isArrayEven(Array));
    String format = " aifoaioanoi ";
    System.out.println(formatString(format));
    System.out.println(formatString(" afjsafak "));
  }

  public static String formatString(String format){
    return "";
  }
}
