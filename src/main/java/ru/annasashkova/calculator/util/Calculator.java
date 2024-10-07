package ru.annasashkova.calculator.util;

import java.util.Scanner;

public class Calculator {
    public static int sum() {
        int x = scanner();
        int y = scanner();
        return x + y;
    }

    public static int multiply() {
        int x = scanner();
        int y= scanner();
        return x * y;
    }

    public static int minus() {
        int x = scanner();
        int y= scanner();
        return x - y;
    }

    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
