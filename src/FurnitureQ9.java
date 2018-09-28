// Question 9

//Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
// There are stress and fire tests for each products

public class FurnitureQ9
{
    public static void main(String[] args)
    {
        FurnitureQ9 C=new Chair();
        ((Chair) C).fire_M();
        ((Chair) C).fire_W();
        ((Chair) C).stress_M();
        ((Chair) C).stress_W();
        FurnitureQ9 T=new Table();
        ((Table) T).fire_M();
        ((Table) T).fire_W();
        ((Table) T).stress_M();
        ((Table) T).stress_W();

    }
}
interface wooden
{
    void fire_W();
    void stress_W();
}
interface metal
{
    void fire_M();
    void stress_M();
}
class Chair extends FurnitureQ9 implements wooden,metal
{
    @Override
    public void fire_W() {
        System.out.println("WARNING! WODDEN chair catches fire ");
    }

    @Override
    public void stress_W() {
        System.out.println("WARNING! WODDEN chair cannot handle stress ");
    }

    @Override
    public void fire_M() {
        System.out.println("Metal chair does not catch fire easily");
    }

    @Override
    public void stress_M() {
        System.out.println("Metal chair handle pressure");
    }
}
class Table extends FurnitureQ9 implements wooden,metal
{
    @Override
    public void fire_W() {
        System.out.println("WARNING! WODDEN table catches fire ");
    }

    @Override
    public void stress_W() {
        System.out.println("WARNING! WODDEN table can handle stress upto certain limit. ");
    }

    @Override
    public void fire_M() {
        System.out.println("Metal table does not catch fire easily");
    }

    @Override
    public void stress_M() {
        System.out.println("Metal table can handle pressure");
    }
}