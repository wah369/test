package com.wah5;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-26
 * Time: 23:39
 */
class Student implements Comparable<Student>{
    public int age;
    public String name;
    public int score;

    public Student(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age < o.age){
            return -1;
        }else if (this.age >o.age){
            return 1;
        }else {
            return 0;
        }
    }
}
public class TestDemo {
    public static void main3(String[] args) {
        Student student1 = new Student(10,"小明",98) ;
        Student student2 = new Student(14,"托尼",56);
        if (student1.compareTo(student2) > 0){
            System.out.println("student1>student2");
        }else if (student1.compareTo(student2) < 0){
            System.out.println("student1<student2");
        }else {
            System.out.println("student1==student2");
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(10,"小明",98);
        students[1] = new Student(14,"托尼",56);
        students[2] = new Student(6,"珍妮",48);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        int[] array = {1,7,4,8,6,4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
