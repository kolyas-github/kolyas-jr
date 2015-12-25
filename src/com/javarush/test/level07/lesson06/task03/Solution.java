package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> masStr = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            masStr.add(reader.readLine());
        }
        ArrayList<String> max = new ArrayList<String>();
        max.add(0,masStr.get(0));
        int k = 0;
        for (int i = 1; i < masStr.size(); i++)
        {
            if (masStr.get(i).length() < masStr.get(i-1).length())
            {
                if (masStr.get(i).length() < max.get(0).length())
                {
                    max.clear();
                    k = 0;
                    max.add(k, masStr.get(i));
                }
                else
                {
                    continue;
                }
            }
            else if (masStr.get(i).length() == masStr.get(i-1).length())
            {
                if (masStr.get(i).length() == max.get(0).length())
                {
                    k++;
                    max.add(k, masStr.get(i));
                }
            }
            else if (masStr.get(i).length() < masStr.get(i-1).length())
            {
                continue;
            }
        }
        for (int i = 0; i < max.size(); i++)
        {
            System.out.println(max.get(i));
        }
    }
}
