import java.util.Scanner;

public class CapitalAlphabetSquare1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    sc.close();

    // if(n>26 || n<1){
    //   System.out.println("please enter between 1 to 26 number");
    //   return;
    // }

    // Taking input n = 4
    // A B C D
    // A B C D
    // A B C D
    // A B C D

    // int charValue = 65;
    // for(int i=1; i<=n; i++){
    //   for(int j=charValue; j<charValue+n; j++){
    //     System.out.print((char)j + " ");
    //   }
    //   System.out.println();
    // }

    //Simple
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print((char)(j+64)+" ");
      }
      System.out.println();
    }

}
  
}