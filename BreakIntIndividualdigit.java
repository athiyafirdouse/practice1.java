import java.util.Scanner;
public class BreakIntIndividualdigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num1 = sc.nextInt();
    int n1 = num1 / 100000 % 10;
    int n2 = num1 /10000 %10;
    int n3 = num1/1000 % 10;
    int n4 = num1/100 % 10;
    int n5 = num1 /10 % 10;
    int n6 = num1/10% 10;

    System.out.println(n1  +"" + n2 + ""+n3+""+n4+""+n5+""+n6);



    }
}
