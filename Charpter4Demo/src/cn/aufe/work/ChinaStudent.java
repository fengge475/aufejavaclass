package cn.aufe.work;

import cn.aufe.compute.Student;

public class ChinaStudent extends Student {
	int n;
	public float computeAverage() {
		super.n = n;
		return (float)computeSum()/n;
	}

	@Override
	public void speakHello() {
		System.out.println("中国学生打招呼：您好！");
	}

	@Override
	public void averageHeight() {
		height = 160;// 被覆盖的方法操作被继承的成员
		System.out.println("中国学生的平均身高：" + height + "厘米");
	}

	@Override
	public void averageWeight() {
		weight = 60; // 被覆盖的方法操作被继承的成员
		System.out.println("中国学生的平均体重：" + weight + "公斤");
	}

	// ChinaStudent类新增的成员方法
	public void chinaGongfu() {
		System.out.println("中国学生在练功：坐如钟，站如松，睡如弓");
	}

/*	@Override
	public float add(int a, int b) {
		return a + b + 1;
	}*/
	
	public float add(int a, int b,int c) {
		return a+b+c;
	}
	@Override
	public void cry() {
		System.out.println("我是中国人...");
	}
	
	
	
}
