package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //напишите тут ваш код
        double x12 = x2 - x1;
        double y12 = y2 - y1;

        double d;

        d = Math.sqrt(x12 * x12 + y12 * y12);

        return d;

    }
}
