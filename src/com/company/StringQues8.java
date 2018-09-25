// Ques 8

//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the
//    reversed string using String Buffer

package com.company;
import java.lang.*;
public class StringQues8
{
    public static void main(String[] args)
    {
        StringBuffer str=new StringBuffer("environment");
        System.out.println("String buffer = " + str);
        str.reverse();
        System.out.println("String buffer after reversing = " + str);
        str.delete(4,9);
        System.out.println("String buffer after deleting values from index 4 to 9 = " + str);
    }

}
