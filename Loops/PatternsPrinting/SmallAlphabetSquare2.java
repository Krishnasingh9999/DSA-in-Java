import java.util.Scanner;

public class SmallAlphabetSquare2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // a b c d
    // a b c d
    // a b c d
    // a b c d

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print((char)(j+96) + " ");
      }
      System.out.println();
    }
  }

}
