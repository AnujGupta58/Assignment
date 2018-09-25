// QUESTION 1

//Q1. Write a program to replace a substring inside a string with other string ?

package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.Arrays;
public class Substring
{
    public static void main(String[] args)
    {   int i,temp;
        System.out.print("Entered string is :");
        String str="java is easy and difficult";
        System.out.println(str);
        String str1[]=str.split(" ");
        System.out.print("enter the substring to be replaced :");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print("enter the string to be replaced with :");
        String new_s=sc.next();
        // loop to replace string
        for(i=0;i<str1.length;i++)
        {
            if(str1[i].equals(s))
            {
                temp=i;
                str1[temp]=new_s;
            }
        }
        // Here we are using replace function to convert character array into string form
        String str2  = Arrays.toString(str1);
        str2 = str2.substring(1, str2.length()-1).replace(",", "");
        System.out.println("updated String = " +"'"+str2+"'");
    }
}
