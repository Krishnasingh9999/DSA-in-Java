public class Syntax {
  public static void name() {
    System.out.print("Krishna ");
    surname();
  }

  public static void main(String[] args) {
    // System.out.println("Staring");
    // name();
    // System.out.println( "Ending");

    num();
    
  }

  public static void surname(){
    System.out.println("Singh");
  }

  public static void num(){
    System.out.print("1.");
    name();
  }
}

//Here one function is calling inside another function
