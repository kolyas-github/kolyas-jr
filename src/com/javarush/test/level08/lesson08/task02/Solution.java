package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashSet<Integer> s = createSet();
        System.out.println(removeAllNumbersMoreThan10(s));
    }
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 20; i++)
        {
            set.add(i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext())
        {
            int i = iter.next();
            if (i>10) iter.remove();
        }
        return set;
    }
}
