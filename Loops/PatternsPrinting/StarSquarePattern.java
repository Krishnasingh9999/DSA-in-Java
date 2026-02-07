import java.util.Scanner;

public class StarSquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    /*
    starSquare
    * * * 
    * * * 
    * * * 
    */

    //using nested loop
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
