/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-23
 * Time: 21:25
 */
class ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;
    public ListNode (int val){
        this.val = val;
    }
}
public class DoubleList {
    public ListNode puppetHead;//带傀儡节点的头节点
    public ListNode last;
    public DoubleList(){
        this.puppetHead = new ListNode(-1);
    }
    //头插法
    public void addFirst (int data){
        ListNode node = new ListNode(data);
        if (this.puppetHead.next == null) {
            this.puppetHead.next = node;
            node.prev = this.puppetHead;
            this.last = node;
            return;
        }
        node.next = this.puppetHead.next;
        node.next.prev = node;
        this.puppetHead.next = node;
        node.prev = this.puppetHead;
    }
    //尾插法
    public void addLast (int data){
        ListNode node = new ListNode(data);
        if (this.last == null && this.puppetHead.next == null) {
            this.puppetHead.next = node;
            node.prev = this.puppetHead;
            this.last = node;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }
    //任意位置插入
    public ListNode searchIndex (int index){
        ListNode cur = this.puppetHead.next;
        if (index < 0 && index > size()){
            return null;
        }
        while (index < 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex (int index, int data){
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        if (cur == null){
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    //求链表长度
    public int size(){
        ListNode cur = this.puppetHead.next;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印单链表
    public void display(){
        ListNode cur = this.puppetHead.next;
        while (cur != null){
            System.out.print(cur.val + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
    //清空单列表
    public void clear(){
        puppetHead.next = null;
        this.last = null;
    }
    //查找关键字
    public boolean contains (int key){
        ListNode cur = this.puppetHead.next;
        while (cur != null){
            ListNode curNext = cur.next;
            if (cur.val == key){
                return true;
            }
            cur = curNext;
        }
        return false;
    }
    //删除第一次出现的关键字
    public void remove (int key){
        ListNode cur = this.puppetHead.next;
        while (cur != null) {
            if (cur.val == key){
                if (this.puppetHead.next.val == key){
                    this.puppetHead.next = cur.next;
                    cur.next.prev = this.puppetHead;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }
                    else {
                        this.last = this.last.prev;
                    }
                }
                return;
            }else {
                cur = cur.next;
            }
        }

    }
    //删除所有关键字
    public void removeAll (int key) {
        ListNode cur = this.puppetHead.next;
        while (cur != null) {
            if (cur.val == key) {
                if (this.puppetHead.next.val == key) {
                    this.puppetHead.next = cur.next;
                    cur.next.prev = this.puppetHead;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = this.last.prev;
                    }

                }
            }
            cur = cur.next;
        }
    }
}
