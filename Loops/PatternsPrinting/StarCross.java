import java.util.Scanner;

public class StarCross {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    //Taking input n=5
    // *       *
    //   *   *
    //     *
    //   *   *
    // *       *
    //using nested loop

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
         if(i==j || j==n+1-i){
          System.out.print("* ");
         }
         else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}

