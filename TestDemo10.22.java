/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-20
 * Time: 8:47
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList1 = new MySingleList();
        mySingleList1.addLast(1);
        mySingleList1.addLast(12);
        mySingleList1.addLast(31);
        mySingleList1.addLast(41);


        MySingleList mySingleList2 = new MySingleList();
        mySingleList2.addLast(11);
        mySingleList2.addLast(12);
        mySingleList2.addLast(13);
        mySingleList2.addLast(24);

        Node ret = mergeTwoLists2(mySingleList1.head,mySingleList2.head);
        mySingleList1.display2(ret);

    }

    //找到两个链表的第一个公共结点
    public static Node mergeTwoLists2(Node headA, Node headB) {
        while (headA != null){
            Node cur = headB;
            while (cur != null){
                if(headA.data == cur.data){
                    headA.next = null;
                    return headA;
                }else {
                    cur = cur.next;
                }

            }
            headA = headA.next;
        }
        return null;
    }

    //给两个链表合并并按照原来的顺序
    public Node mergTwoLists(Node headA, Node headB) {
        Node newHead = new Node(0);
        Node tmp = newHead;
        while (headA.next != null && headB.next != null){
            if (headA.data > headB.data){
                tmp.next = headB;
                headB = headB.next;
            }else {
                tmp.next = headA;
                headA = headA.next;
            }
            tmp = tmp.next;
        }
        if (headA == null){
            tmp.next = headB;
        }else {
            tmp.next = headA;
        }
        return newHead.next;
    }

    public static void main2(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.display();
        //Node ret = mySingleList.reverseList();
        Node ret2 = mySingleList.middleNode();
        System.out.println(ret2.data);
        Node ret3 = mySingleList.FindKthToTail(1);
        System.out.println(ret3.data);


    }
    public static void main1(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(1);
        mySingleList.addLast(1);
        mySingleList.addLast(6);
        mySingleList.addLast(5);
        mySingleList.addFirst(1);
        mySingleList.display();
        mySingleList.addIndex(5,99);
        mySingleList.display();
        mySingleList.remove(99);
        mySingleList.display();
        mySingleList.removeAllKey(1);
        mySingleList.display();


    }
}
