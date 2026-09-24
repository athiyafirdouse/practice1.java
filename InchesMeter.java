import java.util.Scanner;
public class InchesMeter {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        double inches = sc.nextDouble();
        double meters = inches * 0.0254;
        System.out.println("the inches is "+meters);
    }
    
}
