

public class PrintEvenNumToHundred {

  public static void main(String[] args) {

    ////Worst code because loops 100 iterations
    // for(int i=1; i<=100; i++){
    //   if(i%2 == 0){
    //     System.out.println(i + " Even");
    //   }
    //   else{
    //     System.out.println(i +" Odd");
    //   }
    // }

    // Best code only 50 iterations almost half iterations
    for(int i=2; i<=100; i = i+2){
      System.out.println(i);
    }
  }
}