package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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

        if ((a>=b) & (b>=c)) System.out.println(a + " " + b + " " + c);//
        if ((a>c) & (c>b)) System.out.println(a + " " + c + " " + b);//

        if ((b>a) & (a>c)) System.out.println(b + " " + a + " " + c);//
        if ((b>=c) & (c>a)) System.out.println(b + " " + c + " " + a);//

        if ((c>a) & (a>b)) System.out.println(c + " " + a + " " + b);//
        if ((c>b) & (b>=a)) System.out.println(c + " " + b + " " + a);//

        //if ((a==b) & (b==c)) System.out.println("-7- "+ a + b + c);//

    }
}
