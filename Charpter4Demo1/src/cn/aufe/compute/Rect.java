/**
 * 这是一个矩形类，可以计算矩形的面积
 * 
 * @author 张海峰
 * @version V1.0
 */
package cn.aufe.compute;
public class Rect {
	private double weight;// 矩形的高度
	private double height;// 矩形的高度

	/**
	 * 无参构造方法
	 */
	Rect() {// 默认构造方法
		System.out.println("调用了矩形的无参构造方法！");
	}

	/**
	 * 有参构造方法
	 * 
	 * @param w 矩形的宽
	 * @param h 矩形的高
	 */
	public Rect(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	/**
	 * 此方法计算矩形的面积
	 * 
	 * @return 矩形的面积
	 */
	public double getArea() {
		double area = 0.0;
		return area += weight * height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
