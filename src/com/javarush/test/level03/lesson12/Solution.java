package com.javarush.test.level03.lesson12;

/**
 * Created by sbt-kolesnichenko-af on 17.12.2015.
 */
public class Solution
{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person
    {
        public int age = 20;

        public void adjustAge(int age)
        {
            this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
        }
    }
}

