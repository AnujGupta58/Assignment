//  Question 1

// Write the following a functional interface and implement it using lambda:
//
//  (a) First number is greater than second number or not
//            Parameter (int ,int ) Return boolean
//
//  (b)    Increment the number by 1 and return incremented value
//            Parameter (int) Return int
//
//  (c)     Concatination of 2 string
//          Parameter (String , String ) Return (String)
//
//   (d)    Convert a string to uppercase and return
//        Parameter (String) Return (String)

import java.lang.*;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface operation1
{
    boolean greater(int a, int b);
}
interface operation2
{
    int increment(int x);
}
interface operation3
{
    String concatenate(String a, String b);
}
interface operation4
{
    String uppercase(String x);
}

public class FunctionalInterfaceQ1
{
    public static void main(String[] args)
    {
        operation1 o= ( a,  b) -> a>b ;
        System.out.println("Greatest among the number : " + o.greater(10,20));
        operation2 i= (x) -> ++x;
        System.out.println("Incremented number : " + i.increment(1));
        operation3 s= (a,b) -> a+b;
        System.out.println("Concatenated String : " + s.concatenate("Hello ","World"));
        operation4 u= (x) -> x.toUpperCase();
        System.out.println("Converted to uppercase : "+ u.uppercase("hello"));
    }
}


// Functional Interface contains only one abstract method or known as SAM(Single Abstract Method)
// Few predefined functional Interfaces

//Consumer-- It accepts only one argument and  is void type
//BiConsumer-- It accepts two argument and  is void type
//Predicate-- It returns true or false value
//Functions-- it takes one argument and returns the value.
