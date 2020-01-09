package oopprojects;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class Student {

    private int studnet_id;
    private String studnet_name;
    ArrayList<Course> Course_each_student = new ArrayList<Course>(7);   ///ArrayList to contain the courses for each student \\\\

    Student(String studnet_name, int studnet_id) {
        this.studnet_name = studnet_name;
        this.studnet_id = studnet_id;
    }

    public String getetstuname() {
        return this.studnet_name;
    }

    public int getetstuid() {
        return this.studnet_id;
    }

    public void setstuname(String studnet_name) {                                                                                               ///encapsulation for tha course data\\\ 
        this.studnet_name = studnet_name;
    }

    public void setstuid(int studnet_id) {
        this.studnet_id = studnet_id;
    }

    static String tosting(Student c) {

        return "name : " + c.studnet_name + " id is :" + c.studnet_id;                                         //to string function to return data and show it *********\\\\
    }
}
