/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-14
 * Time: 13:14
 */
//方法的调用：
public class TestDemo1005 {

    //形参的改变不影响实参的改变
    public static void swap(int a,int b) {
        int tmp = b;
        a = b;
        b = tmp;
    }

    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);//输出的是仍然实参的ab。
    }


    /*    //调换a和b的值
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int sum = b;
            b = a;
            a = sum;
            System.out.println(a+" "+b);
        }
    */
    //方法调用中1-5的阶乘
       //定义
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
        System.out.println(facSum(5));
    }

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

    public static void main8(String[] args) {
        System.out.println(maxThreeNumber(10,50,20));

    }

/*
    //return的运用
    public static int maxTwoNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main2(String[] args) {
        int x = 10;
        int y = 16;
        int ret = maxTwoNumber(x, y);
        System.out.println(ret);

    }
*/
/*
    //函数调用的学习
    //1，实参和形参的数据类型要一致
    //2，参数个数要一致
    //3，返回值的数据类型要一致
    //4，调用函数的时候要记得接收返回值
    public static void maxTwoNumber(int a, int b) {
        System.out.println(a + " " + b);
        //                            int a 和 int b 是形参
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    public static void main1(String[] args) {
        int x = 10;     //a和b是实参
        int y = 16;
        maxTwoNumber(x, y);//调用此函数
    }

 */
}
