// Ques  7

//Q7. Write a program to print your Firstname,LastName & age using static block,static method &
//    static variable respectively
package com.company;

public class static_Ques
{
    static String first_name;
    static String last_name;
    static int age;
    static
    {
        first_name="Anuj";
        last_name="Gupta";
        age=22;

    }
    static void print()
    {
        System.out.println(first_name);
        System.out.println(last_name);
        System.out.println(age);

    }

    public static void main(String[] args)
    {
        print();
    }
}
