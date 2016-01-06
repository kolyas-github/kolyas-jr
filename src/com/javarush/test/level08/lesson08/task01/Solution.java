package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Лада");
        set.add("Лида");
        set.add("Лобзик");
        set.add("Лига");
        set.add("Лидер");
        set.add("Лом");
        set.add("Логово");
        set.add("Лиса");
        set.add("Лакей");
        set.add("Ликер");
        set.add("Лама");
        set.add("Лира");
        set.add("Ломтик");
        set.add("Лад");
        set.add("Ликование");
        set.add("Луна");
        set.add("Лес");
        set.add("Лопух");
        set.add("Лапа");
        set.add("Лоб");
        return set;
    }
}
