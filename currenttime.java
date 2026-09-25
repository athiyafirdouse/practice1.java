import java.util.Scanner;
public class currenttime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the time one offset to GMT:");
        long timeZonechange = sc.nextInt();

        long totalmillisecound = System.currentTimeMillis();
        long totalsecond = totalmillisecound / 1000;
        long currentSecond = totalsecond % 60;
        long totalminutes = totalsecond / 60;
         long currentMinute = totalminutes % 60;

        long totalHours = totalminutes / 60;

        long currentHour = ((totalHours + timeZonechange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);



    }
}
