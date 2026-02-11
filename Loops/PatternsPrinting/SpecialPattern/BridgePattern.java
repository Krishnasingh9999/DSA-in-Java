import java.util.Scanner;

public class BridgePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the number: ");
    int n = sc.nextInt();

    //Taking input n = 5;
    // * * * * * * * * * 
    // * * * *   * * * *
    // * * *       * * *
    // * *           * *
    // *               *


    for(int i=1; i<=2*n-1; i++){
      System.out.print("* ");
    }
    System.out.println();
    
    for(int i=1; i<=n-1; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("* ");
      } 

      for(int k=1; k<=2*i-1; k++){
        System.out.print("  ");
      }

      for(int j=1; j<=n-i; j++){
        System.out.print("* ");
      } 
      System.out.println();
    }
  }
}
