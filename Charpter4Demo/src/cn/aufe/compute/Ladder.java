/**
 * 这是一个梯形类，可以计算梯形的面积
 * 
 * @author 张海峰
 * @version V1.0
 */
package cn.aufe.compute;

public class Ladder extends Geometry{
	private double above;// 梯形的上底
	private double bottom;// 梯形的上底
	private double height;// 梯形的高
	static int num;

	Ladder() {// 默认构造方法
		this(1.0, 1.0, 1.0);
		num++;
	}

	/**
	 * 构造方法
	 * @param above 上底
	 * @param bottom 下底
	 * @param height 高
	 */
	public Ladder(double above, double bottom, double height) {
		this.above = above;
		this.bottom = bottom;
		this.height = height;
		
	}
	
	Ladder(double above, double bottom){
		this(above,bottom,1.0);
	}

	/**
	 * 此方法计算梯形的面积
	 * @return 梯形的面积
	 */
	public double getArea() {
		return (above + bottom) * height / 2;
	}

	public double getAbove() {
		return above;
	}

	public void setAbove(double above) {
		this.above = above;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
