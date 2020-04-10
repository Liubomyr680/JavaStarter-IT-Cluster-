package com.study;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String str = scanner.nextLine();

        JavaBuilder.javaSearch(str);
        
    }
}
