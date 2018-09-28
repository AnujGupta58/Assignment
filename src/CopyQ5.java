// Question 5(b)

//WAP to show object cloning in java using copy constructor

public class CopyQ5
{
    int x,y;

    public CopyQ5(int x, int y) {
        this.x = x;
        this.y = y;
    }
    CopyQ5(CopyQ5 C)
    {
        x=C.x;
        y=C.y;
    }

}
class Copy
{
    public static void main(String[] args)
    {
        CopyQ5 c=new CopyQ5(10,15);
        CopyQ5 c1=new CopyQ5(c);
        System.out.println("Copied values from constructor= "+c1.x+" and "+ c1.y);
    }
}