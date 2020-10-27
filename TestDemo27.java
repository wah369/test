import java.util.Scanner;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-13
 * Time: 21:33
 */
public class TestDemo1 {
    //输出一个整数的每一位
    public static void main(String[] args) {
        int n = 123;
        while (n != 0) {
            System.out.println(n%10);
            n /= 10;
        }
    }
    public static void main14(String[] args) {
        int num = 123;
        Print(num);
    }
    public static void Print(int num) {
        //递归终止条件
        if (num > 9) {
            Print(num / 10);
        }
        System.out.print(num % 10 + " ");
    }

    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main13(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println();
        for(int i=30;i>=0;i-=2){
            System.out.print(((num>>i)&1)+"");
        }
        System.out.println();
        for(int i=31;i>0;i-=2){
            System.out.print(((num>>i)&1)+"");
        }

    }

    public static void main12(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    //猜数字游戏
    public static void main11(String[] args) {
        Random random = new Random();  //电脑随机生成一个数
        Scanner scanner = new Scanner(System.in);
        int rand = random.nextInt(100)+1;
        //[0,100)--->  +1   [1,100]
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int n = scanner.nextInt();
            if(n < rand) {
                System.out.println("猜小了！");
            }else if(n == rand) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜大了");
            }
        }
    }

    //打印出1-100的所有素数
    public static void main10(String[] args){

        for(int i=1;i<=100;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0){
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            //if(password == "123456") {
            if(password.equals("123456")) {    //equals判断两个字符串是否相等
                System.out.println("登录成功！");
                break;
            }else {
                count--;
                System.out.println("登录失败！");
                System.out.println("你还有："+count+"次机会！");
            }
        }
    }

    // 求出0～999之间的所有“水仙花数”并输出。
    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            //1、求当前的i是几位数
            int count = 0;
            int tmp = i;
            while (tmp != 0){
                count++;   //1
                tmp = tmp/10;  //
            }
            //此时count已经知道i是几位数
            //2、求tmp的每一位
            tmp = i;
            int sum = 0;
            while (tmp != 0){
                sum += Math.pow(tmp%10,count);
                tmp /= 10;

            }
            if (sum == i){
                System.out.println(i+"是水仙花数");
            }
        }


    }


    //编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static void main7(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }


    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    //符合运算符不需要强制类型转换
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= n ; i++) {
            //sum = sum+(1.0/i)*flg;
            sum += (1.0/i)*flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    //求一个数字的最大公约数
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//24
        int b = scanner.nextInt();//18

        while (a % b != 0) {
            int c = a%b;//24%18=6
            a = b;
            b = c;
        }
        System.out.println("最大公约数是："+b);
    }



    //乘法口诀表
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j++ ){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }



    //打印出一段时间内所有的闰年
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int year = 1000; year <= n; year++) {
            if(year%4 == 0 && year%100 != 0 || year%400 ==0) {
                System.out.println(year+"是闰年");
            }
        }
    }

    //判断一个数是不是素数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.printf(n+"不是素数");
            return;
        }
        int i = 2;
        for(; i < n; i++){
            if (n % i == 0){
                System.out.printf(n+"不是素数");
                break;
            }
        }
        if(i >= n){
            System.out.println(n+"是素数");
        }
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18){
            System.out.printf("少年");
        }else if(age >18 && age <= 28){
            System.out.printf("青年");
        }else if(age >28 && age <= 55){
            System.out.printf("中年");
        }else {
            System.out.printf("老年");
        }
    }

}
