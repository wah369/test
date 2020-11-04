package operation;
import book.BookList;

import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:25
 */
public interface IOperation {
    Scanner scan = new Scanner(System.in);
    void work(BookList bookList);
}