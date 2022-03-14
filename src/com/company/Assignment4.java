package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n;
        String signup,current;
        System.out.print("Enter number of inputs: ");
        n=scanner.nextInt();
        System.out.println("Enter signup date and current date");
        for (int i=0;i<n;i++){
            signup = scanner.next();
            current=scanner.next();
            try {

            rangeHelper(signup,current);
            if(i!=n-1){
                System.out.println("Enter signup date and current date");
            }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    private static void rangeHelper(String signup, String current) throws Exception {
        Date signupDate = new SimpleDateFormat("dd-MM-yyyy").parse(signup);
        Date currentDate = new SimpleDateFormat("dd-MM-yyyy").parse(current);
        if(currentDate.before(signupDate)){
            System.out.println("No Range");
            System.out.println();
        }
        else{
            Calendar cal = Calendar.getInstance();
            Calendar cal1 = Calendar.getInstance();
            try {
                cal.setTime(signupDate);
                cal1.setTime(currentDate);
            }
            catch (Exception e){
                e.getMessage();
            }
            cal.set(Calendar.YEAR,cal1.get(Calendar.YEAR));
            cal.add(Calendar.DAY_OF_MONTH, -30);
            String rangeBefore = new SimpleDateFormat("dd-MM-yyyy").format(cal.getTime());
            System.out.println("the range is : ");
            System.out.print(rangeBefore);
            cal.add(Calendar.DAY_OF_MONTH,60);
            String rangeAfter = new SimpleDateFormat("dd-MM-yyyy").format(cal.getTime());
            Date newDate = new SimpleDateFormat("dd-MM-yyyy").parse(rangeAfter);

            if(currentDate.after(newDate)){
                System.out.println(" "+rangeAfter);
            }else{
                System.out.println(" "+current);
            }
            System.out.println();
        }

    }
}
