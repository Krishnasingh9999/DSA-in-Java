import java.util.*;
public class ThreeGreatestNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first number: ");
    int a = sc.nextInt();

    System.out.print("Please enter the second number: ");
    int b = sc.nextInt();

    System.out.print("Please enter the third  number: ");
    int c = sc.nextInt();

    // Without using && operator
    //Nested if-else
    if(a>=b){
      if(a>=c){
        System.out.println(a);
      }else{
        System.out.println(c);
      }
    }
    else{
      if(b>=c){
        System.out.println(b);
      }else{
        System.out.println(c);
      }
    }

    // //nested if-else using && operator
    // if(a>=b && a>=c){
    //   if(a == b && a == c) {
    //     System.out.println("All numbers are equal");
    //   }
    //   else{
    //     System.out.println(a + " is greatest number");
    //   }
    // }
    // else if(b>c && b>a){
    //   System.out.println(b + " is greatest number");
    // }
    // else {
    //   System.out.println(c + " is greatest number");
    // }


    // //using Math.max(in-built method)

    // int maxNumber = Math.max(a, Math.max(b, c));

    // if(a == b && b == c){
    //   System.out.println("All numbers are equal");
    // }else{
    //   System.out.println(maxNumber);
    // }
    sc.close();
  }
}
