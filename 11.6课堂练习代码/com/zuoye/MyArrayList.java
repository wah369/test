package com.zuoye;

import java.util.AbstractList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-02
 * Time: 23:25
 */


/**
 * 自己实现一个ArrayList，模仿ArrayList类的底层结构！
 */
public class MyArrayList{

    private Object[] elementData;
    private int size;

    public MyArrayList(Object[] elementData) {
        this.elementData = elementData;
    }

    public MyArrayList(Object[] elementData, int size) {
        this.elementData = elementData;
        this.size = size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                '}';
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                if (initialCapacity < 0)
                    throw new IllegalArgumentException("错错错，容量不能小于0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        elementData = new Object[initialCapacity];
    }

    public void add(Object obj) {

        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];

            for (int i = 0; i < elementData.length; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }

        elementData[size++] = obj;
    }

    public void add(int index, Object obj) {
        rangeCheck(index);
        ensureCapacity(); // 数组扩容
        System.arraycopy(elementData, index, elementData, index + 1, size
                - index);
        elementData[index] = obj;
        size++;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public void remove(int index) {
        rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        }
        elementData[--size] = null;
    }

    public void remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (get(i).equals(obj)) {
                remove(i);
            }
        }
    }

    public Object set(int index, Object obj) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
    }

    private void ensureCapacity() {
        // 数组扩容和数据的拷贝
        if (size == elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new IndexOutOfBoundsException("数组下标越界啦！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(3);
        list.add("frsaf");
        list.add("a");
        list.add("5");
        list.add("ag");
        System.out.println(list.size());
        list.remove("5");
        System.out.println(list.size());
    }
}




