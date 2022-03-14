package com.company.singleton;

public class SingletonClass {
    public String s;
    public static SingletonClass init(String input){
        SingletonClass object=new SingletonClass();
        object.s=input;
        return object;

    }
    public void printString(){
        System.out.println(s);
    }




}
