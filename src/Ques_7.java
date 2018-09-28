// Question 7

//WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;
public class Ques_7
{
    public static void main(String[] args)
    {
        double sec,hr,min,days;
        System.out.print("Enter the Seconds = ");
        Scanner sc=new Scanner(System.in);
        sec=sc.nextInt();
        days=sec/(60*60*24);
        sec=sec%(24*3600);
        hr=sec/3600;
        sec=sec%3600;
        min=sec/60;
        sec=sec%60;
        System.out.println("days = "+days);
        System.out.println("hour = "+hr);
        System.out.println("minutes = "+min);
    }
}
