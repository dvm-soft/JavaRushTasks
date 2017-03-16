package com.javarush.task.task07.task0712;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        String stringMin = list.get(0);
        String stringMax = stringMin;

        for (int i = 0; i < 10; i++) {
            String value = list.get(i);
            if (stringMin.length() > value.length())
            {
                stringMin = value;
                indexMin = i;
            }
            if (stringMax.length() < value.length())
            {
                stringMax = value;
                indexMax = i;
            }
        }
        if (indexMin < indexMax)
            System.out.println(list.get(indexMin));
        else
            System.out.println(list.get(indexMax));
    }
}
