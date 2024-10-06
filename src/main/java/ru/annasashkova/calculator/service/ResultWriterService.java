package ru.annasashkova.calculator.service;

public class ResultWriterService {
    public static void printResult(String operation, int num1, int num2, int res){
        System.out.println(num1 + operation + num2 + "=" + res);
    }
}
