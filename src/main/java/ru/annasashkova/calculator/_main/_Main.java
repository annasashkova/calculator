package ru.annasashkova.calculator._main;

import ru.annasashkova.calculator.service.ResultWriterService;
import ru.annasashkova.calculator.util.Calculator;

public class _Main {
    public static void main(String[] args){
        System.out.println("Напишите два числа для сложения");
        int resSum = Calculator.sum();
        ResultWriterService.printResult("сложения", resSum);
        System.out.println("Напишите два числа для умножения");
        int resMulti = Calculator.multiply();
        ResultWriterService.printResult("умножения", resMulti);
        System.out.println("Напишите два числа для вычитания");
        int resMin = Calculator.minus();
        ResultWriterService.printResult("вычитания", resMin);
    }
}
