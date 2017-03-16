package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        String value = ((Integer) (new Scanner(System.in).nextInt())).toString();
        for (int i = 0; i < value.length() ; i++) {
            if (Integer.parseInt(((Character) value.charAt(i)).toString()) % 2 == 0)
                even ++;
            else
                odd ++;
        }
        System.out.println("Even: " + even + " Odd: "+ odd);
    }
}
