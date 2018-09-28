// // Question 8(a)

//WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
      //  a)while statement

// QUESTION BY WHILE LOOP
import java.lang.String;
import java.util.Scanner;
public class Ques_8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your word");
        String word=sc.next();
        int n=word.length()-1;
        char a=word.charAt(0);
        char z=word.charAt(n);
        while(!(word.equals("done")))
        {
            if(a==z)
            {
                System.out.println("First and last word of "+word+" are equal");

            }
            else
            {
                System.out.println("First and last word of "+word+" are not equal");

            }
            word=sc.next();
            System.out.println("Entered word was done so program terminated");
        }
    }
}
