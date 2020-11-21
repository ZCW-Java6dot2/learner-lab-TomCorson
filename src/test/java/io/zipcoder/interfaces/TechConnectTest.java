package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TechConnectTest {

    @Before
    public void setUp(){
        TechConnect.removeStudents();
    }
     @Test
    public void testRemoveStudents(){
        boolean expected = true;
        boolean actual = TechConnect.getStudents().isEmpty();
        assertEquals(expected,actual);
     }

     @Test
    public void testRecruitStudents(){
        Student stew = new Student("Stew");
        TechConnect.recruitStudent(stew);
        boolean expected = true;
        boolean actual = TechConnect.getStudents().contains(stew);
        assertEquals(expected,actual);
     }


}