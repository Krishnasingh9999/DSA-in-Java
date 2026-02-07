import java.util.Scanner;

public class AlphabetSquare3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=5
    // A A A A A
    // B B B B B
    // C C C C C 
    // D D D D D
    // E E E E E

    
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print((char)(i+64) + " ");
      }
      System.out.println();
    }

  }
}
