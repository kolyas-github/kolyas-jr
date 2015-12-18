package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        if ((a>0) & (b>0) & (c>0)) {
            System.out.println("количество отрицательных чисел: 0"+'\n'+"количество положительных чисел: 3");
        }
        if ( ((a<0) & (b>0) & (c>0)) || ((a>0) & (b<0) & (c>0)) || ((a>0) & (b>0) & (c<0)) ) {
            System.out.println("количество отрицательных чисел: 1"+'\n'+"количество положительных чисел: 2");
        }
        if ( ((a>0) & (b<0) & (c<0)) || ((a<0) & (b>0) & (c<0)) || ((a<0) & (b<0) & (c>0)) ) {
            System.out.println("количество отрицательных чисел: 2"+'\n'+"количество положительных чисел: 1");
        }
        if ((a<0)  & (b<0) & (c<0)) {
            System.out.println("количество отрицательных чисел: 3"+'\n'+"количество положительных чисел: 0");
        }
    }
}
