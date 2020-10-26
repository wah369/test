package com.extendseg;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-25
 * Time: 23:41
 */
class Animal {
    public String name;
    private int age;
    public Animal(String name){
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name+"eat()");
    }
}

class Cat extends Animal {
    public Cat(String name){
        super(name);  //显示调用父类的构造方法
    }
    public void eat() {
        System.out.println(this.name + "eat()");
    }

    public void func() {
        System.out.println(super.name);
        super.eat();
    }
}

    class Dog extends Animal{
    /*public String name;
    public void eat () {
        System.out.println(this.name"Dog::eat()");
    }*/
    public Dog(String name) {
        super(name);
    }
    public void wangwang () {
        System.out.println("wangwang");
    }
}
public class TestDeom {
    public static void main(String[] args) {
        Animal animal2 = new Cat("mimi");
        animal2.eat();
        func1(animal2);
        Cat cat =(Cat) animal2;
        cat.func();
    }

    public static void func1(Animal animal) {

    }
    public static Animal func2(){
        Dog dog = new Dog("旺财");
        return dog;
    }
    public static void main2(String[] args) {
        Animal animal = new Animal("小甜甜"); //父类引用父类对象
        animal.eat();
        Cat cat = new Cat("咪咪");           //子类引用引用自己的对象
        cat.eat();
        Animal animal2 = new Cat("咪咪");    //父类引用引用子类对象   这就是向上转型，把子类的对象给父类
        animal2.eat();
        Dog dog = new Dog("旺财");
        func1(dog);

    }


    public static void main1(String[] args) {
        Cat cat = new Cat("旺财");
        cat.eat();
        Dog dog = new Dog("旺财");
        dog.eat();
        dog.wangwang();
    }
}
