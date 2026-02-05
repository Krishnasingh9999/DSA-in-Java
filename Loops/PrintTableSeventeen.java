
public class PrintTableSeventeen {
  public static void main(String[] args) {

    //// Best code ever
    // for(int i=1; i<=10; i++){
    //   System.out.println("The table of 17 is:");
    //   System.out.println(i*17);
    // }

    //// 154 iterations of loops -  worse code
    // for(int i=17; i<=170; i++){
    //   if(i%17 == 0){
    //     System.out.println(i);
    //   }
    // }

    // Only 10 iterations of loops -  Best Code 
    for(int i=17; i<=170; i=i+17){
      System.out.println(i);
    }
  }  
}
