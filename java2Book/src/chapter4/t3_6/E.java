
package chapter4.t3_6;

class AAA{
	static {//静态块
		System.out.println("我是AAA中的静态块！");
	}
}

public class E {
	static {//静态块
		System.out.println("我是最先被执行的静态块！");
	}
	
	public static void main(String[] args) {
		AAA aaa=new AAA();	//AAA的字节码进入内存
		System.out.println("我在了解静态(static)块");
	}

}
