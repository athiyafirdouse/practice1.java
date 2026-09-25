import java.util.Scanner;
public class SumofInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        int firstnumber = num %10;
        int remainingnumber = num/10;

        int secondnumber = remainingnumber %10;
         remainingnumber = remainingnumber/10;

         int thirdnumber = remainingnumber %10;
         remainingnumber = remainingnumber/10;

          int fourthnumber = remainingnumber %10;
         remainingnumber = remainingnumber/10;

         int sum = thirdnumber+secondnumber+firstnumber+fourthnumber;
         System.out.println("the sum of all digits is " + sum);
        
    }
    
}
