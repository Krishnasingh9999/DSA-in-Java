import java.util.Scanner;

public class PrintGPSeries {
  public static void main(String[] args) {
    // 1,2,4,8,16,...upto n terms;

    Scanner sc = new Scanner(System.in);
    System.out.print("please enter the n terms: ");
    int n = sc.nextInt();

    int a = 1;
    int r = 2;

    for(int i=1; i<=n; i++){
      System.out.println(a);
      a*=r;
    }

    sc.close();
  }
}
