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
        Node cur = this.head.next;
        Node prev = this.head;
        while (cur != null ){
            if(cur.data == key){
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.data == key){
            this.head = this.head.next;
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
    //从指定节点打印
    public void display2(Node newHead) {
        Node cur = newHead;
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
    //翻转单列表
    public Node reverseList(){
        Node pre = null;
        Node newHead = null;
        Node cur = this.head;
        while (cur != null){
            Node cueNext = cur.next;
            if (cueNext == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = cueNext;
        }
        return newHead;
    }
    //返回单链表中间值
    public Node middleNode(){
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输入一个链表，输出该链表中倒数第k个结点。
    public Node FindKthToTail(int k){
        Node fast = this.head;
        Node slow = this.head;
        if(k < 0 || head == null){
            System.out.println("k的位置不合法");
            return null;
        }
        while (k-1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有k这个位置");
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
    public Node partition(Node pHead,int x){
        Node as = null;
        Node ae = null;
        Node bs = null;
        Node be = null;
        Node cur = this.head;
        while(cur != null) {
            if (cur.data < x) {
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            } else {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            }
            cur = cur.next;
        }
        if (as == null){
            return be;
        }
        ae.next = bs;
        if (bs != null){
            ae.next = null;
        }
        return as;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplicattion(){
        Node newHead = new Node(1);
        Node tmp = newHead;
        Node cur = this.head;
        while(cur != null){
            if(cur.data != cur.next.data){
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }else{
                while (cur.next != null && cur.data == cur.next.data){
                    cur = cur.next;
                }
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
    //https://leetcode-cn.com/problems/delete-middle-node-lcci/submissions/这道题很很神奇

    // 链表的回文结构。
    public Boolean chkPalindromr(){
        if (this.head == null) {
            return false;
        }
        if(this.head.next == null){
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null){
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (this.head != slow){
            if(this.head.data != slow.data){
                return false;
            }
            //判断链表的结点位偶数个
            if (this.head.next == null){
                return true;
            }
            if (this.head.next.data == slow.data){
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    //给定一个链表，判断是否有环；
    public Boolean hasCycle(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return false;
        }
        return true;
    }

    //找一个链表的环的入口点
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        Node cur = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast != null && fast.next != null) {
            return null;
        }

        while (cur.data != fast.data){
            cur = cur.next;
            fast = fast.next;
        }
        return fast;

    }


}


