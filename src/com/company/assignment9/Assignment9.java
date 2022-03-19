package com.company.assignment9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.util.regex.Pattern;

public class Assignment9 implements Serializable {
    public static void main(String[] args) {
        try
        {
            File file=new File("D:\\Assignments_java\\src\\com\\company\\assignment9\\temp.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String line;
            while((line=br.readLine())!=null)
            {
                boolean b = Pattern.matches("^[A-Z].*[.]", line);
                if(b){
                    System.out.println("The file begins with caps and end with period");
                }
                else{
                    System.out.println("The file either does not begins with caps or end with period");
                }

            }
            fr.close();
        }
    catch (Exception ex){
        System.out.printf(ex.getMessage());
    }
    }
}
