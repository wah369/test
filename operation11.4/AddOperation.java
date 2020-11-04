package operation;
import book.Book;
import book.BookList;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-31
 * Time: 16:10
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！");
        System.out.println("请输入书名：");
        String name = this.scan.next();
        System.out.println("请输入作者：");
        String author = this.scan.next();
        System.out.println("请输入价格：");
        int price = this.scan.nextInt();
        System.out.println("请输入类型：");
        String type = this.scan.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);
        bookList.setUsedSize(currentSize+1);
    }
}
