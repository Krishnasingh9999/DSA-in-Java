import java.util.Scanner;

public class PrintAllEvenFactorByUserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the number: ");
    int n = sc.nextInt();

    // VERY IMPORTANT CONCEPT
    // if i is a factor of n then n/i is also a factor of n

    // for(int i=2; i<=Math.sqrt(n); i+=2){
    //   if(n%i == 0 && (n/i)%2 == 0){
    //     System.out.print(i + " * ");
    //     System.out.println(n/i);
    //   }
    // }

    for(int i=2; i*i<=n; i+=2){
      if(i == n/i){
          System.out.println(i);
          break;
      }
      else if(n%i == 0 && (n/i)%2 == 0){
        System.out.print(i + " * ");
        System.out.println(n/i);
      }
    }

    sc.close();
  }
}
