package com.company.assignment7;


public class Assignment7 {

    public static void main(String[] args) {
        Rodents[] rodents = new Rodents[3];
        System.out.println();
        rodents[0]= new Mouse();
        rodents[0].getMyLooks();
        rodents[0].getRunSpeed();
        System.out.println();
        rodents[1]= new Gerbil();
        rodents[1].getMyLooks();
        rodents[1].getRunSpeed();
        System.out.println();
        rodents[2]= new Hamster();
        rodents[2].getMyLooks();
        rodents[2].getRunSpeed();

    }
}
