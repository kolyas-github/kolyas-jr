package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
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

        if ( ((a>b) & (a<c)) || ((a<b) & (a>c))) System.out.println(a);
        if ( ((a<b) & (b<c)) || ((a>b) & (b>c))) System.out.println(b);
        if ( ((a<c) & (b>c)) || ((a>c) & (b<c))) System.out.println(c);

    }
}
