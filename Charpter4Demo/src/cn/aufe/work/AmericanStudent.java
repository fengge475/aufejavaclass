package cn.aufe.work;

import cn.aufe.compute.Student;

public class AmericanStudent extends Student {

	@Override
	public void speakHello() {
		System.out.println("美国学生打招呼：How do you do！");
	}

	@Override
	public void averageHeight() {
		height = 180;
		System.out.println("美国学生的平均身高：" + height + "厘米");
	}

	@Override
	public void averageWeight() {
		weight = 80;
		System.out.println("美国学生的平均体重：" + weight + "公斤");
	}

	// AmericanStudent类新增的成员方法
	public void americanBoxing() {
		System.out.println("美国学生在练拳击：直拳，勾拳，组合拳");
	}
	
	@Override
	public void cry() {
		System.out.println("我是美国学生...");
	}
}
