import java.util.Scanner;

public class PowerLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the base number");
    int a = sc.nextInt();

    System.out.println("enter the exponent number of a base");
    int b = sc.nextInt();
    sc.close();

    int pow = 1;
    for(int i=1; i<=b; i++){
      pow*=a;
    }
    System.out.println(a + " raised to the power "+ b + " is "+pow);
  }
}
