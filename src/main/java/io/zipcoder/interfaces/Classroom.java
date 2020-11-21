package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class Classroom {


    public static HashMap<String, Person> getRoster(ArrayList<Person> list){

        HashMap<String,Person> roster = new HashMap<String, Person>();

        for(Person p: list){
            roster.put(p.getName(),p);
        }
        return roster;
    }
}
