/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-24
 * Time: 23:16
 */
public class TestDemo {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(1);
        doubleList.addLast(1);
        doubleList.addLast(5);
        doubleList.addLast(1);
        doubleList.addLast(1);
        //doubleList.display();
        //doubleList.addFirst(9);
        //doubleList.display();
       // doubleList.remove(1);
        doubleList.removeAll(1);
        doubleList.display();

    }
}
