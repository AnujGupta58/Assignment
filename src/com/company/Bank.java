// QUESTION 11

//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which
// provide there specific details like rateofinterest etc,print details of every banks

package com.company;

abstract public class Bank
{
    String name;
    int rate;

    public Bank(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public static void main(String[] args)
    {
        Bank Sb=new SBI();
        Sb.getDetails();
        Bank bo=new BOI();
        bo.getDetails();
        Bank ic=new ICICI();
        ic.getDetails();
    }
    public void getDetails()
    {
        System.out.println("Name of Bank =" + this.name);
        System.out.println("Rate of Bank =" + this.rate+"%");
    }
}
class SBI extends Bank
{
    SBI() {
        super("SBI", 6);
    }
}
class BOI extends Bank
{
    BOI() {
        super("BOI", 8);
    }

}
class ICICI extends Bank
{
    ICICI() {
        super("ICICI", 10);
    }

}

