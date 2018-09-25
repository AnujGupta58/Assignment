// Ques 4

//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters,
//    Digits And Other Special Characters In A String
package com.company;

public class Ques4
{
    public static void main(String[] args)
    {
        int uppercase=0,lowercase=0,digit=0,special=0;
        String str="Divide_ten_BY_two_10/2=5";
        int len=str.length();
        System.out.println("length of the string : "+ len);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>= 65 && ch<= 90)
            {
               uppercase++;
            }
            else if(ch>= 97 && ch<= 122)
            {
               lowercase++;
            }
            else if (ch>='0' && ch<= '9')
            {
               digit++;
            }
            else
            {
               special++;
            }

        }
        double percentage_uppercase= (uppercase*100.0)/len;
        double percentage_lowercase=(lowercase*100.0)/len;
        double percentage_digits= (digit*100.0)/len;
        double percentage_special= (special*100.0)/len;
        System.out.println("Number of uppercase letters are : "+uppercase+ " and percentage of uppercase is : "+ percentage_uppercase+"%");
        System.out.println("Number of lowercase letters are : "+lowercase+ " and percentage of lowercase is : "+ percentage_lowercase+"%");
        System.out.println("Number of digits are : "+digit+" and percentage of digits is : "+ percentage_digits+"%");
        System.out.println("Number of special characters are : "+special+" and percentage of special character is : "+ percentage_special+"%");

    }
}
