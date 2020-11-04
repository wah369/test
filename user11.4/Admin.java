package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-10-30
 * Time: 20:24
 */
public class Admin extends User {


    public Admin(String name) {
        super(name);
        this.iOperations =  new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }

    @Override
    public int menu() {
        //System.out.println("管理员的菜单");
        System.out.println("hello " + this.name + "欢迎你！");
        System.out.println("1.查找图书！");
        System.out.println("2.新增图书！");
        System.out.println("3.删除图书！");
        System.out.println("4.显示图书！");
        System.out.println("0.退出图书！");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }


}
