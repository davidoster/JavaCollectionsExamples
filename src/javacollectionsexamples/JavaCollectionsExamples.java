/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javacollectionsexamples.abstracts.Human;
import models.Employee;
import models.Student;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mac
 */
public class JavaCollectionsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        ArrayList<Human> employees = new ArrayList<>();
        List<Human> emps2 = new ArrayList<>();
        Set<Human> setEmps = new HashSet<>();
        Set<Human> setTreeEmps = new TreeSet<>();
        Map<Human,Student> xxx = new HashMap<>();
        
        // Map<Student, Assignment> studentAssignments
        // Map<CodingSchool, Trainer> trainers
        // Map<Student, Course>
        // Map<Course, List<Student>> courseStudents
        
        Map<Object, List<Student>> xyz = new HashMap();
        
//        class Tmhma {
//            List<Trainer>
//            List<Student>
//            Course
//            List<Assignment>
//        }
//            
//        class CodingSchool {
//            List<Tmhma> tmhmata;
//        }
                    
        
        xxx.put(new Student(), new Student());
        xxx.put(new Student(), new Student());
        xxx.put(new Student(), new Student());
        xxx.put(new Student(), new Student());
        
        for (Student s : xxx.values()) {
            System.out.println(s);
        }
   
//        Employee emp = new Employee();
//        Human emp1 = new Employee(); // polymorphism
//        System.out.println(emp1);
//
//        emps.add(emp); // WRONG emps.add(emp1);
//        employees.add(emp1); // 
//        //CORRECT 
//        employees.add(emp); 
//        // WHY?????
//        emp1.talks("sdfsdf");
//        
//        setEmps.add(emp1);
//        setEmps.add(new Student());
//        System.out.println(setEmps.size());
        
//        setTreeEmps.add(emp1);
//        setTreeEmps.add(emp);
//        setTreeEmps.add(new Student());
//        for (Human setTreeEmp : setTreeEmps) {
//            System.out.println(setTreeEmp);
//        }
        
//        System.out.println(setEmps);
//        System.out.println(setEmps.hashCode());
//        for (Human h : setEmps) {
//            System.out.println(h.hashCode());
//        }

        
    }
    
}
