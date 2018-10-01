// Extra Example

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Athlete implements Comparable<Athlete>
{
    String name;

    public Athlete(String name, String sport, String country, int world_rank) {
        this.name = name;
        this.sport = sport;
        this.country = country;
        this.world_rank = world_rank;
    }

    String sport;
    String country;
    int world_rank;


   // List<String> medals=new ArrayList<String>();

    @Override
    public String toString() {
        return name+"___"+world_rank;
    }

    public int compareTo(Athlete a)
    {
        int rank=this.world_rank;
        Athlete w_Rank=(Athlete)a;
        int rank1=w_Rank.world_rank;
        if(rank<rank1)
            return -1;
        else if(rank>rank1)
            return +1;
        else
            return 0;
    }

}
public class Main {

    public static void main(String[] args)
    {
        List athlete=new ArrayList();
	    Athlete A1=new Athlete("Ankit","TT","India",1);
        Athlete A2=new Athlete("Aniket","TT","India",2);
        Athlete A3=new Athlete("Anik","TT","India",3);
        athlete.add(A1);
        athlete.add(A2);
        athlete.add(A3);
        System.out.println(athlete);
        Collections.sort(athlete);


    }
}
