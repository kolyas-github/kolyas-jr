package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int i = 1;
        while (i<=10){
            int j = 1;
            while (j<=10){
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
