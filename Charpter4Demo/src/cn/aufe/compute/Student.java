package cn.aufe.compute;

/**
 * 这是一个学生类，学生真的累，会计算，会排序，还要学二分查找，还能变魔术
 * 
 * @author 张海峰
 *
 */
public class Student {
	private String no;// 成员变量，实例变量

	protected double weight;// 学生的体重，因为要跨包继承，所以使用了protected类型
	protected double height;// 学生的身高

	public Student() {
	}

	public Student(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	protected int n;

	public int computeSum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		return sum;
	}

	public void speakHello() {
		System.out.println("Hello~~~~~~");
	}

	public void averageHeight() {
		System.out.println("平均身高：" + height);
	}

	public void averageWeight() {
		System.out.println("平均体重：" + weight);
	}

	/**
	 * 实现加法
	 */
	public float add(int a, int b) {// 成员方法
		return a + b;
	}

	public float add(long a, int b) {
		return a + b;
	}

	public double add(double a, int b) {
		return a + b;
	}

	/*
	 * public void computerArea(){ System.out.println("我不知道计算啥！！！"); }
	 * 
	 * public double computerArea(Circle circle){ return circle.getArea(); }
	 * 
	 * public double computerArea(Rect rect){ return rect.getArea(); }
	 * 
	 * public double computerArea(Ladder ladder){ return ladder.getArea(); }
	 */
	public double getArea(Geometry geometry) {
		return geometry.getArea();
	}

	/**
	 * 学生实现选择排序
	 * 
	 * @param a
	 *            待排序的数组
	 */
	static void selectSort(int[] a) {// 选择法排序数组
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
	}

	/**
	 * 将数组转换成string
	 * 
	 * @param a
	 *            待转换的数组
	 */
	static void toString(int[] a) {
		System.out.print("[");
		for (int i = 0; i <= a.length - 1; i++) {
			if (i != a.length - 1) {
				System.out.print(a[i] + ",");
			} else {
				System.out.println(a[i] + "]");
			}
		}
	}

	/**
	 * 学生实现二分查找
	 * 
	 * @param array
	 *            需要查找的数组
	 * @param key
	 *            待查找的元素
	 * @return 若查找到，返回索引（从0开始），否则返回（-插入点-1）
	 */
	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low - 1;// 如果找不到元素，low值既是插入点。如果算法设计时找不到元素需要返回负数的话，可以返回-low-1
	}

	public void cry() {
		System.out.println("I am crying...");
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
