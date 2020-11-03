/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-02
 * Time: 16:52
 */

/**
 * 泛型：
 * class MyArrayList<T>  <T>：只是一个占位符，表示当前类是泛型类
 */
 class MyArrayList<T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem =(T[])new Object[10];  //泛型是不能new泛型类型的数组,强转一下
    }
    public void add(T data) {
        this.elem[this.usedSize++] = data;
    }
    public T getPos(int pos) {
        return this.elem[pos];
    }
}
public class TestGenirc {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("dsad");
        String str = myArrayList.getPos(1);
        System.out.println(str);

        MyArrayList<Integer> myArrayList1 = new MyArrayList<>();
        myArrayList1.add(1);
        myArrayList1.add(2);
        myArrayList1.add(3);
        Integer a = myArrayList1.getPos(1);
        System.out.println(a);



    }
}
