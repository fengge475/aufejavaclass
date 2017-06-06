package cn.aufe.work;

import java.util.Arrays;
import java.util.Scanner;

import cn.aufe.compute.*;

public class E2 {

	public static void main(String[] args) {

		Rect rect = new Rect(1.0,1.0);// 创建一个对象
		System.out.println("矩形的面积是：" + rect.getArea());

		Circle circle = new Circle(1.0);
		System.out.println("圆的面积是：" + circle.getArea());

		Ladder ladder = new Ladder(1.0,1.0,1.0);
		System.out.println("梯形的面积是：" + ladder.getArea());
		
		Circle circle2 = new Circle(2);
		System.out.println("新圆的面积"+circle2.getArea());
		circle2 = circle;
		System.out.println("重新引用后的面积"+circle2.getArea());

		Circular circular = new Circular(circle, 1.0);
		System.out.println("圆锥的体积："+circular.getVolme());
		
		Circular circular2 = new Circular(new Circle(2.0),1.0);
		System.out.println("圆锥2的体积是："+circular2.getVolme());
		
		circle.setRadius(2);
		System.out.println(circular.getBottomRadius());
		
		circle = new Circle(4);
		System.out.println(circle.getRadius());
		System.out.println(circular.getBottomRadius());
		
		
		// 抽象类作为上转型与多态
		System.out.println("---------抽象类作为上转型与多态---------");
		Geometry geometry = rect;
		System.out.println("矩形的面积是：" + geometry.getArea());

		geometry = circle;
		System.out.println("圆形的面积是：" + geometry.getArea());
		
		Student student = new Student();
		
		System.out.println(student.getArea(rect));

	}
}
