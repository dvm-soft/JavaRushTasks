package com.javarush.task.task08.task0818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() throws IOException{
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            String lastName = "Фамилия " + i;
            Integer royalty = (int) Math.round(Math.random() * 1000);
            map.put(lastName, royalty);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            if ((int)((Map.Entry) iterator.next()).getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) throws Exception {
        removeItemFromMap(createMap());
    }
}