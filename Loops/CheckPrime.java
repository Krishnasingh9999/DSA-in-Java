import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the number: ");
    int n = sc.nextInt();
    sc.close();

    // if(n == 1){
    //   System.out.println("Neither prime nor composite");
    //   return;
    // }

    boolean isPrime = true;

    
    // VERY IMPORTANT CONCEPT
    // if i is a factor of n then n/i is also a factor of n

    for(int i=2; i*i<=n; i++){
      if(n%i == 0){
        isPrime = false;
        break;
      }
    }

    if(n == 1){
      System.out.println("Neither prime nor composite");
    }
    else if(isPrime) {
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }

  }
}
