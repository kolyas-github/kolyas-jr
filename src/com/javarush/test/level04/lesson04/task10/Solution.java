package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a==b & a!=c) System.out.println(a+" "+b);
        if (a==c & a!=b) System.out.println(a+" "+c);
        if (b==c & a!=b) System.out.println(b+" "+c);
        if (a==b & b==c) System.out.println(a+" "+b+" "+c);

    }
}