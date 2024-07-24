import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("choose \n1.add \n2.subract\n3.multiply \n4.divide");
    Scanner in = new Scanner(System.in);
    int oper = in.nextInt();
    System.out.println("enter the numbers");
    int a= in. nextInt();
    int b = in .nextInt();
    switch (oper) {
      case 1:System.out.println(a+b); 
        break;
      case 2:System.out.println(a-b);

      case 3:System.out.println(a*b); 
        break;
      case 4:System.out.println(a/b); 
        break;
      default :System.out.println("invalid choice");
    }
    
  } 
}
