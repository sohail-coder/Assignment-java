package com.company;

import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        System.out.print("Enter the string to test: ");
        inputString = scanner.nextLine().toLowerCase();
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<inputString.length();i++){
            char ch = inputString.charAt(i);
            if(Character.isAlphabetic(ch)){
                set.add(ch);
            }
        }
        if(set.size()==26){
            System.out.println("The input string contains all the alphabets");
        }
        else{
            System.out.println("The input string does not contain all the alphabets");
        }
    }
}
