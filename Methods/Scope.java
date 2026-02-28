// Scope of Variable in methods
public class Scope { 
  static int i; // Globally accessible, global variable or shared variable

  public static void fun(){
    System.out.println(i); // 16
    int i = 70;
    System.out.println(i); // 70
  }
  public static void main(String[] args) {

    // if we define i in this place then function cannot access the variable
    i = 16;
    fun(); // 16
     
    //But if we again define i in this place 
    int i = 20; // Local variable, here is accessible only this place or main
    System.out.println(i); // 20

    i++;
    System.out.println(i); // 21, 
    // *****  because local variable has high priority *****

    fun(); // but fun print the global variable or shared variable,  16
  }
}
