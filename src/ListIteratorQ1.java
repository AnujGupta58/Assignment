// Question 1

// Write Java code to define List.
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.


import java.util.*;
public class ListIteratorQ1
{
    public static void main(String[] args)
    {
        float sum=0;
        List<Float> list = new ArrayList<>();
        list.add(4.5f);
        list.add(5.5f);
        list.add(2.5f);
        list.add(6.5f);
        list.add(8.5f);
        System.out.println("Inserted elements in list : " +list);
        for(Float i:list)
        {
            sum=sum+i;
        }
        System.out.println("Sum of elements of List without iterator = "+sum);
        System.out.println("Now using Iterator");
        sum=0;
        ListIterator itr=list.listIterator();
        while(itr.hasNext())
        {
            Float f =(Float)itr.next();
            sum=sum+f;
        }
        System.out.println("Sum of elements of List with iterator = "+sum);
    }
}
