import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-14
 * Time: 22:59
 */

//方法：
// public static 返回值类型

public class HomeWork {






    //递归：
    //1.调用自己本身
    //2,有一个趋近于终止的条件


    //递归求斐波那契数列
    static int count = 0;
    public static int fibor(int n) {
        if(n == 1 || n == 2){
            count++;
            return 1;
        }
        int ret =fibor(n-1)+fibor(n-2);
        return ret;
    }

    public static void main13(String[] args) {
        //System.out.println(fibor(1));
        //System.out.println(fibor(2));
        System.out.println(fibor(40));
        System.out.println(count);
    }

    //输入一个非负整数返回组成它的1数字之和
    public static int  Num(int n) {
        if (n <= 9){
            return n ;
        }
        return Num(n/10)+ n%10;
    }

    public static void main12(String[] args) {
        System.out.println(Num(1525));
    }

    //递归求1+到10
    public static int sum(int n) {
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main11 (String[] args) {
        System.out.println(sum(10));
    }

    //按顺序打印一个数字的每一位
    public static void printNum(int n){
        if (n <= 9){
            System.out.print(n);
            return;
        }
        printNum(n/10);
        System.out.print(n%10);
    }
    public static void main10(String[] args) {
        printNum(1234);
    }


    //求一个数的阶乘
    public static int fac(int n) {
        if(n == 1){
            return 1;
        }
        int tmp = n * fac(n-1);
        return tmp;
    }

    public static void main9(String[] args) {
        System.out.println(fac(11));
    }

    //方法的重载
    //示例代码7，  8才是方法的重载
    public static int addInt(int a,int b){
        int ret = a+b;
        return ret;
    }
    public static double addDouble(double a,double b){
        return  a+b;
    }
    public static void main7(String[] args) {
        int a = 10;
        int b = 20;
        int ret = addInt(a,b);
        System.out.println(ret);
        double c = 14.5;
        double d = 46.5;
        double ret2 = addDouble(c,d);
        System.out.println(ret2);
    }


    //方法的重载  overload
    //1,方法名相同
    //2,参数列表不同（个数和类型不同）
    //3,返回值不做要求
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        int ret = add(a,b);
        System.out.println(ret);
        double a3 = 20.5;
        double b3 = 20.5;
        double c3 = 20.5;
        double ret3 = add(a3, b3, c3);
        System.out.println(ret3);
        double c = 14.5;
        double d = 46.5;
        double ret2 = add(c,d);
        System.out.println(ret2);
    }


    //求斐波那锲数列
    public static int fib(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3;i <= n;i++){
            f3 = f1 + f2;
            //确定f1和f2的值
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main6(String[] args) {
        System.out.println(fib(3));
        System.out.println(fib(6));
    }

    //打断点  断点：让程序运行到这个地方停下来
    //蓝色向下箭头：
    //右上方红色正方块结束调试
    public static void main4(String[] args) {
        int [] array = {2,5,1,2,1};     //int[]是类型  a是名字   {   }是存了一组数据
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = a ^ array[i];
        }
        System.out.println(a);
    }

    public static int findOnceNumber(int[] arr) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = a ^ arr[i];
        }
        return a;
    }

    public static void main47(String[] args) {
        int[] array ={2,5,1,2,1};
        int ret = findOnceNumber(array);
        System.out.println(ret);
    }










    //n的阶乘：重点
    /*public static void main3(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int next = scanner.nextInt();
        int a=fac(next);
        System.out.println(next+"的阶乘为："+a);
    }
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

     */




/*    //阶乘的和::重点
    public static int facSum (int n) {
        int sum = 0;
        for (int i = 1;i <= n ;i++){
            sum += fac(i);

        }
        return sum;

    }
    //定义
    public static int fac(int n) {
        int ret = 1;
        for (int i = 1;i <= n;i++){
            ret *= i;
        }
        return ret;
    }
    //调用
    public static void main2(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        int a= facSum(num);
        System.out.println(a);
    }
    */

    //求三个数字中最大的数
    public static int maxTwoNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maxThreeNumber(int a,int b,int c) {
        int max2 = maxTwoNumber(a,b);
        int max3 = maxTwoNumber(max2,c);
        return max3;

    }

    public static void main1(String[] args) {
        int x = 10;
        int y = 16;
        int ret = maxTwoNumber(x, y);
        //System.out.println(ret);
        System.out.println(maxThreeNumber(10,20,30));
    }




}