public class IncrementDecrement {

  public static void main(String[] args) {
    int x = 10;
    x++; //post-increment
    System.out.println(x); //11

    ++x; //pre-increment
    System.out.println(x); //12

    int y = 50;
    y--; //post-decrement
    System.out.println(y); //49

    --y; //pre-decrement
    System.out.println(y); //48

    int a = 100;
    System.out.println(a++); //100
    System.out.println(a); //101

    System.out.println(++a); //102
    System.out.println(a); //102


    //Note
    int m = 11;
    int n = m++; // n=11 pehle use karo baad me increment karo

    System.out.println(m + " " + n); // 12 11
  }
}