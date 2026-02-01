import java.util.*;

public class Quadrant {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the first point of coordinate: ");
    int x = sc.nextInt();

    System.out.print("Please enter the second point of coordinate: ");
    int y = sc.nextInt();

    if(x == 0 && y ==0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the origin");
    }
    else if((x > 0 || x < 0) && y == 0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the x-axis");
    }
    else if ((y > 0 || y < 0) && x == 0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the y-axis");
    }
    else if(x > 0 && y > 0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the 1st Quadrant");
    }
    else if(x < 0 && y > 0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the 2nd Quadrant");
    }
    else if(x < 0 && y < 0){
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the 3rd Quadrant");
    }
    else{
      System.out.println("(" + x + "," + y + ")" + "Coordinate lies on the 4th Quadrant");
    }

    sc.close();
  }
}
