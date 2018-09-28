// Question 4

//WAP to create singleton class

public class Test
{
    private static Test t = new Test();

    private Test()
    {
    }
    public static Test getTest()
    {
        if(t==null){
            return new Test();
        }else{
            return t;
        }
    }
}
class Singleton
{
    public static void main(String[] args)
    {
        Test t1=Test.getTest();
        Test t2=Test.getTest();
        Test t3=Test.getTest();
        if(t1==t2){
            System.out.println("Objects are equals");
        }
    }
}