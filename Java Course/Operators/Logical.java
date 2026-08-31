package Operators;
public class Logical {
  public static void main(String[] args) {

    int x = 7;
    int y = 5;
    int a = 8;
    int b = 4;
 
    // boolean result = x>y && a>b ;
    // boolean result = x>y || a>b ;
    boolean result = x>y || a>b || a>1;


    System.out.println(result);
  }
}
