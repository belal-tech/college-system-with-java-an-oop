/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojects;

/**
 *
 * @author DELL
 */
////////////////////class course contain the  course info\\\\\\\\\\\\\\\\\\\
public class Course {

    private int course_id;
    private String course_name;
    int numberofregeststudent;

    Course(String course_name, int course_id) {
        this.course_id = course_id;
        this.course_name = course_name;

    }

    public String getetcouresname() {
        return this.course_name;
    }

    public int getetidcourse() ///encapsulation for tha course data\\\ 
    {
        return this.course_id;
    }

    static String tosting(Course c) {
        return "name: " + c.course_name + " id: " + c.course_id;                   //to string function to return data *******\\
    }

    @Override
    public String toString() {
        return "name: " + course_name + " id: " + course_id;                   //to string function to return data *******\\
    }
}
