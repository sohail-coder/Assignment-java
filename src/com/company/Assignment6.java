package com.company;
import java.util.*;

public class Assignment6 {
    public static boolean isVampirePair(int a,int b,int num){
        String val1=String.valueOf(a);
        String val2=String.valueOf(b);
        String vampire=String.valueOf(num);
        if((val1.length()!=val2.length()) || (val1.endsWith("0") && val2.endsWith("0")))
            return false;
        String vals=val1+val2;
        char tempArray[] = vals.toCharArray();
        Arrays.sort(tempArray);
        char vamArray[]=vampire.toCharArray();
        Arrays.sort(vamArray);
        vals=new String(tempArray);
        vampire=new String(vamArray);
        if(vals.equals(vampire))
            return true;
        return false;
    }
    public static boolean isVampire(int num){
        int a,b;
        if(Integer.toString(num).length()%2!=0)
            return false;
        for(int k=1;k*k<=num;k++){
            if(num%k==0) {
                a = k;
                b = num / a;
                if(isVampirePair(a, b,num))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> vampireNumbers=new ArrayList<>();
        for(int i=1260;vampireNumbers.size()<100;i++)
            if(isVampire(i))
                vampireNumbers.add(i);
        for(int i=0;i<vampireNumbers.size();i++)
            System.out.println("Vampire number "+(i+1)+" is "+vampireNumbers.get(i));
    }
}
