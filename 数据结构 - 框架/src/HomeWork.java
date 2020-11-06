import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-02
 * Time: 16:36
 */

class Student {
    public String name;
    public String classes;
    public double grade;

    public Student(String name, String classes, double grade) {
        this.name = name;
        this.classes = classes;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}


public class HomeWork {


    //cvte面试题
    public static List<String> func(String str1,String str2) {
        List<String> list = new ArrayList<>();
        for (int i = 0;i < str1.length();i++) {
            char tmp = str1.charAt(i);
            if (!str2.contains(tmp+"")) {
                list.add(tmp+"");
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> ret = func("welcome to bit","come");
        System.out.println(ret);
        for (String str : ret) {
            System.out.print(str);
        }
    }


    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(8);
        list.add(12);
        list.add(4);
        Collections.sort(list); //使用Collections.sort 排序
        System.out.println(list);
    }
    public static void main1(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("XIAO","1",3));
        list.add(new Student("ZHONG","2",6));
        list.add(new Student("DA","3",9));
        for (Student student:list) {
            System.out.println(student);
        }
    }
   
}
