package com.company;

public class Assignment_6c {
    Assignment_6c(String temp){
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Assignment_6c[] assignment_6c = new Assignment_6c[3];
        for(int i=0;i<3;i++){
            assignment_6c[i]= new Assignment_6c(Integer.toString(i+1));
        }
    }
}
