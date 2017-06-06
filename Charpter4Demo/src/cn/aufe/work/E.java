package cn.aufe.work;

import java.util.Arrays;
import java.util.Scanner;

import cn.aufe.compute.*;

public class E {

	public static void main(String[] args) {
		Student student;
		ChinaStudent chinaStudent =new ChinaStudent();
		BeijingStudent beijingStudent = new BeijingStudent();
		AmericanStudent americanStudent = new AmericanStudent();
		student = chinaStudent;
		student.cry();
		student = americanStudent;
		student.cry();
		student = beijingStudent;
		student.cry();
		
	}
}
