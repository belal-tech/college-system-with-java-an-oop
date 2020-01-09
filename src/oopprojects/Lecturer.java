/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojects;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Lecturer {

    private String name;
    private int id;
    ArrayList<Course> Course_each_lecturer = new ArrayList<Course>(7);

    Lecturer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getlectuname() {
        return this.name;
    }

    public void setlecname(String name) {
        this.name = name;
    }

    public void setlecturerid(int id) {
        this.id = id;
    }

    public int getidlecturer() {
        return this.id;
    }

    static String tosting(Lecturer lec) {
        return "the name is " + lec.name + "the id is " + lec.id;
    }
}
