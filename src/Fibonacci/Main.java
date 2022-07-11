package Fibonacci;

import java.util.Scanner;
/*
        - [ ] Задача: Написать последовательность Фибоначчи и быть готовым ее модернизировать
        Условия: Любой язык, если нет, то псевдокод.
*/
public class Main extends Exception {
    public static void main(String[] args) {
        calc();

    }
    public static void calc(){
        System.out.println("Последовательность можно продолжить от 1 до 10.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try {
            check_number(n);
        } catch (My_Exception e) {
            e.printStackTrace();
            calc();
            return;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void check_number(int n) throws My_Exception {

        if (n > 10 || n == 1 || n == 0) {
            throw new My_Exception("Введите другое число.");
        }

    }
    }

