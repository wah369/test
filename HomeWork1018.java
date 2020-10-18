import java.util.Scanner;
import javax.jws.soap.SOAPBinding;
import java.util.Arrays;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-18
 * Time: 12:15
 */
public class HomeWork1018 {

    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] array){
        String ret = "[";
        for (int i = 0; i <array.length ; i++) {
            //借助String += 进行拼接字符串
            ret += array[i];
            //除了最后一个元素外，其他都要加上  ,
            if (i != array.length-1){
                ret += ",";
            }

        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,4,5,3,4,4,54,6,};
        System.out.println(toString(array));

    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
    public static void main11(String[] args) {
        int[] array = {1,5,3,4,6,8,7,3};
        int[] copy = copyArray(array);
        System.out.println(Arrays.toString(copy));
    }

    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }


    //给定一个有序整型数组, 实现二分查找
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = (left+right)/2;
            if (arr[mid] < key) {
                left = mid + 1;
            }else if(arr[mid] > key){
                right = mid - 1;
            }else {
                return mid;
            }
        }return -1;
    }

    public static void main9(String[] args) {
        int[] array = {1,2,8,4,45,6,7,14,69,10};
        Arrays.sort(array);
        System.out.println(binarySearch(array,8));
    }


    //数组的逆至
    public static void main8(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,};
        Search(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void Search(int[]arr) {
        int left = 0;
        int right = arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            if (left <= right) {
                int num;
                num = arr[left];
                arr[left] = arr[right];
                arr[right] = num;
            }
                left++;
                right--;
        }
    }

    //给定一个整型数组, 判定数组是否有序（递增）
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main7(String[] args) {
        int[] array5 = {5,6,7,8,9,10,11};
        System.out.println(isSorted(array5));

    }

    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void value1(int[] array4) {
        for (int i = 0; i <array4.length-1; i++) {
            for (int j = 0; j < array4.length - 1 - i; j++) {
                if (array4[j] > array4[j + 1]) {
                    int num = array4[j+1];
                    array4[j + 1] = array4[j];
                    array4[j] = num;
                }
            }
        }
    }

    public static void main6(String[] args) {
        int[] array = new int[]{1,3,2,9,4,8,6};
        value1(array);
        System.out.println(Arrays.toString(array));
    }


    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int value(int[] array3) {

        int x = 1;
        for (int i = 0; i <array3.length ; i++) {
            array3[i] = x;
            x++;
        }
        return x;
    }

    public static void main5(String[] args) {
        int[] array3 = new int[100];
        value(array3);
        System.out.println(Arrays.toString(array3));
    }


    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.  平均值
    public static void main4(String[] args) {
        int[] array2 = {1,4,4,12,16,8,4};
        System.out.println(sum(array2));
    }

    public static double sum(int[] array2) {
        int y = 0;
        for (int x : array2) {
            y += x;
        }
        return y / array2.length;
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void main3(String[] args) {
        int[] arr = {1,4,5,7,9};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static void printArray(int[] a){
        for(int x : a){
            System.out.print(x + "   ");
        }
    }

    public static void printArray1(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main2(String[] args) {
        int[] arr = {1,5,6,7,9,1,4,5};
        printArray1(arr);
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).


    //递归求 N 的阶乘
    public static int Cheng(int a) {
        if (a == 1) {
            return a;
        }return a*Cheng(a-1);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Cheng(a));

    }

    //递归求 1 + 2 + 3 + ... + 10
    public static int add10(int a) {
        if (a == 1) {
            return a;
        }return a + add10(a-1);
    }

    public static void main37(String[] args) {
        System.out.println(add10(6));
    }


    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void printNum(int a) {
        if (a <= 9) {
            System.out.print(a+"   ");
            return;
        }
        printNum(a/10);
        System.out.print(a%10 + "   ");
    }

    public static void main36(String[] args) {
        printNum(1234);
    }

    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int addInt(int a) {
        if (a < 10){
            return a;
        }
        return a%10 + addInt(a/10);
    }

    public static void main35(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(addInt(a));
    }


    //递归求汉诺塔问题
    //如果有一个盘子，直接挪
    public static void main34(String[] args) {
        hanoiTower(1,'A','B','C');
        System.out.println();
        hanoiTower(2,'A','B','C');
        System.out.println();
        hanoiTower(4,'A','B','C');

    }
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");

    }
    public static void hanoiTower(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
            return;
        }
        hanoiTower(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoiTower(n-1,pos2,pos1,pos3);
    }



    //递归求斐波那契数列   循环求
    public static int fib1(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }return c;


    }
    public static int fib(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        if (a == 3){
            count++;

        }return fib(a-1) + fib(a-2);
    }

    public static int count = 0;
    public static void main33(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fib1(a));
        System.out.println(count);
    }


    public static int add(int a,int b) {
        return a + b;
    }
    public static double add(double a1,double b1,double c1){
        return a1 + b1 + c1;
    }

    public static void main32(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        System.out.println(add(a1,b1,c1));
    }

    public static int max(int a,int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }
    public static double max(double a,double b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }
    public static double max(double a,double b,int c) {
        double ret = max(a,b);
        if (ret > c) {
            return ret;
        }else {
            return c;
        }
    }
    public static void main31(String[] args) {
        System.out.println(max(4,46));
        System.out.println(max(12.6,14.5));
        System.out.println(max(15.4,16.9,48));
    }


}
