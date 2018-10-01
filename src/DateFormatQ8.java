// Question 8

//Write a program to format date as example "21-March-2016"

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateFormatQ8
{
    public static void main(String[] args) throws ParseException
    {
        Date date=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy  'and'  hh:mm:ss a z");
        System.out.println(dateFormat.format(date));
    }
}
