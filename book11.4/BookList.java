package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-30
 * Time: 19:38
 */
public class BookList {
    private Book[] elem = new Book[10];

    private int usedSize;

    public BookList() {
        this.elem[0] = new Book("三国演义","罗贯中",24,"长篇小说");
        this.elem[1] = new Book("西游记","吴承恩",25,"长篇小说");
        this.elem[2] = new Book("水浒传","施耐庵",26,"长篇小说");
        this.usedSize = 3;
    }
    public void setBook(int pos,Book book) {
        this.elem[pos] = book;
    }
    public Book getBook(int pos) {
        return this.elem[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
