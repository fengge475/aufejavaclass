
package chapter4.t3_6;

class AAA{
	static {//��̬��
		System.out.println("����AAA�еľ�̬�飡");
	}
}

public class E {
	static {//��̬��
		System.out.println("�������ȱ�ִ�еľ�̬�飡");
	}
	
	public static void main(String[] args) {
		AAA aaa=new AAA();	//AAA���ֽ�������ڴ�
		System.out.println("�����˽⾲̬(static)��");
	}

}
