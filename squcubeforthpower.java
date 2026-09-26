import java.util.Scanner;
public class squcubeforthpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the side lenght");
        double val = sc.nextDouble();

        System.out.printf("square: %12.2f\n " , val * val);
        System.out.printf("cube : %14.2f\n",val * val * val);
        System.out.printf("fourth power: %6.2f\n",Math.pow(val,4));   //%6.2f is defind %6 cahracter and 2f for 2 digit floting point
    }


    }
    

