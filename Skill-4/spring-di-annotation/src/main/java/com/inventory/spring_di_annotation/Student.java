package com.inventory.spring_di_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("102")
    private int studentId;

    @Value("Ram")
    private String name;

    @Value("ML")
    private String course;

    @Value("2")
    private int year;

    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }
}