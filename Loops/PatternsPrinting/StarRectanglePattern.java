import java.util.Scanner;

public class StarRectanglePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows");
    int rows = sc.nextInt();

    System.out.println("enter number of columns");
    int cols = sc.nextInt();
    sc.close();

    /*
    starRectangle
    * * * * * 
    * * * * * 
    * * * * *
    */

    //using nested loop
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
