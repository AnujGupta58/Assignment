//Question 9

//Write a program to display times in different country format.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import  java.util.TimeZone;
import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;
public class TimeZoneQ9
{
    public static void main(String[] args)
    {
        ZoneId zoneId1 = ZoneId.of("Asia/Kolkata");
        LocalTime localTime1=LocalTime.now(zoneId1);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime1=localTime1.format(formatter1);
        System.out.println("Current time of the day in Kolkata: " + formattedTime1);

        ZoneId zoneId2 = ZoneId.of("America/Los_Angeles");
        LocalTime localTime2=LocalTime.now(zoneId2);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime2=localTime2.format(formatter2);
        System.out.println("Current time of the day in Los_Angeles: " + formattedTime2);

        ZoneId zoneId3 = ZoneId.of("Europe/Paris");
        LocalTime localTime3=LocalTime.now(zoneId3);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime3=localTime3.format(formatter3);
        System.out.println("Current time of the day in Paris: " + formattedTime3);

        ZoneId zoneId4 = ZoneId.of("Asia/Tokyo");
        LocalTime localTime4=LocalTime.now(zoneId4);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime4=localTime4.format(formatter4);
        System.out.println("Current time of the day in Tokyo: " + formattedTime4);
    }
}
