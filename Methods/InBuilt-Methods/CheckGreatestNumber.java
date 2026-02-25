import java.util.Scanner;

public class CheckGreatestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the first number: ");
    double a = sc.nextInt();
    System.out.print("please enter the first number: ");
    double b = sc.nextInt();
    System.out.print("please enter the first number: ");
    double c = sc.nextInt();
    sc.close();

    double max = Math.max(a, Math.max(b, c));
    System.out.println(max);

  }
}
