package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        String country;
        int salary;
        int weigth;
        int countFight;
        boolean fortune;

        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, int weigth)
        {
            this.name = name;
            this.age = age;
            this.weigth = weigth;
        }
        public Human(String name, String country)
        {
            this.name = name;
            this.country = country;
        }
        public Human(String name, int salary, boolean fortune)
        {
            this.name = name;
            this.salary = salary;
            this.fortune = fortune;
        }
        public Human(String name, String country, boolean fortune)
        {
            this.name = name;
            this.country = country;
            this.fortune = fortune;
        }
        public Human(String name, String country, int salary)
        {
            this.name = name;
            this.country = country;
            this.salary = salary;
        }
        public Human(String name, String country, int salary, boolean fortune)
        {
            this.name = name;
            this.country = country;
            this.salary = salary;
            this.fortune = fortune;
        }
        public Human(String name, int age, boolean fortune, int countFight)
        {
            this.name = name;
            this.age = age;
            this.fortune = fortune;
            this.countFight = countFight;
        }
        public Human(String name, int age, String country, int salary, int weigth, int countFight, boolean fortune)
        {
            this.name = name;
            this.age = age;
            this.country = country;
            this.salary = salary;
            this.weigth = weigth;
            this.countFight = countFight;
            this.fortune = fortune;
        }
    }
}
