package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ss=new Scanner(in);
        int a = ss.nextInt();
        int b= ss.nextInt();
        System.out.println("max"+Integer.max(a,b));
        System.out.println("min"+Integer.min(a,b));
        System.out.println(Math.sqrt(a));
    }
}
