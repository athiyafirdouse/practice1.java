import java.util.Scanner;
  public class Farhenhit
  {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
         double farenhit = sc.nextInt();
         double celsius = (( 5 * (farenhit - 32.0)) / 9.0);
         System.out.println("farenhit is " + celsius);
     }
  }