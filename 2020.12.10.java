import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-15
 * Time: 21:28
 */



public class PaiXu {
    public static void main(String[] args) {

    }

    public static void main43(String[] args) {
        int i = 5;
        int s = (++i)+(i++)+(i--)+(--i);
        System.out.println(s);
    }


    public static int addAB(int A, int B) {
        if (A == 0) {
            return B;
        }else if (A == B) {
            return A;
        }else {
            A = A^B;
            return A;
        }
    }
    public static void main42(String[] args) {
        System.out.println(addAB(11,5));
    }
    public static String GetSequeOddNum(int m) {
        int num = m*m-m+1;
        String str = "\""+num+"";
        for (int i = 1; i < m; i++) {
            num = num + 2;
            str += "+"+num;
        }
        str = str+"\"";
        return str;
    }

    public static void main41(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = GetSequeOddNum(scan.nextInt());
            System.out.println(str);
        }
    }
    public static void main40(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int num = a*a-a+1;
        String str = "\""+num+"";
        for (int i = 1; i < a; i++) {
            num = num + 2;
            str += "+"+num;
        }
        str = str+"\"";
        System.out.println(str);
    }
    public static void main39(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            if(arr[i] > 0) {
                System.out.print(i);
                arr[i]--;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    System.out.print(i);
                }
            }
        }

    }
    public static void main38(String[] args) {
        String s1 = "abc"+"def";
        String s2 = new String(s1);
        if(s1.equals(s2)) {
            System.out.println("sda");
        }
        if(s1==s2) {
            System.out.println("kfhd");
        }
    }
    public static String AddLongInteger(String addend,String augend) {
        // 求出两个字符串中较长的那个字符串长度
        int lenA = addend.length();
        int lenB = augend.length();
        int lenS = Math.max(lenA, lenB);

        // arrS保存最终生成的结果
        int[] arrA = new int[lenS];
        int[] arrB = new int[lenS];
        int[] arrS = new int[lenS + 1];

        for (int i = 0; i < lenA; i++) {
            arrA[i] = addend.charAt(lenA - 1 - i) - '0';
        }

        for (int i = 0; i < lenB; i++) {
            arrB[i] = augend.charAt(lenB - 1 - i) - '0';
        }

        for (int i = 0; i < lenS; i++) {
            int sum = arrS[i] + arrA[i] + arrB[i];
            int flag = sum / 10;
            arrS[i] = sum % 10;
            arrS[i + 1] += flag;
        }
        int index = arrS.length-1;
        while (arrS[index] != 0) {
            index--;
        }
        int[] result = Arrays.copyOfRange(arrS, 0, index);
        String str="";
        for (int i = result.length - 1; i >= 0; i--) {
            str+=result[i];
        }
        return str;
    }


    public String AddLongInteger1(String addend,String augend) {
        int a = addend.length();
        int b = augend.length();
        int index = Math.max(a,b);
        int[] arr1 = new int[index];
        int[] arr2 = new int[index];
        int[] result = new int[index+1];
        for (int i = 0; i < a; i++) {
            arr1[i] = addend.charAt(a-1-i)-'0';
        }
        for (int i = 0; i < b; i++) {
            arr2[i] = augend.charAt(b-1-i)-'0';
        }
        for (int i = 0; i < index; i--) {
            int num =result[i] + arr1[i] + arr2[i];
            result[i] = num%10;
            result[i+1] += num/10;
        }
        while (result[index] != 0) {
            index--;
        }
        int[] arr = Arrays.copyOfRange(result,0,index);
        String str = "";
        for (int i = arr.length-1; i >= 0; i--) {
            str += arr[i];
        }
        return str;
    }



    public static void main37(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a = scan.next();
        StringBuffer fe = new StringBuffer();
        StringBuffer m = new StringBuffer();
        for(int i = 0; i < n; i++) {
            fe.append(a);
        }
        m.append(a);
        for (int i = 1; i < n-1; i++) {
            m.append(" ");
        }
        m.append(a);
        System.out.println(fe);
        int num = 0;
        if(n%2 == 0){
            num = n / 2 - 2;
        }else{
            num = n / 2 - 1;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(m);
        }
        System.out.println(fe);
    }
    public int[] exchangeAB(int[] AB) {
        // write code here
        int[] BA = new int[2];
        BA[0] = AB[1];BA[1] = AB[0];
        return AB;
    }


    public int[] constructArr(int[] a) {
        int length = a.length;
        int[] b = new int[length];
        for(int i = 0;i <= length;i++) {
            int result = 1;
            for(int j = 0; j <= length;j++) {
                if(i == j) {
                    j++;
                }else {
                    result *= a[j];
                }

            }
            b[i] = result;
        }
        return b;
    }
    public static void main36(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            map.put(num+"",map.getOrDefault(num+"",0)+1);
        }
        for (int i = 0; i < 10; i++) {
            if(map.containsKey(i+"")) {
                System.out.println(i+":"+map.get(i+""));
            }
        }
    }



    public static void main35(String[] args) {
        java.util.HashMap map = new java.util.HashMap<>();

        map.put("name","adsa");
        map.put("name","jack");
        System.out.println(map.size());
    }
    public static void main34(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong() {
        System.out.println("pong");
    }

    public static int countWays(int x, int y) {
        int[][] arr = new int[x+1][y+1];
        for (int i = 1; i <= y; i++) {
            arr[1][i] = 1;
        }
        for (int j = 1; j <= x; j++) {
            arr[j][1] = 1;
        }
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[x][y];
    }

    public static void main33(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = countWays(x,y);
        System.out.println(result);
    }
    public static void main32(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f1 = 1, f2 = 2,f3 = 3;
        int count = 0;
        if(n < 0) {
            System.out.println(count-n);
        }
        if(n == 0 || n == 1) {
            System.out.println(count);
        }else {
            while (f3 < n) {
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
            }

            count = Math.min(f3 - n, n - f2);
            System.out.println(count);

        }

    }

    public static void main31(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            int[] nums = new int[arr.length - 1];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);
            }
            int k = Integer.parseInt(arr[arr.length-1]);
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            /*for (int i = 0; i < ; i++) {
                
            }*/
        }
    }




    public static void main29(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int index = 2;
        while(arr.length > 1) {
            index += 3;
            remove(arr,index%arr.length);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int[] remove(int[] arr,int num) {
        int[] arr2 = new int[arr.length - 1];
        for(int i = 0; i < arr.length; i++) {
            if(i < num) {
                arr2[i] = arr[i];
            }else {
                arr2[i] = arr[i+1];
            }
        }
        return arr2;
    }
    static int cnt = 6;
    static {
        cnt += 9;
    }

    public static void main28(String[] args) {
        System.out.println(cnt);
    }
    static {
        cnt /= 3;
    }
    //最小公倍数
    public static void main27(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int result = Math.max(A,B);
        while(result%A != 0 || result%B != 0) {
            result++;
        }
        System.out.println(result);
    }

    ////////////////////////////////////////////////////////////////////////////////
    public static void main24(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] arr = new int[H][W];
        int count = 0;
        int x1 = 0,y1 = 0;
        for(int i = x1; i < H; i++) {
            for(int j = y1; j < W; j++) {
                if(arr[i][j] != -1) {
                    count++;
                    if(i + 2 < H) {
                        arr[i+2][j] = -1;
                    }
                    if(j + 2 < W) {
                        arr[i][j+2] = -1;
                    }
                }
            }
        }
        System.out.println(count);
    }
    //有问题
    public static void main25(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] arr = new int[H-1][W-1];
        int count = 1;
        int x1 = 0,y1 = 0;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(Math.sqrt((i-x1)*(i-x1) + (j-y1)*(j-y1)) > 2) {
                    count++;
                    x1 = i;
                    y1 = j;
                }
            }
        }
        if(W == 0 && H == 0) {
            System.out.println(0);
        }else {
            System.out.println(H*W - count);
        }
    }

    public static void main23(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[4];
        while(scan.hasNext()) {
            for(int i = 0; i < 4; i++) {
                arr[i] = scan.nextInt();
            }
        }
        if(((arr[0]+arr[2]) > 0) && ((arr[0]+arr[2])%2 == 0)) {
            System.out.print((arr[0]+arr[2])/2);
        }else{
            System.out.print("NO");
        }
        if(((arr[1] + arr[3]) > 0) && ((arr[1]+arr[3])%2 == 0)) {
            System.out.print(" "+(arr[1]+arr[3])/2);
        }else{
            System.out.print("NO");
        }
        if(((arr[3]-arr[1]) > 0) && ((arr[3]-arr[1])%2 == 0)) {
            int c = (arr[3] - arr[1]) / 2;
            System.out.print((arr[3] - arr[1]) / 2);
        }else{
            System.out.print("NO");
        }
    }

    public static void main22(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"."+b);
    }
    static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y = x;
    }
    public static void main21(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i)+"")){
                result.append(str1.charAt(i));
            }

        }
        System.out.println(result);

    }

}
class Solution {
    //颜色交换012，让0全部在前面，1全部在0后面，2全部在1后面，
    public void sortColors(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(i,index,nums);
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(i,index,nums);
                index++;
            }
        }
    }
    public void swap(int i,int index,int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[index];
        nums[index] = tmp;
    }
}


class Solution14 {
    //leetcode853车队问题
    public int carFleet(int target, int[] position, int[] speed) {
        if(position == null || position.length ==0) return 0;

        int[] temp = new int[target];
        for(int i=0;i<position.length;i++){
            temp[position[i]] = speed[i];
        }
        double[] time = new double[position.length];
        Arrays.sort(position);
        for(int i=0;i<time.length;i++){
            int n = position.length -1-i;
            time[i] = (target-position[n])/(1.0*temp[position[n]]);
        }
        int ans = 1;
        for(int i=0;i<time.length-1;i++){
            if(time[i]>=time[i+1]){
                time[i+1] = time[i];
            }else{
                ans++;
            }
        }
        return ans;
    }
}
