// QUES 9

//Q9.Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)

package com.company;

public class enum_Ques9
{
    enum house{
        Bunglow(100000), Flat(250000),Villa(500000),Small_home(10000);
        private int price;

        house(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }

    }
    public static void main(String[] args)
    {
        for (house h:house.values())
        {
            System.out.println("House "+ h + " and price is Rs." +h.getPrice());
        }
    }

}
