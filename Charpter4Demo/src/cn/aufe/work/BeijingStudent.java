package cn.aufe.work;

public class BeijingStudent extends ChinaStudent {

	@Override
	public void speakHello() {
		System.out.println("北京学生打招呼：吃了吗，您呐？");
	}

	@Override
	public void averageHeight() {
		height = 165;
		System.out.println("北京学生的平均身高" + height + "厘米");
	}

	@Override
	public void averageWeight() {
		weight = 65;
		System.out.println("北京学生的平均体重" + weight + "公斤");
	}

	// BeijingStudent类新增的成员方法
	public void beijingOpera() {
		System.out.println("北京学生在唱京剧：花脸，青衣，花旦和老生");
	}
	@Override
	public void cry() {
		System.out.println("我是北京学生");
	}
}
