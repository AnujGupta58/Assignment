// Question 1

//Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

import java.util.ArrayList;
import java.util.List;

interface issue
{
    void issue_Books();
    void issued_Books();
}
interface return_
{
    void return_Books();
    void returned_Books();
    void fine_on_return();
}
class Login
{
   private int id;
   private String password;

    public Login(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}

class libraryDept implements issue,return_
{
    @Override
    public void issue_Books() {

    }

    @Override
    public void issued_Books() {

    }

    @Override
    public void return_Books() {

    }

    @Override
    public void returned_Books() {

    }

    @Override
    public void fine_on_return() {

    }

    void displayAllbooks()
    {

        List<String> Books=new ArrayList<String>();
        for(String b:Books)
        {
            System.out.println(b);
        }
    }
}

// Main method to call the above function.
public class LibraryQ1 extends libraryDept
{
    public static void main(String[] args)
    {
        Login L=new Login(111,"****"){
        };
        libraryDept l=new libraryDept();
        l.issue_Books();
        l.displayAllbooks();
    }


}