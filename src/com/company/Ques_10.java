// QUESTION 10

//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String

package com.company;

public class Ques_10
{
    public static void main(String[] args)
    {
        // Object to call sum methods
        Ques_10 s=new Ques_10();
        System.out.println("Sum of int values = " + s.sum(10,20));
        System.out.println("Sum of double values = " + s.sum(10.5,20.5));
        System.out.println();
        // Object to call multiply methods
        Ques_10 m=new Ques_10();
        System.out.println("product of int values = " + m.Multiply(10,20));
        System.out.println("product of double values = " + m.Multiply(10.5f,20.5f));
        System.out.println();
        // Object to call concatenate methods
        Ques_10 c=new Ques_10();
        System.out.println("Concatenation of two String values = " + c.String_over("Hello ","World"));
        System.out.println("Concatenation of three String values = " + c.String_over("To","The","New"));
    }
    // Methods to sum numbers
    public int sum(int x,int y)
    {
        return x+y;
    }
    public double sum(double x,double y)
    {
        return x+y;
    }
    // Methods to Multiply numbers
    public int Multiply(int x,int y)
    {
        return x*y;
    }
    public float Multiply(float x,float y)
    {
        return x*y;
    }
    // Methods to concatenate two strings
    public String String_over(String x,String y)
    {
        return x+y;
    }
    public String String_over(String x,String y,String z)
    {
        return x+y+z;
    }
}
