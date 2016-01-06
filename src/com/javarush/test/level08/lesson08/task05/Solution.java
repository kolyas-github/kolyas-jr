package com.javarush.test.level08.lesson08.task05;

import java.lang.reflect.Array;
import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
/*
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            System.out.print(pair.getKey() + ":" + pair.getValue() + ", ");
        }
        System.out.println();
        removeTheFirstNameDuplicates(map);
        //removeItemFromMapByValue(map, "Василий");
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            System.out.print(pair.getKey() + ":" + pair.getValue() + ", ");
        }
    }
*/
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Моськин","Борис");
        map.put("Уроков","Денис");
        map.put("Мишкин","Василий");
        map.put("Кротов","Василий");
        map.put("Ментов","Василий");
        map.put("Чуркин","Василий");
        map.put("Мурило","Василий");
        map.put("Туринов","Василий");
        map.put("Рубаков","Василий");
        map.put("Бобров","Джон");
        //map.put("Дуров","Василий");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> mapIt = map.entrySet().iterator();
        LinkedList<String> val = new LinkedList<String>();
        while (mapIt.hasNext())
        {
            Map.Entry<String, String> pair = mapIt.next();
            String value = pair.getValue();
            int i = 0;
            for (Map.Entry<String, String> text : map.entrySet())
            {
                if (text.getValue().equals(value))
                {
                    i++;
                }
            }
            if (i>=2)
                val.add(value);
        }
        for (String text : val)
        {
            removeItemFromMapByValue(map, text);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
