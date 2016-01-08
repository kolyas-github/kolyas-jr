package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.StreamHandler;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код
        ArrayList<String> listStr = new ArrayList<String>();
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        //String[] sortArr = new String[array.length];

        for (String s : array)
        {
            if (isNumber(s)) listInt.add(Integer.parseInt(s));
            else listStr.add(s);
        }
        String [] masStr = listStr.toArray(new String[listStr.size()]);
        Integer [] masInt = listInt.toArray(new Integer[listInt.size()]);

        for (int j = masStr.length - 1; j >= 1; j-- )
        {
            for (int i = 0; i < j; i++)
            {
                String temp = masStr[i];
                if (isGreaterThan(masStr[i],masStr[i+1]))
                {
                    masStr[i] = masStr[i+1];
                    masStr[i+1] = temp;
                }
            }
        }

        for (int j = masInt.length - 1; j >= 1; j-- )
        {
            for (int i = 0; i < j; i++)
            {
                int temp = masInt[i];
                if (masInt[i] < masInt[i+1])
                {
                    masInt[i] = masInt[i+1];
                    masInt[i+1] = temp;
                }
            }
        }
        int indexStr = 0;
        int indexInt = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                array[i] = masInt[indexInt].toString();
                indexInt++;
            }
            else
            {
                array[i] = masStr[indexStr];
                indexStr++;
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
