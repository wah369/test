package operation;
import book.Book;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:11
 */
public class DelOperation  implements IOperation {
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入要删的书");
        String name = this.scan.next();
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println(book);
                break;
            }
        }
        if (i == currentSize) {
            System.out.println("位置不合法");
            return;
        }
        int pos = i;
        for (int j = pos; j < currentSize - 1; j++) {
            Book book = bookList.getBook(i+1);
            bookList.setBook(i,book);
        }
        bookList.setBook(currentSize-1,null);
        bookList.setUsedSize(currentSize - 1);
        System.out.println("删除成功");
    }
       
}