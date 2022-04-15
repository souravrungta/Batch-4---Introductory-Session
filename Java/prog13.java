//Name:Sourav Kumar Rungta
//Program of user input addition.

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a:");
    int a = scan.nextInt();
    System.out.print("Enter b:");
    int b = scan.nextInt();
    int c=a+b;
    System.out.println("Value of c=" + c);
  }
}