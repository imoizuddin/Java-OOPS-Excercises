package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName, lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tutionBalance=0;
    private static int costOfCourse=600;
    private static int id=1000;

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        this.firstName=scanner.nextLine();
        System.out.println("Enter last name");
        this.lastName=scanner.nextLine();
        System.out.println("Enter student class level");
        System.out.println("1- First Year\n 2- Second Year\n 3- Final Year");
        this.gradeYear=scanner.nextInt();

        setStudentID();

//        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);

    }

    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tutionBalance += costOfCourse;
            } else {
                break;
            }
        }while (1!=0);
//        System.out.println("Enrolled in: "+courses);
//        System.out.println("Tuition Balance: "+tutionBalance);
    }

    public void viewBalance(){
        System.out.println("Your Balance is :$"+tutionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.print("Enter Your Payement:$");
        Scanner scanner = new Scanner(System.in);
        int payment=scanner.nextInt();
        tutionBalance-=payment;
        System.out.println("Thank you for your payement of $"+payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name: "+firstName+" "+lastName+
                "Year: "+ gradeYear+
                "\nStudent ID: "+studentID+
                "\nCourses: "+courses+
                "\nBalance: $"+tutionBalance;
    }

}
