package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Вася", true, 12, new ArrayList<Human>());
        Human child2 = new Human("Таня", false, 9, new ArrayList<Human>());
        Human child3 = new Human("Дима", true, 5, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human Father = new Human("Игорь", true, 35, children);
        Human Mother = new Human("Женя", true, 33, children);
        ArrayList<Human> father = new ArrayList<Human>();
        father.add(Father);
        ArrayList<Human> mother = new ArrayList<Human>();
        mother.add(Mother);

        Human grandFather1 = new Human("Петя", true, 60, father);
        Human grandMother1 = new Human("Маруся", false, 58, father);

        Human grandFather2 = new Human("Витя", true, 60, mother);
        Human grandMother2 = new Human("Катя", false, 58, mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }
//        public Human(String name, boolean sex, int age)
//        {
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
