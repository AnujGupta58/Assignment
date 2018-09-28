// Question 3(a)

//WAP to produce ClassNotFoundException exception.

public class Ques_3
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("java.javafx");
        }
        catch (ClassNotFoundException c)
        {
            c.printStackTrace();
        }
        say s=new say();
        s.hello();
    }
}
class say
{
    void hello()
    {
        System.out.println("hi");
    }
}