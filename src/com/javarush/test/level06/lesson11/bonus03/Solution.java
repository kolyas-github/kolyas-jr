package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        int[] cats = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
//        for (int i = 0; i<cats.length; i++)
//        {
//            int a = Integer.parseInt(reader.readLine());
//            cats[i] = a;
//        }
        cats[0] = Integer.parseInt(reader.readLine());
        cats[1] = Integer.parseInt(reader.readLine());
        cats[2] = Integer.parseInt(reader.readLine());
        cats[3] = Integer.parseInt(reader.readLine());
        cats[4] = Integer.parseInt(reader.readLine());

        for (int i = cats.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (cats[j] > cats[j+1]) {
                    int temp = cats[j];
                    cats[j] = cats[j+1];
                    cats[j+1] = temp;
                }
            }
        }
        for (int cat : cats)
        {
            System.out.println(cat);
        }

    }
}
