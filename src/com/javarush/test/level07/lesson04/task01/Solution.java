package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        int[] mas = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < mas.length; i++)
            mas[i] = Integer.parseInt(reader.readLine());
        return mas;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int max_int = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max_int) max_int=array[i];
        }
        return max_int;
    }
}
