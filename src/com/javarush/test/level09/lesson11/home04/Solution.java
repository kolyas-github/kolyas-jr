package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        String[] masStr = str.split("/");

        Date newDate = new Date();
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(masStr[2]), Integer.parseInt(masStr[0])-1, Integer.parseInt(masStr[1]));
        newDate = c.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY",Locale.ENGLISH);
        System.out.println((dateFormat.format(newDate)).toString().toUpperCase());
    }
}
