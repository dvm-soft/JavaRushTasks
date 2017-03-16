package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        double summa = 0;
        double value;
        while((value = scanner.nextInt()) != -1)
        {
            summa += value;
            count ++;
        }
        System.out.println(summa / count);
    }
}

