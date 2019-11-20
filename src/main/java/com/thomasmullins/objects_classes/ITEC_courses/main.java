package com.thomasmullins.objects_classes.ITEC_courses;

public class main {
    public static void main(String[] args) {
//TODO create example class
        ITECCourse java = new ITECCourse("Java Programming", 2545, 24);
        ITECCourse softwareProjects = new ITECCourse("Software Development Projects", 2903, 2);


    //TODO add students
        java.addStudent("Gus");
        java.addStudent("Harry");
        java.addStudent("Izzy");
        java.addStudent("Donny");


    //TODO print number of students
        System.out.println(java.getNumberOfStudents());

        java.removeStudent("Donny");
        System.out.println(java.getNumberOfStudents());

        ITECCourse smallSize = new ITECCourse("Small Course", 1234, 3);
        smallSize.addStudent("Gus");
        smallSize.addStudent("Harry");
        smallSize.addStudent("Izzy");
        smallSize.addStudent("Davey");
    }
}
