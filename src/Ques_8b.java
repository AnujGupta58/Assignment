// Question 8(b)

//WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
  //       b)do-while statement

import java.util.Scanner;

public class Ques_8b
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your word :");
        String word=sc.next();
        int n=word.length()-1;
        char a=word.charAt(0);
        char z=word.charAt(n);
        do {
                if(a==z)
                {
                    System.out.println("First and last word of "+word+" are equal");

                }
                else
                {
                    System.out.println("First and last word of "+word+" are not equal");

                }
            word=sc.next();
        }
        while(!word.equals("done"));
        {
            System.out.println("Entered word was done so program terminated");
        }
    }
}
