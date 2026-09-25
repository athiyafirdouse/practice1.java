import java.util.Scanner;
public class MintoYeardays
{
  public static void main(String[] args)
  {
    double mininyear = 60 * 24 * 365;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the numbers of minutes");
    double min = sc.nextDouble();
    long years = (long)(min/mininyear); // to covert min from years 
    int days = (int)(min/60/24) % 365;
    System.out.println("minutes is approximately equals to " + years + " yaers and days is" + days);

 
  }
 
}