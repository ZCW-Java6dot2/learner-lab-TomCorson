package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ClassroomTest {
    @Test
    public void testRoster(){
        ArrayList<Person> students = new ArrayList<>();
        students.addAll(TechConnect.getStudents());

         HashMap<String,Person> stuHash = Classroom.getRoster(students);
         String [] names = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                 "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                 "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                 "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                 "Cristine",  "Brendan" };
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(names));
        String [] keys = stuHash.keySet().toArray(new String[expected.size()]);
        ArrayList<String> actual = new ArrayList<>(Arrays.asList(keys));
        assertEquals(expected.containsAll(actual), actual.containsAll(expected));
    }
    @Test
    public void testRoster2(){
        ArrayList<Person> instructors = new ArrayList<>();
        instructors.addAll(ZipCodeWilmington.getInstructors());
        HashMap<String, Person> expected = new HashMap<>();
        for(Person p: instructors){
            expected.put(p.getName(),p);
        }
        HashMap<String, Person> actual = Classroom.getRoster(instructors);
        assertEquals(expected,actual);

    }

}