package com.company.assignment13;

public class MethodReferences3 {
    static int size;

    public MethodReferences3(int size) {
        this.size = size;
    }

    public void print() {
        System.out.println(this.size);
    }

    interface Member {
        public void create(int size);
    }

    public static void main(String[] args) {
        Member m = MethodReferences3::new;

    }
}
