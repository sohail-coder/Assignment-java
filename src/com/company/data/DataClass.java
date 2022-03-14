package com.company.data;

public class DataClass {
    public int number;
    public char ch;
    public void  printData(){
        System.out.println("Number in data class : "+number);
        System.out.println("character in data class is "+ch);
    }
    public void  localMethod(){
        int number;
        char ch ;
        System.out.println("in local method in data class");
            /*
                System.out.println("Number in data class : "+number);
                System.out.println("character in data class is "+ch);
            --------------------------------------------------
                    local variables has to be initialized
                    global variables need not be initialized
            -------------------------------------------------
         */
    }
}
