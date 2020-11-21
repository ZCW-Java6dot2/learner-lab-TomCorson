package io.zipcoder.interfaces;

import java.util.ArrayList;

public class TechConnect {
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    private static String [] names = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
            "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
            "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
            "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
            "Cristine",  "Brendan" };

    static { // static initializer
        String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                "Cristine",  "Brendan" };
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            studentList.add(student);
        }
    }

    public static void recruitStudent(Student s){
        studentList.add(s);
    }
    public static ArrayList<Student> getStudents(){
        return studentList;
    }
    public static void removeStudents(){
        studentList.clear();
    }
}
