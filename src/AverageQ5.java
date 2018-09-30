// Question 5

// Find average of the number inside integer list after doubling it.

import java.util.Arrays;
import java.util.List;

public class AverageQ5
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Entered list is "+list);
        System.out.println("The average of doubled list is : "+list.stream().mapToInt(e->e*e).average());

    }
}
