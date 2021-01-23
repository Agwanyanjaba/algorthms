/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wycliffe.codility.simpleapps;

/**
 *
 * @author WOCHIENG1
 */
public class StudentDemo {

    private class InnerClass {

        int age = 90;
        String height = "5'11'";

    }

    public void displayMsg() {
        InnerClass inn = new InnerClass();
        System.out.println("Details:" + inn.height + inn.age);
    }

    private static class Exams {

        int marks = 90;
        String grade = "A";

        private void displayExams() {
            System.out.println("Exams Score is: " + marks + "and grade is:" + grade);
        }
    }

    private static class StudentDetails {

        String firsName = "John";
        String lastName = "Doe";

        private void displayStudentDetails() {
            System.out.println("Student Name is: " + firsName + "" + lastName);
        }
    }

    private static class CourseDetails {

        String courseName = "Java Programming";
        String courseCode = "ICS 2205";

        void displayCourseDetails() {
            System.out.println("Course Name is: " + courseCode + "" + courseName);
        }
    }

    public static void main(String... vargs) {
        StudentDemo demo = new StudentDemo();
        demo.displayMsg();

        StudentDetails student = new StudentDetails();
        student.displayStudentDetails();

        Exams exam = new Exams();
        exam.displayExams();

        CourseDetails course = new CourseDetails();
        course.displayCourseDetails();

    }

}
