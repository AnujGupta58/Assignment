// Question 3

// Implement Abstract Factory Pattern to create cars of different categories from different countries.

package com.company;

enum CarType
{
    Mini, Micro, Luxury;
}

enum Location
{
    India, USA, Europe;
}


abstract class Car
{
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }
    abstract void construct();

    @Override
    public String toString() {
        return " Car {Cartype= " + carType + " Location = " + location + "}";
    }
}


class MiniCar extends Car
{

    public MiniCar(Location location) {
        super(CarType.Mini, location);
    }

    @Override
    void construct()
    {
        System.out.println("Assembling Mini car");
    }
}


class MicroCar extends Car
{

    public MicroCar(Location location) {
        super(CarType.Micro, location);
    }

    @Override
    void construct()
    {
        System.out.println("Assembling Micro car");
    }
}


class LuxuryCar extends Car
{

    public LuxuryCar(Location location) {
        super(CarType.Luxury, location);
    }

    @Override
    void construct()
    {
        System.out.println("Assembling Luxury car");
    }
}


class IndiaCarFactory
{
    static Car BuildCar(CarType carType)
    {
        Car car=null;
        switch (carType)
        {
            case Mini:
               car=new MiniCar(Location.India);
               break;
            case Micro:
               car=new MicroCar(Location.India);
               break;
            case Luxury:
               car=new LuxuryCar(Location.India);
               break;
        }
        return car;
    }
}


class USACarFactory
{
    static Car BuildCar(CarType carType)
    {
        Car car = null;
        switch (carType)
        {
            case Mini:
                car=new MiniCar(Location.USA);
                break;
            case Micro:
                car=new MicroCar(Location.USA);
                break;
            case Luxury:
                car=new LuxuryCar(Location.USA);
                break;
        }
        return car;
    }
}


class EuropeCarFactory
{
    static Car BuildCar(CarType carType)
    {
        Car car=null;
        switch (carType)
        {
            case Mini:
                car =new MiniCar(Location.Europe);
                break;
            case Micro:
                car=new MicroCar(Location.Europe);
                break;
            case Luxury:
                car=new LuxuryCar(Location.Europe);
                break;
        }
        return car;
    }
}


class CarFactory
{
    // car=null;
    static Car BuildCar(CarType carType,Location location)
    {
        Car car=null;
        switch(location)
        {
            case India:
                car=IndiaCarFactory.BuildCar(carType);
                break;
            case USA:
                car=USACarFactory.BuildCar(carType);
                break;
            case Europe:
                car=EuropeCarFactory.BuildCar(carType);
                break;
        }
        return car;
    }
}


public class AbstractFactoryQ3
{
    public static void main(String[] args)
    {
        System.out.println(CarFactory.BuildCar(CarType.Mini,Location.India));
        System.out.println(CarFactory.BuildCar(CarType.Micro,Location.Europe));
    }
}
