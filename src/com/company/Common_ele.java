// QUESTION 5

//Q5. Find common elements between two arrays.

package com.company;

public class Common_ele
{
    public static void main(String[] args)
    {
        int[] arr1={4,5,76,11,2,22,95};
        int[] arr2={14,5,79,11,24,52,92};
        System.out.println("Common ELements are : ");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
