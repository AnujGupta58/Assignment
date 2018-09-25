// QUES 2

//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?


package com.company;
import java.lang.String;
public class Duplicate_word
{
    public static void main(String[] args)
    {
        String str="this is car this is bag";
        int count=0,len=str.length();
        String str1[]=str.split(" ");
        int len1=str1.length;
        System.out.println(len1);
        for(int i=0;i<len1;i++)
        {   count=0;
            for(int j=0;j<len1;j++)
            {
                if((i>j) && (str1[i].equals(str1[j])))
                {
                    break;
                }
                if((str1[i].equals(str1[j])))
                {
                    count++;
                }
                if(j==len1-1)
                {
                    if(count>1)
                    {
                        System.out.println(" number of times word "+str1[i] + " occured in string-- " + count);
                    }
                }
            }

        }

    }
}
