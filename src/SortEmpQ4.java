// Question 4

// Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name;}


import java.util.*;

class Employee
{
    String Name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return Name + " -> " + age + " -> " + salary;
    }
}

class MyComparatorEmp implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Employee I1=(Employee)obj1;
        double E1=I1.salary;
        Employee I2=(Employee)obj2;
        double E2=I2.salary;

        if(E1<E2)
            return -1;
        else if(E1>E2)
            return +1;
        else
            return 0;
    }
}
public class SortEmpQ4
{
    public static void main(String[] args)
    {
        Employee Emp1=new Employee("Amit",21,1500000.50);
        Employee Emp2=new Employee("Ankit",27,17000.25);
        Employee Emp3=new Employee("Vaibhav",22,23000.25);
        Employee Emp4=new Employee("AAd",24,34400.50);
        Employee Emp5=new Employee("Alok",26,75000);
        TreeSet set=new TreeSet(new MyComparatorEmp());
        set.add(Emp1);
        set.add(Emp2);
        set.add(Emp3);
        set.add(Emp4);
        set.add(Emp5);
        System.out.println(set);
    }
}
