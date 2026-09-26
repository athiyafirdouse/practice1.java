import java.util.Scanner;
public class Arithimetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num = sc.nextInt();
        System.out.println("enter the number 2");
        int num2 = sc.nextInt();
        System.out.println("the sum of two numbers is :" + (num + num2));
        System.out.printf("the difference is two number is:",+ (num-num2));
        System.out.println("the product of two number is :" + (num * num2) );
        System.out.println("the average of two integer:" + (num+num2)/2);
        System.out.println("Max integer:"+ Math.max(num,num2));
        System.out.println("min integer :" + Math.min(num ,num2));



    }
}
