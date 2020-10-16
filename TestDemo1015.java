import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-15
 * Time: 9:10
 */
public class TestDemo {




    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    /*public void reOrderArray(int [] array) {
        /*先遍历数组统计出奇数个数
        新建一个和array等长的数组，
        遍历array，遇到奇数就从头开始放进新数组‘遇到偶数就从奇数总数下一个位置开始放

        int oddNum=0;
        int oddStart=0;  //奇数开始的位置（初始就是第一个）
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                oddNum++;
            }
        }
        //新建一个等长数组来存放想要的序列
        int[] newArray=new int[array.length];
        //遍历，判断放进新数组的位置
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){                 //若是奇数，直接从第一个位置开始向后放
                newArray[oddStart++]=array[i];
            }
            else{                              //若是偶数，让出奇数的位置，从奇数后面开始放
                newArray[oddNum++]=array[i];
            }
        }

        //最后再把新数组的元素赋给原数组
        for(int i=0;i<newArray.length;i++){
            array[i]=newArray[i];
        }
    }
    */

    public static void reOrderArray(int[] array) {
        int[] ji = new int[array.length];
        int[] ou = new int[array.length];
        int left = 0, right = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 ){
                ji[left] = array[i];
                left++;
            }
            else {
                ou[right] = array[i];
                right++;
            }
        }
        int index = 0;
        for (int i = 0; i < left; i++) {
            array[index] = ji[i];
            index++;
        }
        for (int i = 0; i < right; i++) {
            array[index] = ou[i];
            index++;
        }
    }

    public static void main(String[] args) {
        int[]array = {1,5,6,18,54,63,14,};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    //斐波那锲数列
    public static int Fib(int n) {
        int a = 1;
        int b = 1;
        int sum = a+b;
        if(n==0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else if(n>2){
            for (int i = 3; i <n; i++) {
                a=b;
                b=sum;
                sum=a+b;
            }
        }
        return sum;
    }

    public static void main46(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = Fib(n);
        System.out.println("斐波那锲数列的第"+n+"位是"+x);
    }


    //数组
    //第一种：
     //int[] array1 = {1,2,3,4,5}
    //int []  这是一个数组 ；array1  这是一个数组名  {1,2,3,4,5}数组的值
    //int[] array2 = new {1,2,3,4,5}
    //int[] array3 = new int[5]{1,2,3,4,5}

    public static void main6(String[] args) {
        int a = 0;
        int []array = null;   //代表array不指向任何对象
        //只要引用是空，做什么都无用
        array = new int[]{1,2,5,6,4,8};
        System.out.println(array[0]);
        System.out.println(array.length);
    }


    //引用类型
    public static void printArray1(int[] array) {
        for (int i = 0;i <array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray1(array);
    }

    public static void main4(String[] args) {
        int[] array1 = new  int[5];
        for (int i = 0;i <array1.length;i++){
            System.out.println(array1[i]);
        }
    }

    public static void main3(String[] args) {
        int[] array1 = {1,2,3,4,5};

        int num = array1[4];
        System.out.println(num);

        System.out.println("======for======");
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i]+" ");
        }


    }
    //打印数组长度    和  访问数组中元素
    public static void main01(String[] args) {
        int[] arr = {1,2,3};//定义静态数组
        System.out.println("length:"+arr.length);//打印数组长度
        System.out.println(arr[2]);//访问数组中元素
    }




    //作业题：青蛙跳台阶
    //循环算法
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = floor(n);
        System.out.println("一共"+count+"种跳法");
    }

    public static int floor(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 3; i <= n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;

    }



    //递归算法
    public static int floor1(int n) {
        if(n == 1){
            return 1;
        }
        if(n ==2){
            return 2;
        }
        return floor1(n-1)+floor1(n-2);

    }
    public static void main15(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = floor1(n);
        System.out.println("一共"+count+"种跳法");

    }
}
