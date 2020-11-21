package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();
    }
    @Test
    public void fireStaffTest(){
        Boolean expected = true;
        ArrayList<Instructor> staff = ZipCodeWilmington.getInstructors();
        Boolean actual = staff.isEmpty();
        assertEquals(expected,actual);
    }
    @Test
    public void hireStaff(){
            Instructor instructor = new Instructor("Sally");
                ZipCodeWilmington.hire(instructor);
            ArrayList<Instructor> expected = new ArrayList<Instructor>();
            expected.add(instructor);
            ArrayList<Instructor> actual = ZipCodeWilmington.getInstructors();
            assertEquals(expected,actual);

    }

}