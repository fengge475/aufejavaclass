import cn.aufe.compute.Circle;
import cn.aufe.compute.Student;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(1.0);
		System.out.println("圆的面积是："+circle.getArea());
		Student student = new Student();
		System.out.println("学生计算的圆的面积是："+student.computerArea(circle));
		
	}
}
