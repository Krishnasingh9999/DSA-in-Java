import java.util.Scanner;

public class CheckCompositeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the number: ");
    int n = sc.nextInt();

    boolean isComposite = false;

    
    // VERY IMPORTANT CONCEPT
    // if i is a factor of n then n/i is also a factor of n

    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i == 0){
        isComposite = true;
        break;
      }
    }

    if(isComposite){
      System.out.println("composite");
    }else{
      System.out.println("Not composite");
    }

    sc.close();
  }
}
