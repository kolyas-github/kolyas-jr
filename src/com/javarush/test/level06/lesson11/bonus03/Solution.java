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
        //напишите тут ваш код
        //int a1 = Integer.parseInt(reader.readLine());
        /*int a2 = Integer.parseInt(reader.readLine());
        int a3= Integer.parseInt(reader.readLine());
        int a4= Integer.parseInt(reader.readLine());
        Solution.cats.add(a1);
        Solution.cats.add(0,a2);
        Solution.cats.add(0,a3);
        Solution.cats.add(1,a4);

        for (int j = 0; j<Solution.cats.size();j++){
            System.out.println(Solution.cats.get(j));
        }*/
        for (int i = 0; i<4; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            System.out.println("i = "+i);
            if (i==0) {
                Solution.cats.add(a);
            }
            else
            {
                while (a < Solution.cats.get(i))
                {
                    
                }
                System.out.println("l="+l);
                Solution.cats.add(l, a);
            }

        }
        for (int j = 0; j<Solution.cats.size();j++){
            System.out.println(Solution.cats.get(j));
        }
    }
}
