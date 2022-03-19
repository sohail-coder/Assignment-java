package com.company.assignment7;

public class Hamster implements Rodents{
    public Hamster() {
        System.out.println("Hii , Iam Hamster from Rodent Family");
    }

    @Override
    public void getRunSpeed() {
        System.out.println("I don't run very fast ");
    }
    @Override
    public void getMyLooks() {
        System.out.println("I have short tails or no tails, and much rounder, stouter faces");

    }
}
