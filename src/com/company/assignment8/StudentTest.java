package com.company.assignment8;

public class StudentTest {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        try {

            StudentManager student = manager.find("0000001");

        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
        finally {

            System.out.println();
            System.out.println("finally block is also printed");
        }
    }

}
