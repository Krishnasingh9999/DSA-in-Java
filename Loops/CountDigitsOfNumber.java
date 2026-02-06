import java.util.Scanner;

public class CountDigitsOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = sc.nextInt();
    sc.close();

    if(num == 0){
      System.out.println(1);
      return;
    }

    int count = 0;

    // // Using while loop
    // while(num != 0){
    //   num = num/10;
    //   count++;
    // }
    // System.out.println(count);


    // using for loop

    for(num = Math.abs(num); num>0; num/=10){
      count++;
    }
    System.out.println(count);


  }
}
