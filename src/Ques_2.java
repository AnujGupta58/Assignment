// Question 2

//WAP to sorting string without using string Methods?.

public class Ques_2
{
    public static void main(String[] args)
    {   char temp;
        String str="zyxvutsrqponmlkjihgfedcba";
        char str1[]=str.toCharArray();
        for(int j=0;j<str1.length;j++)
        {
            for (int i = 0; i < str1.length - 1; i++)
            {
                if (str1[i] > str1[i + 1])

                {
                    temp = str1[i];
                    str1[i] = str1[i + 1];
                    str1[i + 1] = temp;
                }
            }
        }

        System.out.println(str1);
    }
}
