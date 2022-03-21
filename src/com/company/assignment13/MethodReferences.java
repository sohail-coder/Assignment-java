package com.company.assignment13;

public class MethodReferences {
    interface  Adder{
        public int add(int a,int b);
    }

    public static int sub(int a,int b){
        return b-a;
    }

    public static void main(String args[]){
        Adder a = MethodReferences :: sub;
        System.out.println(a.add(2,3));
    }
}
