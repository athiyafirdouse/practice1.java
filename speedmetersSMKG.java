import java.util.Scanner;
public class speedmetersSMKG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float timeSeconds;
        float mps,kph,mph;

        System.out.print(" input distance in meters ");
        float distance =sc.nextFloat();

        System.out.println("input hours ");
        float  hr = sc.nextFloat();

        System.out.println("the input in minutes  ");
        float min = sc.nextFloat();

        System.out.println("the input in secound ");
        float sec = sc.nextFloat();
 
        timeSeconds = (hr * 3600) + (min * 60) + sec; 
         // 1 hour = 3600 and 1 min = 60
        mps = distance /timeSeconds ;
        kph = (distance/1000.0f) / (timeSeconds/3600.0f);  //convert meter to kilometer ex:2500 /1000
                                                          //covert seconds to hour 
        System.out.println("your speed in meter is " + timeSeconds);
        System.out.println("your speed is km/h is " + mps);
        System.out.println("your speed is kph is " + kph); 


    } 
}
