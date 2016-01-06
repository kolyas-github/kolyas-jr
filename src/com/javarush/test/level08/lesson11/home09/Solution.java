package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число,
иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("MAY 1 2015"));
    }

    public static boolean isDateOdd(String date)
    {
        Date startDate = new Date(date);
        startDate.setDate(1);
        startDate.setMonth(0);
        Date curDate = new Date(date);
        long difDate = ((curDate.getTime() - startDate.getTime())/1000/60/60/24) + 1;
        if (difDate % 2 != 0 ) return true;
        else return false;
    }
}
