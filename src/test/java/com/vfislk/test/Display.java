package com.vfislk.test;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Entered name is "+name);
    }
}
