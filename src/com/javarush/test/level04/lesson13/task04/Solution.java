package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        boolean f = false;
        for (int i = 1; i<=10; i++){
            if (!f){
                for (int j = 0; j<10; j++){
                    System.out.print("8");
                }
                f=true;
                System.out.println('\n'+"8");
            }
            else {
                System.out.println("8");

            }
        }
    }
}
