package com.company;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> array = new ArrayList<Long>();
        String IPAddress;
        System.out.println("Enter the IPAddress or enter 0 to exit");
        IPAddress = scanner.nextLine();
        while (!IPAddress.equals("0")){
            Inet4Address ip = (Inet4Address) Inet4Address.getByName(IPAddress);
            if(ip.isReachable(5000)){
                System.out.println(IPAddress+" is reachable");
                long start = System.nanoTime();
                long end = System.nanoTime();
                long elapsedTime = end - start;
                array.add(elapsedTime);

            }
            else {
                System.out.println("cant reach the ip "+IPAddress);
            }
            System.out.println("Enter the IPAddress or enter 0 to exit");
            IPAddress = scanner.nextLine();
        }
        long medianTime = 0;
        for(long l : array){
            medianTime+=l;
        }
        if(array.size()!=0) {
            System.out.println("The median time to ping all the given IP addresses is : " + medianTime / array.size()+" nano seconds");
        }
        System.out.println("Exiting from main. Thank you!");

    }

}
