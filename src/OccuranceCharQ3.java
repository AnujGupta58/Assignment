// Question 3

// Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.*;
public class OccuranceCharQ3
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch= str.toCharArray();
        Map<Character,Integer> m = new HashMap<>();
        for (int i=0; i<ch.length; i++)
        {
            if(!m.containsKey(ch[i]))
                {
                    m.put(ch[i],0);
                }
            if(m.containsKey(ch[i]))
                {
                        m.put(ch[i], m.get(ch[i])+1);
                }
        }
        for(Map.Entry<Character,Integer> entry: m.entrySet())
        {
            if(entry.getValue()>1)
               {
                  System.out.println(entry.getKey()+" and "+ entry.getValue());
               }
        }
    }
}