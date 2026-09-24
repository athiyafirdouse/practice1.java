import java.util.Scanner;
public class Celsisus {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        double celsius = sc.nextDouble();
        double farhenhit =(9*celsius + (32 * 5))/5;
        System.out.println("the farhenhit is "+ farhenhit);
    }

    
}
