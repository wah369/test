
/*文档注释
 * 变量：
 * 1、变量名称一定是小驼峰
 *  标识符：数字，字母，下划线，$
 *  不要数字或下划线开头
 *  2、变量在使用之前一定要初始化
 */

/*
块注释
 */

//行注释

class Test {

}

public class TestDemo {
	public static void main(String[] args) {
		double k = 15;
		double l = 4;
		System.out.println(k / l);
		
	}


	public static void main9(String[] args) {
		boolean flg = true;//只能赋值true或者false
		System.out.println(flg);
	}



	public static void main8(String[] args) {
		/**
		 * byte 1  
		 * short 2  短整型
		 * int 4    整形
		 * long 8   长整形
		 * 
		 * Java中的基本数据类型有哪些？
		 * byte short int long float double char boolean
		 *            Integer                Character
		 */
		short sh = 18;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
	}


	public static void main7(String[] args) {
		byte b = 10;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
	}


	public static void main6(String[] args) {
		/**
		 * 2个字节
		 * 16 bit
		 * Charactersd   Integer   非首字母大写
		 * Double  Float  Long     首字母大写
		 */
		char ch = 'a';//单引号引起来的就是一个字符，输入10就不能出来什么
		System.out.println(ch);
	}


	public static void main5(String[] args) {
		float f = 12.5f;//12.5不加f默认为是double类型数据
		System.out.println(f);

		double d = 11.6;
		System.out.println(d);

		int g = 1;
		int h = 2;
		System.out.println(g / h);

		double a = 1;
		double b = 2;
		System.out.println(a / b);

		double e = 1.1;
		System.out.println(e * e);
		
	}


	/**
	 * long:8个字节   64
	 * -2^63  -  2^63-1
	 * @param args [description]
	 */
	
	public static void main4(String[] args) {
		long a = 10L;
		System.out.println(a);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}


	public static void main3(String[] args) {
		/*int _ = 10;
		int _______ = 10;
		int _____ = 10;
		int ____ = 10;
		System.out.println(_);*/
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		int a = Integer.MAX_VALUE+1;
		System.out.println(a);
		int b = Integer.MIN_VALUE-1;
		System.out.println(b);
	}

	public static void main1(String[] args) {
		int age;
		age = 99;
		System.out.println(age);
	}

	public static void main2(String[] args) {
		for (int i = 0;i < args.length ;i++ ) {
			System.out.println(args[i]);
		}
		System.out.println("========");
		System.out.println("hello");
	}
}
	




