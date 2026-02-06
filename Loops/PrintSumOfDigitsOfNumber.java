import java.util.Scanner;

public class PrintSumOfDigitsOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    sc.close();

    int sum = 0;

    while(num != 0){
      int rem = num%10;
      num = num/10;

      sum = sum +rem;
    }

    System.out.println((sum>0)? sum :-sum);
    
  }
}
