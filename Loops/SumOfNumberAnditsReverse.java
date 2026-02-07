import java.util.Scanner;

public class SumOfNumberAnditsReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    sc.close();
    System.out.println("Original Number: "+ num);
    int temp = num;

    int reverseNumber = 0;
    while(temp != 0){
      int rem = temp%10;
      temp/= 10;
      reverseNumber = rem +reverseNumber*10;
    }

    System.out.println("Reverse Number: "+reverseNumber);
    System.out.println("Sum of Number and its Reverse " + (num + reverseNumber));
  }
}