package prc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SolveMoney {

	public static void main(String[] args) {

		String mString = " QQ会员 17腾讯云服务器 13话费 28+10";
		Scanner scanner =new Scanner(mString);
		scanner.useDelimiter("[0123456789]+");
		int sum = 0;
		while (scanner.hasNext()) {
			
				//int tempNum = scanner.nextInt();
				System.out.println("--"+scanner.next());
				//System.out.println(tempNum);
				//sum += tempNum;
		
		}
		System.out.println("一个月的总额外支出为:"+sum);
	}

}
