package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> masStr= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            masStr.add(i, reader.readLine());
        }
//        System.out.println(masStr.size());
        masStr.remove(2);
//        System.out.println(masStr.size());
        for (int i = masStr.size() - 1; i >= 0; i--)
        {
            System.out.println(masStr.get(i));
        }

    }
}
