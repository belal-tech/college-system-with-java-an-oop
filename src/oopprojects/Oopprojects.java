package oopprojects;

import java.util.Scanner;
import java.util.ArrayList;

public class Oopprojects {

    public static void main(String[] args) {
        int id;
        int num;
        String name;
        int flagstu = 0;
        int flagcours = 0;
        int flaglec = 0;

        //add courses for college
        Scanner user = new Scanner(System.in);
        Colleg s = Colleg.returnsingleton();   //Create object by Single tone techniques(desgin pattern)\\
        System.out.println("eneter the id colleg");              //let's to start and bulid the colleg \\
        s.setid(user.nextInt());
        System.out.println("eneter the name colleg");
        s.setname(user.next());

        Student[] student = new Student[1000];                              //creat array of objects of each student
        Course[] cours = new Course[150];                //creat array of objects of each Course
        Lecturer[] lectures = new Lecturer[150];

        while (true) {
            System.out.println("1- add course in colleg");
            System.out.println("2- add studnets  in colleg");
            System.out.println("3-add lecturers in colleg ");
            System.out.println("4-add cours for student ");
            System.out.println("5-add cours for lecturers ");
            System.out.println("6-display all studnets info");
            System.out.println("7-display all courses info");
            System.out.println("8-display colleg info");
            System.out.println("9-display all lecturers info");
            System.out.println("10-courses taken by each student");
            System.out.println("11-courses taken by each leacturer");
            System.out.println("12- Exit");
            System.out.println("Hint: 13- if you want to delet object as lecutrer,sttudent and course send ");

            int choos = user.nextInt();
            int count = 0;
            if (choos == 1) {
                System.out.println("enter the number of course you want to add in colleg");                 //add courses in Colleg\\ 
                flagcours = 1;
                count = user.nextInt();
                for (int i = 0; i < count; i++) {

                    System.out.println("id of course");

                    id = user.nextInt();                       //info for each Course 
                    if (i != 0) {
                        for (int z = 0; z < i; z++) {
                            if (id == cours[z].getetidcourse()) {
                                System.out.println("No there is a conflict id input diffrent the id");                  ///verification of course id \\\
                                id = user.nextInt();
                            }
                        }
                    }
                    System.out.println("name of course");
                    name = user.next();
                    cours[i] = new Course(name, id);
                    s.Courses.add(cours[i]);                         //saved it in ArrayList in Claas colleg Nameed as "Courses"\\

                }
            } else if (choos == 7) {

                for (int i = 0; i < s.Courses.size(); i++) {
                    System.out.println("number " + i + " " + s.Courses.get(i).getetcouresname());              //show the data about courses 
                }
            } //add students  for college
            else if (choos == 2) {
                System.out.println("enter the number of students you want to add");       //register the studnents in colleg\\
                flagstu = 1;
                count = user.nextInt();
                for (int i = 0; i < count; i++) {
                    System.out.println("id");

                    id = user.nextInt();
                    if (i != 0) {
                        for (int z = 0; z < i; z++) {
                            if (id == student[z].getetstuid()) {
                                System.out.println("There is a conflict in id enter the id again ");        ///verification of student id \\\
                                id = user.nextInt();
                            }
                        }
                    }
                    System.out.println("name of student");
                    name = user.next();
                    student[i] = new Student(name, id);                                 //info for each Studnet
                    //save it in ArrayList in colleg class named students
                    s.students.add(student[i]);
                    System.out.println(s.students.get(i).getetstuname());

                }
            }
            if (choos == 3) {
                System.out.println("enter the number of Lecturers you want to add");
                count = user.nextInt();
                flaglec = 1;
                for (int i = 0; i < count; i++) {

                    System.out.println("ID of lecturer");
                    id = user.nextInt();                                      //add number of Lecturers  will add in colleg\\ 
                    System.out.println("name of lecturer");
                    name = user.next();
                    lectures[i] = new Lecturer(name, id);
                    s.lecurers.add(lectures[i]);
                    System.out.println("lecturer number  " + i + s.lecurers.get(i).getlectuname());
                }
                choos = 0;
            }

            if (choos == 6) {
                for (int i = 0; i < s.students.size(); i++) {
                    System.out.println("student name : " + s.students.get(i).getetstuname() + "the id " + s.students.get(i).getetstuid());
                }
            } else if (choos == 4 && flagstu == 1 && flagcours == 1) //if already there is student and courses do it\\ 
            {

                System.out.println("enter the number of studnet ");
                int numofstu = user.nextInt();
                System.out.println("enter the number of course ");
                int numofcourse = user.nextInt();
                student[numofstu].Course_each_student.add(cours[numofcourse]);

            } else if (choos == 4 && flagstu == 0 || flagcours == 0) //varification to make sure to can add course for students \\
            {
                System.out.println("there is no courses or student to add yet");
            } else if (choos == 5 && flagcours == 1 && flaglec == 1) {
                System.out.println("enter the number of lectruer  ");
                int numlec = user.nextInt();
                System.out.println("enter the number of course  ");
                int numofcourse = user.nextInt();
                lectures[numlec].Course_each_lecturer.add(cours[numofcourse]);

            } else if (choos == 5 && flagcours == 0 || flaglec == 0) {
                System.out.println("there is no courses or lecturers to add yet");
            } else if (choos == 8) {
                System.out.println("number of students :  " + s.students.size() + "number of courses is " + s.Courses.size() + "number of lecturers "
                        + s.lecurers.size() + " the name : " + s.getnamecolleg() + "id of colleg " + s.getidcolleg());
            } else if (choos == 9) {
                for (int i = 0; i < s.lecurers.size(); i++) {
                    System.out.println("course name: " + s.lecurers.get(i).getlectuname() + "course id" + s.lecurers.get(i).getidlecturer());
                }
            } else if (choos == 10) {
                System.out.println("enter the number of student");
                int numofstu = user.nextInt();              //ask for who student you want know about his courses\\ 
                for (int z = 0; z < student[numofstu].Course_each_student.size(); z++) {
                    System.out.println("name stu:" + student[numofstu].getetstuname() + " regiser  " + student[numofstu].Course_each_student.get(z).getetcouresname()
                            + "id stu:" + student[numofstu].getetstuid());
                }
            } else if (choos == 11) {
                System.out.println("enter the number of lecturer");
                int numlec = user.nextInt();                            //ask for who lecturer you want know about his courses\\
                for (int z = 0; z < lectures[numlec].Course_each_lecturer.size(); z++) {
                    System.out.println("name lect: teach" + lectures[numlec].getlectuname() + lectures[numlec].Course_each_lecturer.get(z).getetcouresname()
                            + "id lec:" + lectures[numlec].getidlecturer());
                }
            } else if (choos == 12) {
                break;                     //condtion to exit from System\\
            } else if (choos == 13) {
                System.out.println("'s' to remove students ");
                System.out.println("'l' to remove  lecturers "); // if you want delete student and classes or courses        
                System.out.println("'c' to remove  course ");
                if (user.next().charAt(0) == 's' && flagstu == 1) {   //check  to delete students and already there is students in colleg 
                    System.out.println("enter the number of student you want to delete");
                    s.students.remove(user.nextInt());
                } else if (user.next().charAt(0) == 'l' && flagcours == 1) {    //check  to delete leacturers and already there is leacturers in colleg 
                    System.out.println("enter the number of lecturer you want to delete");
                    s.lecurers.remove(user.nextInt());
                } else if (user.next().charAt(0) == 'c' && flaglec == 1) {       //check  to delete courses and already there is courses
                    System.out.println("enter the number of course  you want to delete");
                    s.Courses.remove(user.nextInt());
                } else {
                    System.out.println("its not from the choices try again ");

                }

            } else {
                System.out.println("its not from the choices try again ");
            }

        }
    }
}
