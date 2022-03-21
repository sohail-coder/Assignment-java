package com.company.assignment12;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String args[]){
        List<Student> studentList =generateList();

        List department = studentList.stream().filter(distinctByKey(s -> s.engDepartment)).map(d->d.engDepartment).collect(Collectors.toList());
        System.out.println("All departments: "+department);

        List names=studentList.stream().filter(s->s.year_of_enrollment>2018).map(n->n.name)
                .collect(Collectors.toList());
        System.out.println("All students enrolled after 2018: "+names);


        List male=studentList.stream().filter(s->s.gender.equals("Male") && s.engDepartment.equals("Computer Science")).map(n->n.name)
                .collect(Collectors.toList());
        System.out.println("All students enrolled after 2018: "+male);


        Map<String, Long> counting = studentList.stream().collect(
                Collectors.groupingBy(s->s.gender, Collectors.counting()));
        System.out.println(counting);


        Map<String, Double> avgAge = studentList.stream().collect(
                Collectors.groupingBy(s->s.gender, Collectors.averagingInt(s->s.age)));
        System.out.println(avgAge);


        String d=studentList.stream().collect(Collectors.maxBy(Comparator.comparing(a->a.perTillDate))).get().name;
        System.out.println(d);


        Map<String, Long> studentsByDepartment = studentList.stream().collect(
                Collectors.groupingBy(s->s.engDepartment, Collectors.counting()));
        System.out.println(studentsByDepartment);


        Map<String, Double> avgPercentageInEachDepartment = studentList.stream().collect(
                Collectors.groupingBy(s->s.engDepartment, Collectors.averagingDouble(s->s.perTillDate)));
        System.out.println(avgPercentageInEachDepartment);


        Map<Object, Optional<Student>> youngElectronic = studentList.stream().filter(s->s.engDepartment.equals("Electronic")).collect(
                Collectors.groupingBy(s->s.engDepartment, Collectors.minBy(Comparator.comparing(a->a.age))));
        System.out.println(youngElectronic.get("Electronic").get().name);


        Map<String, Long> computerStudents = studentList.stream().filter(s->s.engDepartment.equals("Computer Science")).collect(
                Collectors.groupingBy(s->s.gender, Collectors.counting()));
        System.out.println(computerStudents);

    }
    public static List generateList(){
        Student student[]=new Student[17];
        student[0]=new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        student[1]=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        student[2]=new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        student[3]=new Student(144, "Murali Gowda", 18, "Male", "Electric", 2018, 80.0);
        student[4]=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70.0);
        student[5]=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70.0);
        student[6]=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70.0);
        student[7]=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80.0);
        student[8]=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85.0);
        student[9]=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82.0);
        student[10]=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83.0);
        student[11]=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        student[12]=new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        student[13]=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        student[14]=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        student[15]=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        student[16]=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        List<Student> studentList = new ArrayList<>();
        for(Student s:student){
            studentList.add(s);
        }
        return studentList;
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}