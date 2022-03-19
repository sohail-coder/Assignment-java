package com.company.assignment7;

public class Gerbil implements Rodents{
    public Gerbil() {
        System.out.println("Hii , Iam Gerbil from Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I run faster than Hamster but slower than Mouse");
    }

    @Override
    public void getMyLooks(){
        System.out.println("I have long tails, smallish ears, and long, flat foreheads/noses");
    }
}
