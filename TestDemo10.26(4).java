package com.wah4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-26
 * Time: 22:52
 */

/**
 * 使用接口的意义
 * 1、可以实现多个接口（可以实现多继承）
 * 2、可扩展性非常强
 * 接口实际上是对某一种功能或者行为的抽象
 * 注意：
 * 1、类和接口之间的关系：implements
 * 抽象类是否可以实现接口？ 可以,但没有意义
 * 2、接口和接口之间的关系：extends
 */

interface IA {
    void func();
}
abstract class A implements IA {
    public void func() {
        System.out.println("168151");
    }
}
class B extends A {
    public void func() {
        System.out.println("53153");
    }
}

////////////////////////////////////////////////////////////////////////
interface IB extends IA{
    void func2();
}
class C implements IB {
    @Override
    public void func() {
    }

    @Override
    public void func2() {
    }
}


interface ID {
    public void func3();
}
interface IC extends IB,ID {

}
class IE implements IC{
    @Override
    public void func() {
    }

    @Override
    public void func2() {
    }

    @Override
    public void func3() {

    }
}


///////////////////////////////////////////////////////////////////////////////
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRunning{
    public Cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑 。。。。");
    }
}

class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}

class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在漂在水上");
    }
}

class RoBot implements IRunning {
    @Override
    public void run() {
        System.out.println("机器人跑。。。");
    }
}
public class TestDemo {
    public static void function1(IRunning iRunning) {
        iRunning.run();
    }
    public static void function2(IFlying iFlying) {
        iFlying.fly();
    }
    public static void function2(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void main(String[] args) {
        function1(new Duck("13533434"));
        function1(new Frog("afaas"));
        function1(new RoBot());
    }

    public static void main1(String[] args) {
        //接口也可以发生   向上转型
        Animal animal = new Duck("唐老鸭");
        IRunning iRunning = new Duck("001");
        IFlying iFlying = new Duck("北京烤鸭");
        ISwimming iSwimming = new Duck("005");
    }

}
