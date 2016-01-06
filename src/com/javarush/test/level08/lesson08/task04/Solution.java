package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String,Date> map = createMap();
        for (Map.Entry<String,Date> pair : map.entrySet())
        {
            System.out.print(pair.getKey() + " - " + pair.getValue().getMonth() + ", ");

        }
        System.out.println();
        removeAllSummerPeople(map);
        for (Map.Entry<String,Date> pair : map.entrySet())
        {
            System.out.print(pair.getKey() + ", ");
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Mitchel", new Date("JUNE 2 1970"));
        map.put("Fork", new Date("AUGUST 5 1985"));
        map.put("Pork", new Date("MAY 1 1980"));
        map.put("Klinton", new Date("DECEMBER 1 1980"));
        map.put("Rusvelt", new Date("NOVEMBER 1 1980"));
        map.put("Obama", new Date("JUNE 4 1984"));
        map.put("Briggs", new Date("JUNE 18 1983"));
        map.put("Jones", new Date("JUNE 1 1990"));
        map.put("Monson", new Date("JUNE 1 1993"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String, Date> pair = itr.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
            {
                itr.remove();
            }
        }
    }
}
