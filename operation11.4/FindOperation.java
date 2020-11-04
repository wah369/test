package operation;
import book.Book;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:12
 */
public class FindOperation  implements IOperation{
    public void work(BookList bookList) {
        System.out.println("查找图书！");
        String name = this.scan.next();
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println(book);
                break;
            }
        }
        if ( i == currentSize) {
            System.out.println("没有此书");
            return;
        }
    }
}