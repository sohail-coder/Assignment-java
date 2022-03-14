package com.company.main;
import com.company.data.DataClass;
import com.company.singleton.SingletonClass;

public class Assignment5 {
    public static void main(String args[]) {
        DataClass object1 = new DataClass();
        object1.printData();
        object1.localMethod();
        System.out.println();
        SingletonClass object2 = SingletonClass.init("hello");
        object2.printString();

    }
}
