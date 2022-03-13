package com.company;

import java.io.File;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String path,expression;
        path="D://temporary";
        System.out.println("Enter the regular expression or enter 0 to exit");
        expression = scanner.nextLine();
        while (!expression.equals("0")){
            helperFunction(path,expression);
            System.out.println("Enter the regular expression");
            expression = scanner.nextLine();
        }
        System.out.println("Exiting thank you");
    }

    private static void helperFunction(String path, String expression) {
        File file = new File(path);
        for(File f : file.listFiles()){
            if(f.isDirectory()){
                helperFunction(f.getAbsolutePath(),expression);
            }
            else{
                String fileName = f.getName();
                if(fileName.contains(expression)){
                    System.out.println(fileName);
                    System.out.println(f.getAbsolutePath());
                    System.out.println();
                }
            }
        }
    }
}
/*
---------DOCUMENTATION----------
we provides a hard coded path inside our program code, and iteratively we ask user for regular expression input until the user presses 0
after having both path and regular expression we provide them as parameter to our helper functions,then the helper function opens the file, and we iterate through
the path recursively and if the filename contains the regular expression then both the filename and the absolute path will be printed as output
 */