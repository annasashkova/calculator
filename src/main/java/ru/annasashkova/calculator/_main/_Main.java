package ru.annasashkova.calculator._main;

import ru.annasashkova.calculator.service.ResultWriterService;
import ru.annasashkova.calculator.util.Calculator;

import java.util.Scanner;


public class _Main {
    public static void main(String[] args){
        System.out.println("Напишите два числа для сложения");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int resSum = Calculator.sum(num1, num2);
        ResultWriterService.printResult("+", num1, num2, resSum);

        System.out.println("Напишите два числа для умножения");
        Scanner sc1 = new Scanner(System.in);
        int num3 = sc1.nextInt();
        int num4 = sc1.nextInt();
        int resMulti = Calculator.multiply(num3, num4);
        ResultWriterService.printResult("*", num3, num4, resMulti);

        System.out.println("Напишите два числа для вычитания");
        Scanner sc2 = new Scanner(System.in);
        int num5 = sc2.nextInt();
        int num6 = sc2.nextInt();
        int resMin = Calculator.minus(num5, num6);
        ResultWriterService.printResult("-", num5, num6, resMin);
    }
}
