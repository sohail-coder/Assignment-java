package com.company.assignment13;

public class MethodReferences2 {
    public static void starting(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        Runnable r1=MethodReferences2::starting;
        Thread t = new Thread(r1);
        t.start();
    }
}
