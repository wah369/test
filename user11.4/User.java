package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-30
 * Time: 20:23
 */
public abstract class User {
    protected String name;

    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;

    }
    public abstract int menu();

    public IOperation doOperation(int choice) {

        return this.iOperations[choice];
    }


}
