package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Class name:Main
 * Author: aaaaa
 * Date: hdiw
 * Description: Collection test
 *
 */

public class Main {
    /*
     main method
     */
    public static void main(String[] args) {
        // Creating Arraylist with student object
        ArrayList<Student> alStudent = new ArrayList<>();
        alStudent.add(new Student( "Mg Mg", "Male", 20));
        alStudent.add(new Student("Su Su", "Female", 19));
        alStudent.add(new Student("Tun Tun", "Male", 19));


        alStudent.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getAge));

        alStudent.set(1, new Student("Aung Aung", "Female", 19));

        Student s = alStudent.get(0);
        s.setName("Aung Aung");
        alStudent.set(0, s);

        alStudent.remove(0);

        LinkedList<Student> listudnet = new LinkedList<>();


        for(Student st: alStudent){
            System.out.println(st.getName());
        }


    }
}