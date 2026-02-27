public class SwapOfTwoNum {

  public static void swap(int a, int b){

    // // Using Third variable
    // int temp = a;
    // a = b; 
    // b = temp;

    // // Without Using Third variable
    // a = a+b;
    // b = a-b;
    // a = a-b;

    // Using xor
    a = a^b;
    b = a^b;
    a = a^b;

    System.out.println(a + " " + b);
  }
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    swap(x, y); // also concept of pass by value
  }
}
