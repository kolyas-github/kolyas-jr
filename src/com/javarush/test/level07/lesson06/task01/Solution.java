package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] masStr;
        masStr = new String[]{"Vasya", "Misha", "Petya", "Kolya", "Sasha"};
        System.out.println(masStr.length);
        for (int i = 0; i < masStr.length; i++)
        {
            System.out.println(masStr[i]);
        }

    }
}
