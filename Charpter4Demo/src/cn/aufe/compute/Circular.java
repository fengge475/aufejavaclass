/**
 * 这是一个圆锥类，可以计算圆锥的体积
 * 
 * @author 15计科3 张海峰
 * @version V1.0
 */
package cn.aufe.compute;

public class Circular {

	private Circle circle;// 底圆
	private double height;// 高

	/**
	 * 无参构造方法
	 */
	Circular() {// 无参构造方法
	}

	/**
	 * 有参构造方法
	 * @param circle 底圆
	 * @param height 高
	 */
	public Circular(Circle circle, double height) {
		this.circle = circle;
		this.height = height;
	}

	/**
	 * 求圆锥的体积
	 * @return 圆锥的体积
	 */
	public double getVolme() {
		return 1D / 3 * circle.getArea() * height;
	}
	
	/**
	 * 设置底圆的半径
	 * @param radius
	 */
	void setBottomRadius(double radius){
		circle.setRadius(radius);
	}
	
	/**
	 * 返回底圆的半径
	 * @return 底圆的半径
	 */
	public double getBottomRadius(){
		return circle.getRadius();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
