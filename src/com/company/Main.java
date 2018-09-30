// Extra Example Practise

package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
	    List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
	    Collections.sort(integerList,( I1, I2)-> (I2-I1) );
        System.out.println(integerList);
        List<Integer> integerList1= Arrays.asList(1,2,3,4,5,6);
        Collections.sort(integerList1,( I1, I2)-> -(I2-I1) );
        System.out.println(integerList1);
        List<String> StringList = Arrays.asList("Ankit","Harry","Ayub","Gaurav","Abhi");
        StringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(StringList);
    }
}
