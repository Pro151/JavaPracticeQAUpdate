package com.hackerRank.newPackg;

import java.io.*;
import java.io.*;
import java.util.*;

public class SolutionHRq {


    public static String capitalizeFirstCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null or empty strings
        }

        // Convert the first character to uppercase and the rest to lowercase
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String A1 = capitalizeFirstCharacter(A);
        String B1 = capitalizeFirstCharacter(B);
        System.out.println(A1+" "+B1);

    }
}




/*import java.util.*;

public class StrTestHr {


    public static String capitalizeFirstCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null or empty strings
        }

        // Convert the first character to uppercase and the rest to lowercase
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
         //Enter your code here. Print output to STDOUT.
        int sum = A.length()+B.length();
        System.out.println(sum);
        if(A.length()>B.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String A1 = capitalizeFirstCharacter(A);
        String B1 = capitalizeFirstCharacter(B);
        System.out.println(A1+" "+B1);
    }
}*/



