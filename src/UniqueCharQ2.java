// Question 2

// Write a method that takes a string and returns the number of unique characters in the string.

import java.util.*;

public class UniqueCharQ2
{
    public static void main(String[] args)
    {
        System.out.print("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch= str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0; i<ch.length; i++)
        {
            if(!map.containsKey(ch[i]))
            {
                map.put(ch[i],0);
            }
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i], map.get(ch[i])+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println("Unique Values are : "+entry.getKey());
            }
        }
//        System.out.println("Unique Charaters in "+str+" are "+Uniquec(str));

    }
//    public static Set<Character> Uniquec(String s)
//    {
//        char[] ch= s.toCharArray();
//        Set<Character> set=new HashSet<>();
//        for (int i=0;i<ch.length;i++)
//        {
//            set.add(ch[i]);
//        }
//        return set;
//    }
}
