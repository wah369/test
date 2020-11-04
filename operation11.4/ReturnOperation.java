package operation;

import book.Book;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:30
 */
public class ReturnOperation  implements IOperation{
    public void work(BookList bookList) {
        System.out.println("归还图书！");
        System.out.println("请输入归还图书的书名！");
        String name = this.scan.next();
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {

                book.setBorrowed(false);
                break;
            }
        }
        if ( i == currentSize) {
            System.out.println("没有此书");
            return;
        }

    }

}