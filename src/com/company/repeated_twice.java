// Ques 6

//Q6. There is an array with every element repeated twice except one. Find that element
package com.company;

public class repeated_twice
{
    public static void main(String[] args)
        {
            int[] arr={2,4,4,8,8,2,2,6};
            int count=0,len=arr.length;
           // char[] str1=str.toCharArray();
            for(int i=0;i<len;i++)
            {   count=0;
                for(int j=0;j<len;j++)
                {
                    if((i>j) && (arr[i]==arr[j]))
                    {
                        break;
                    }
                    if((arr[i]==arr[j]))
                    {
                        count++;
                    }
                    if(j==len-1)
                    {
                        if((count<=1) || (count>2))
                        {
                            System.out.println("number of values repeated " + arr[i] + " is " + count);
                        }
                    }
                }

            }

        }

    }

