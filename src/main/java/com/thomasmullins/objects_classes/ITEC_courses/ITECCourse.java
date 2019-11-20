package com.thomasmullins.objects_classes.ITEC_courses;

import java.util.ArrayList;
import java.util.List;

//class definition
public class ITECCourse {
    //declare fields
    //private so that they can not be altered outside of this program
    private String courseName;
    private int courseCode;
    private int maxNumber;
    private List<String> studentList;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    //constructor
    public ITECCourse(String courseName, int courseCode, int maxNumber) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.maxNumber = maxNumber;
        this.studentList = new ArrayList<>();
    }
    //add student to arraylist
    public void addStudent(String studentName){
        if(studentList.size() < maxNumber){
        studentList.add(studentName);
        }else{
            System.out.println("Student could not be added; Maximum number reached");
        }
    }
    //return number of students in list to method call
    public int getNumberOfStudents() {
        return studentList.size();
        }
        void removeStudent(String studentName){
        if(studentList.contains(studentName)){
            studentList.remove(studentName);
            System.out.println(studentName+" has been removed.");
        }else{
            if(!studentList.contains(studentName)){
                System.out.println(studentName+" not found.");
            }
        }
        }
    }




