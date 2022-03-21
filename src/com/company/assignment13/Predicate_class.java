package com.company.assignment13;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class Predicate_class {
    String s;

    Predicate_class(String s) {
        this.s = s;
    }

    public static void main(String args[]){
        Predicate_class pe = new Predicate_class("sohail");
        Predicate<String> p = s->s.isEmpty();
        Predicate<String> p2 = s->!s.isEmpty();
        boolean r=p2.negate().test(pe.s);
        System.out.println(r);

        Consumer<String> c = m-> System.out.println("the main string is "+m);
        Consumer<String> c1=n-> System.out.println("the second string "+n);
        c.andThen(c1).accept("shaik");

        Supplier<int[]> su1 = ()-> new int[]{2,3,4,5};
        for(int i:su1.get()){
            System.out.print(i+" ");}
        System.out.println();


        Function<String ,String> fun = m->{
            return m+" shaik";
        };

        System.out.println(fun.apply("sohail"));
    }
}