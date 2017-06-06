/**
 * 这是一个圆类可以计算圆的面积
 * @author 张海峰
 * @version V1.0
 */
package cn.aufe.compute;

public class Circle extends Geometry{
	private double radius;
	static int num;
	static void showCreateTimes(){
		System.out.println("圆创建了"+num+"次");
	}
	
	/**
	 * 无参构造方法
	 */
	Circle() {// 默认构造方法
		System.out.println("调用了圆形的无参构造方法！");
	}

	public Circle(double radius) {
		this.radius = radius;
		num++;
	}

	/**
	 * 此方法返回圆的面积
	 * @return 圆的面积
	 */
	public double getArea() {
		return 3.14 * radius * radius;
	}

	/**
	 * 设置圆的半径
	 * @param radius 圆的半径
	 */
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	/**
	 * 返回圆的半径
	 * @return 圆的半径
	 */
	public double getRadius(){
		return this.radius;
	}
}
