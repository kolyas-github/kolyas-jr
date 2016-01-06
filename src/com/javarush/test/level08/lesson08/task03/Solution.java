package com.javarush.test.level08.lesson08.task03;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
//    public static void main(String[] args)
//    {
//        HashMap<String, String> map = createMap();
//        System.out.println(getCountTheSameLastName(map,"Иван"));
//    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> mapFio = new HashMap<String, String>();
        mapFio.put("Дуров","Иван");
        mapFio.put("Иванов","Дмитрий");
        mapFio.put("Петров","Иван");
        mapFio.put("Сидоров","Николай");
        mapFio.put("Николаев","Петр");
        mapFio.put("Лемтюгов","Игорь");
        mapFio.put("Попов","Александр");
        mapFio.put("Горшков","Илья");
        mapFio.put("Зверев","Михаил");
        mapFio.put("Михайлов","Василий");
        return mapFio;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
    }
}
