package com.company.oops_practice.inheritance;
class Person{
    String name="nani";
    int age=20;
    public void show(){
        System.out.println("Student inheriting properties");
    }
}

class Student extends Person{
    int marks=75;
    String tutorial="Tutorial";
}

public class PersonDemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.show();
        System.out.println("Name of the person:"+ student.name);
        System.out.println("Age of the student:"+ student.age);
        System.out.println("Marks of the student:"+ student.marks);
        System.out.println("Student learns from:"+ student.tutorial);
    }
}


