package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

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

        int a = Integer.parseInt(s1);


        for (int i = 1; i<=a; i++){
            int b = Integer.parseInt(s2);
            for (int j = 1; j<=b; j++){
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
