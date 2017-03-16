package com.javarush.task.task07.task0706;

import java.io.*;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] houses = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                evenCount += houses[i];
            else
                oddCount += houses[i];
        }
        if (evenCount > oddCount)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        if (evenCount < oddCount)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
