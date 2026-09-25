import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input weight in pounds:");
        double weight = sc.nextDouble();
        System.out.println("input height in inches");
        double inches = sc.nextDouble();
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("body mass index is " + BMI);
        
    }
    
}
