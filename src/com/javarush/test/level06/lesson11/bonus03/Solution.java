package com.javarush.test.level06.lesson11.bonus03;

import com.javarush.test.level04.lesson02.task03.Sol;

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
        for (int i = 0; i<4; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            //System.out.println("i = "+i);
            if (i==0) {
                Solution.cats.add(a);
            }
            else if (i==1) {
                if (a<=Solution.cats.get(i-1)){
                    Solution.cats.add(0,a);
                }
                else {
                    Solution.cats.add(a);
                }
            }
            else
            {
                for (int j = 0; j<=i ;j++)
//                    System.out.println("---");
                    if (a <= Solution.cats.get(j)){
                        Solution.cats.add(j,a);
                        break;
                    }
                    else
                    {
                        continue;
                    }

                }
        }
        for (int j = 0; j<Solution.cats.size();j++){
            System.out.println(Solution.cats.get(j));
        }
    }
}
