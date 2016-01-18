package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<String,Integer> mapMonth = new HashMap<String, Integer>();
        mapMonth.put("JANUARY",1);
        mapMonth.put("FEBRUARY",2);
        mapMonth.put("MARTH",3);
        mapMonth.put("APRIL",4);
        mapMonth.put("MAY",5);
        mapMonth.put("JUNE",6);
        mapMonth.put("JULE",7);
        mapMonth.put("AUGUST",8);
        mapMonth.put("SEPTEMBER",9);
        mapMonth.put("OCTOBER",10);
        mapMonth.put("NOVEMBER",11);
        mapMonth.put("DECEMBER",12);
        Iterator<Map.Entry<String,Integer>> itr = mapMonth.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String, Integer> pair = itr.next();
            String key = pair.getKey();
            if (key.equals(month.toUpperCase()))
            {
                System.out.println(month + " is " + pair.getValue() + " month");
                break;
            }
        }
    }
}
