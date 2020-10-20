/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-20
 * Time: 9:41
 */


class Node {
    public int data;
    public Node next;//存储对象引用

    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向那个节点
        }
}
public class MySingleList {
    public Node head;//作用是，定位头节点的引用
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
            node.next = this.head;
            this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    //找到要插入位置的前一个位置的下标
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if (index < 0 || index > size()) {
            System.out.println("index不合法");
            return;

        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }



    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到关键字key的前驱
    public Node searchPrevNode(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head.data == key){
            this.head = head.next;
            return;
        }
        Node pre = searchPrevNode(key);
        if (pre == null){
            return;
        }
        Node del = pre.next;
        pre.next = del.next;

    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        for (int count = this.size(); count >= 0 ; count++) {
            remove(key);
        }
    }


    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    //清空单链表
    public void clear() {
        this.head = null;
    }
}


