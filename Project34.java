package com.example.hackerrank;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

class Student1 {
    private int id;
    private String fname;
    private double cgpa;

    public Student1(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Project34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        ArrayList<Student1> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student1 st = new Student1(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, Comparator.comparing(Student1 :: getCgpa).reversed().thenComparing(Student1 :: getFname).thenComparing(Student1 :: getId));

        for(Student1 st: studentList){
            System.out.println(st.getFname());
        }
    }
}
