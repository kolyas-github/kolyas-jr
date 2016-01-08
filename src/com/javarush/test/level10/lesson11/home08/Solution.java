package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.StreamHandler;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[3];
        arrayLists[0] = new ArrayList<String>(Arrays.asList("sss","ddd","ggg"));
        arrayLists[1] = new ArrayList<String>(Arrays.asList("sss2","ddd2","ggg2"));
        arrayLists[2] = new ArrayList<String>(Arrays.asList("sss3","ddd3","ggg3"));
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}