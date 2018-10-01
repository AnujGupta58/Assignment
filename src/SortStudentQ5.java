// Question 5

// Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age;

import java.util.*;

class Student
{
    String Name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.Name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return Name + " " + age + " " + score;
    }
}

class MyComaparatorStudent implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Student S1=(Student)obj1;
        double I1=S1.score;
        Student S2=(Student)obj2;
        double I2=S2.score;
        Student A1=(Student)obj1;
        String B1=A1.Name;
        Student A2=(Student)obj2;
        String B2=A2.Name;

        if(I1<I2)
            return -1;
        else if(I1>I2)
            return +1;
        else
            return B1.compareTo(B2);
    }
}

public class SortStudentQ5
{
    public static void main(String[] args)
    {
        Student student=new Student("Amit",2,75.55);
        Student student1=new Student("Saurabh",27,93.25);
        Student student2=new Student("Vaibhav",22,88.25);
        Student student3=new Student("Adesh",24,69.50);
        Student student4=new Student("Alok",26,93.25);
        Student student5=new Student("Harsh",26,93.25);
        Student student6=new Student("Prakash",26,93.25);
        TreeSet set=new TreeSet(new MyComaparatorStudent());
        set.add(student);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);
        System.out.println(set);
    }
}
