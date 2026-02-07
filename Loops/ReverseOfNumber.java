import java.util.Scanner;

public class ReverseOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    sc.close();

    int reverseNumber = 0;
    while(num != 0){
      int rem = num%10;
      num/= 10;
      reverseNumber = rem +reverseNumber*10;
    }

    System.out.println(reverseNumber);
  }
}
