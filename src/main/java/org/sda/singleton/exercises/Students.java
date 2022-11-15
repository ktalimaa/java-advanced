package org.sda.singleton.exercises;

import org.sda.singleton.Counter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a singleton called Students. This singleton will store
 * a list of students as Strings. Implement the following functionality:
 * When adding a student to the list:
 * - we should have a method to add a student to the list, and this method
 * returns a boolean (If the addition is successful, it returns true, else it returns false).
 * - in order to successfully add a student the student name must be prefixed either 'senior' or 'junior'. (e.g. senior James Dashboard)
 * - adding a duplicate name is not allowed.
 * - add a method to retrieve all the students with a prefix of 'senior'.
 * - add a method to retrieve all students with a prefix of 'junior'.
 *
 * @author Kristel Talimaa
 */

// create a singleton, class with one instance. there should be field with list with students. storage is boolean.
// if adding stud into the list, it should return boolean. whenever adding

public class Students {

    // lazy singleton
    private static Students instance;
    private final List<String> STUDENTS_LIST;

    // initializing inside the constructor
    private Students() {
        STUDENTS_LIST = new ArrayList<>();
    }

    // creating add method
    // if the students name ise prefixed with either senior or junior we add
    // them to the list, as long as they have not been added already.
    public boolean addStudent(String studentName) {
        if ((studentName.startsWith("senior") || studentName.startsWith("junior")) && !STUDENTS_LIST.contains(studentName)) {
            return STUDENTS_LIST.add(studentName);
        }
        return false;
    }

    public List<String> getSeniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("senior"))
                .collect(Collectors.toList());
    }

    public List<String> getJuniors() {
        return STUDENTS_LIST.stream()
                .filter(student -> student.startsWith("junior"))
                .collect(Collectors.toList());
    }

    public Students getInstance() {
        if (instance == null) {
            instance = new Students();
        }
        return instance;
    }


   /*

    private static final Students INSTANCE = new Students();
    private int count = 0;

    public void increment() {       // every calling of the increment method adds +1
        count++;
    }

    public int getCount() {
        return count;
    }

    public static Students getInstance() {
        return INSTANCE;
    }



    */



}



    /*

     private static Students instance;
    private static boolean isAdded = false;
    public static List<String> studentList;
    private static String prefix;

    private Students() {
    }

        public static boolean getStudentToList(String prefix){
            if( prefix.equals("junior") || prefix.equals("senior")){
                isAdded = true;
            } else {
                isAdded = false;
            }   return isAdded;
        }
        public boolean studentIsAddedToTheList(){
            return isAdded;
        }

        public static Students getInstance() {

            if (instance == null) {
                synchronized (Students.class){
                    if(instance == null) {
                        instance = new Students();
                    }
                }
            }
            return instance;
        }

        public static List<String> getSeniors(){
            if (prefix.equals("senior")) {
                System.out.println(studentList);
            }
            return studentList.stream().toList();
        }
        public static List<String> getJuniors(){
            if (prefix.equals("junior")) {
                System.out.println(studentList);
            }
            return studentList.stream().toList();
        }



     */