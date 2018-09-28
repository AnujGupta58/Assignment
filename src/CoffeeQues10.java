//Question 10

// Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
//
//* Customer
//  - Pays the cash to the cashier and places his order, get a token number back
//  - Waits for the intimation that order for his token is ready
//  - Upon intimation/notification he collects the coffee and enjoys his drink
//  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
//
//* Cashier
//  - Takes an order and payment from the customer
//  - Upon payment, creates an order and places it into the order queue
//  - Intimates the customer that he has to wait for his token and gives him his token
//  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
//
//* Barista
// - Gets the next order from the queue
// - Prepares the coffee
// - Places the coffee in the completed order queue
// - Places a notification that order for token is ready


import java.util.LinkedList;
import java.util.Queue;

class Customer extends CoffeeQues10
{
    int token;
    String food_item;
    int food_price;
    public void order(String item,int price)
    {
        food_item=item;
        food_price=price;
    }

    public int Orderplace() {
        return token;
    }
}
class Cashier extends Customer
{
    int waitTime;
    public int confirmOrder()
    {
        return waitTime ;
    }
    public String orderQueue()
    {
        return food_item;
    }
}
class Barista extends Customer
{
    int orderid;
    Queue q=new LinkedList();
    void nextCust()
    {
        q.peek();
    }
    public void prepare()
    {
        boolean orderReady=true;
        System.out.println("preparing coffee");
        if(orderReady==true)
        {
            System.out.println(token+"Specified token is ready");
        }
        else
        {
            System.out.println("Preparing your item");
        }
    }

}
public class CoffeeQues10
{
    public static void main(String[] args) {
        CoffeeQues10 c=new Customer();
        ((Customer) c).Orderplace();
        CoffeeQues10 d=new Cashier();
        ((Cashier) d).confirmOrder();
        ((Cashier) d).orderQueue();
        CoffeeQues10 p=new Barista();
        ((Barista) p).prepare();
        System.out.println("Enjoy your coffee");
    }
}
