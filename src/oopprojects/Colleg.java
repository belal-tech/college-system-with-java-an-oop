package oopprojects;

import java.util.ArrayList;

/**
 * OOP Course project term 3 AAST:Arab academy Computin and Informathon belal
 * aboelkher mohamed abdo
 */
public class Colleg {

    private String name;
    private int idcolg;
    private static Colleg colgsinglton = null;

    public void setname(String name) {
        this.name = name;           //set the name 

    }

    public void setid(int idcolg) {  //set id 
        this.idcolg = idcolg;
    }

    public String getnamecolleg() {
        return this.name;   //getter for colleg name \\
    }

    public int getidcolleg() {
        return this.idcolg;  //getter for  colleg id\\
    }

    private Colleg() {

    }

    public static Colleg returnsingleton() {

        if (colgsinglton == null) {
            colgsinglton = new Colleg();           //make sure if there is another object make the first object point to him\\
        }

        return colgsinglton;            // return the contant object\\ 
    }

    ArrayList<Course> Courses = new ArrayList<Course>();             ////***ArrayList (linked list ) literaly contain All the data for colleg ***\\\
    ArrayList<Student> students = new ArrayList<Student>();           ////***ArrayList (linked list ) literaly contain All the data for colleg ***\\\
    ArrayList<Lecturer> lecurers = new ArrayList<Lecturer>();          ////***ArrayList (linked list ) literaly contain All the data for colleg ***\\\

    public void addcourse(Course cor) {
        Courses.add(cor);
    }

    public void addstudnet(Student stu) {                                                                        ///encapsulation for tha course data\\\ 

        students.add(stu);
    }

    static String tosting(Colleg c, int i) {

        return "course name: " + c.Courses.get(i).getetcouresname() + " student name: " + c.students.get(i).getetstuname() + " studnet id: " + c.students.get(i).getetstuname();    //to string function to return data and show it *\\

    }
}
