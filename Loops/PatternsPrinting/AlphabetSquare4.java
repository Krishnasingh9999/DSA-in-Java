import java.util.Scanner;

public class AlphabetSquare4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // Taking input n=4
    // a a a a
    // B B B B 
    // c c c c
    // D D D D

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        if(i%2 == 1){
          System.out.print((char)(i+96) + " ");
        }else{
          System.out.print((char)(i+64) + " ");
        }
      }
      System.out.println();
    }
  }
  
}