import java.util.Scanner;

public class NumberSquare1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n = 4
    // 1234
    // 1234
    // 1234
    // 1234

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
