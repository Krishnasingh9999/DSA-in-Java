public class PrecedenceOfOperator {
  public static void main(String[] args) {
    int x = 4 * 2 / 4; // Associativity is left to right
    int y = 8 / 2 * 6; // Associativity is left to right
    System.out.println(x); // 2
    System.out.println(y); // 24

    int a = 7;
    a++; // Associativity is right to left
    System.out.println(a); // 8

    a += 1; // Associativity is right to left
    System.out.println(a); // 9

    // a++ or a += 1 or a = a + 1, All are same

    // precedence: Unary Operator(++, --) > * / % > + - > <<,>> > ==, != and so on.
  }
}
