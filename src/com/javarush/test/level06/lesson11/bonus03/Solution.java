package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
    public static ArrayList<Integer> cats = new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            Solution.cats.add(a);
        }
        for (int j = 0; j<Solution.cats.size();j++){
            for ()
            System.out.println(Solution.cats.get(j));
        }
    }
}
