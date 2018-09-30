// Question 7

//Perform Serialization and Deserialization of an Object.


import java.io.*;

class Object implements Serializable
{
    int i=10; int j=20;
}
public class SerialDeserialQ7
{
    public static void main(String[] args) throws Exception
    {
        // Serializing Object
        Object d1=new Object();
        FileOutputStream fos= new FileOutputStream("/tmp/user/abc/pqr.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);

        // Deserializing Object
        FileInputStream fis= new FileInputStream("/tmp/user/abc/pqr.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object d2=(Object)ois.readObject();
        System.out.println(d2.i+"  __  "+ d2.j);
    }
}
