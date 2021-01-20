import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2021-01-20
 * Time: 19:27
 */
public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double x0 = sc.nextDouble();
            double y0 = sc.nextDouble();
            double z0 = sc.nextDouble();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();
            double r = Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2)+Math.pow(z0-z1,2));
            double v = 4/3.0*Math.acos(-1)*Math.pow(r,3);

            DecimalFormat format = new DecimalFormat("0.000");
            System.out.println(format.format(r)+" "+format.format(v));
        }

    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str2.length(); i++) {
            set.add(str2.charAt(i)+"");
        }
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            String str = str1.charAt(i) + "";
            if (!set.contains(str)) {
                if (!result.contains(str)) {
                    result += str;
                }
            }
        }
        System.out.println(result);
    }
    public static void main1(String[] args){
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        first=first.toUpperCase();
        second=second.toUpperCase();
        for(int i=0;i<second.length();i++){
            first=first.replace(second.charAt(i)+"","");
        }
        String coutStr="";
        for(int i=0;i<first.length();i++){
            if(coutStr.contains(first.charAt(i)+"")){
                continue;
            }else{
                System.out.print(first.charAt(i));
                coutStr+=first.charAt(i);
            }
        }
        System.out.println();

    }
}

