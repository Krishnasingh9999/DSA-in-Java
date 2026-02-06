import java.util.Scanner;

public class PrintApSeriesFromUserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the n terms: ");
    int n = sc.nextInt();

    //AP Series: 2,5,8,11,...,n;
    int a = 2; //first term
    int d = 3; // a2-a1

    // for(int i=1; i<=n; i++){
    //   int nextTerm = a + (i-1)*d;
    //   System.out.println(nextTerm);
    // }

    // // last term(an) = 3n-1;
    // for(int i=2; i<=3*n-1; i+=3){
    //   System.out.println(i);
    // }

    for(int i=1; i<=n; i++){
      System.out.println(a);
      a+=d;
    }

    sc.close();
  }
}
