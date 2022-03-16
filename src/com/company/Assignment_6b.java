package com.company;

public class Assignment_6b {
    Assignment_6b(int a, int b){
        System.out.println(a+b);
        new Assignment_6b("hello","world");
    }
    Assignment_6b(String a , String b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Assignment_6b assignment_6b = new Assignment_6b(2,5);
    }

}
