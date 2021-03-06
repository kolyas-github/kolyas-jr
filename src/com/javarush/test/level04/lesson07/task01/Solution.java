package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
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

        String s = br.readLine();
        int i = Integer.parseInt(s);

        if ((i<0) & (i%2==0)) System.out.println("отрицательное четное число");
        if ((i<0) & (i%2!=0)) System.out.println("отрицательное нечетное число");
        if (i==0) System.out.println("нулевое число");
        if ((i>0) & (i%2==0)) System.out.println("положительное четное число");
        if ((i>0) & (i%2!=0)) System.out.println("положительное нечетное число");

    }
}
