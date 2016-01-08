package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> mapCat = new HashMap<String, Cat>();
        mapCat.put("Q", new Cat("Q"));
        mapCat.put("W", new Cat("W"));
        mapCat.put("E", new Cat("E"));
        mapCat.put("R", new Cat("R"));
        mapCat.put("T", new Cat("T"));
        mapCat.put("Y", new Cat("Y"));
        mapCat.put("U", new Cat("U"));
        mapCat.put("I", new Cat("I"));
        mapCat.put("O", new Cat("O"));
        mapCat.put("P", new Cat("P"));
        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> nameCat = new HashSet<Cat>();
        for (Map.Entry<String, Cat> cat : map.entrySet())
        {
            Cat catName = cat.getValue();
            nameCat.add(catName);
        }
        return nameCat;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
