package com.wah6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-27
 * Time: 0:18
 */

/**
 * Cloneable
 * 为什么是一个空接口，他的作用是什么？
 * 空接口也叫标记接口：标记当前类是可以克隆的。
 */

class Money implements Cloneable{
    public double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public String name = "369";

    public Money m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.m = (Money) person.m.clone();
        return person;
        //return super.clone();
    }

}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        Person person1 = (Person)person.clone();
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        System.out.println("==================");
        person1.m.money = 4396;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
    }


    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 =(Person) person.clone();
        System.out.println(person.name);
        System.out.println(person1.name);
        System.out.println("==================");
        person1.name = "4396";
        System.out.println(person.name);
        System.out.println(person1.name);
    }
}
