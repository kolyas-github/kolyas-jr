package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int day = Integer.parseInt(s3);
        int month = Integer.parseInt(s2);
        int year = Integer.parseInt(s1);

        System.out.println("Меня зовут "+name);
        System.out.println("Я родился "+day+"."+month+"."+year);
    }
}
