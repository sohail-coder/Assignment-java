package com.company.assignment11;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String @NotNull [] args) {
        try {
            Map<Character,Integer> map = new HashMap<>();
            File file = new File("D:\\Assignments_java\\src\\com\\company\\assignment11\\"+args[0]);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for(int i=0;i<line.length();i++){
                    if(!(line.charAt(i) ==' ')){
                        int count = (map.containsKey(line.charAt(i)))?map.get(line.charAt(i)):0;

                        map.put(line.charAt(i),count+1);
                    }
                }
            }
            Path fileName = Path.of("D:\\Assignments_java\\src\\com\\company\\assignment11\\testOutput");
            String temporary="";
            for(Map.Entry<Character,Integer> iterator : map.entrySet()){
                temporary+=iterator.getKey();
                temporary+="  ";
                temporary+=iterator.getValue();
                temporary+="\n";
//                System.out.println(temporary);
            }
                Files.writeString(fileName,temporary);
            System.out.println("successfully written to testOutput");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
