/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo18;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Student {
    String name;
    String studentID;
    Date birthday;
    String adress;
    String major;
    Professor advisor;
    double gpa;
    
    public static void main(String[] args) {
        Student x = new Student();
        Student y =x;
        Student z = new Student();
    }
    
}
