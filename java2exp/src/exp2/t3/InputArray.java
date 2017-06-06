package exp2.t3;

import java.util.Arrays;
/**
 * 遍历与复制数组
 * @author 15计科3 张海峰
 */
public class InputArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,500,600,700,800};
		int [] b,c,d;
		System.out.println(Arrays.toString(a));
		b = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		c=Arrays.copyOf(a, 4);	//代码1调用copyOf方法复制数组a的前4个元素

		System.out.println(Arrays.toString(c));	//代码2返回数组c的元素值的表示格式
		
		d=Arrays.copyOfRange(a, 4, a.length);	//代码3 调用copyRange方法复制数组a的后4个元素
		
		System.out.println(Arrays.toString(d));
		c[c.length-1] = -100; //代码4将-100赋给数组c最后一个元素
		d[d.length-1] = -200;
		System.out.println(Arrays.toString(a));
		
	}

}
