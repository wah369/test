package operation;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:11
 */

public class ExitOperation  implements IOperation{
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);
    }
}

