package cn.aufe.testsuper;

public class Student extends Human{
	private String school;
	public Student(String name,int age,String school) {
		super(name, age);
		this.school = school;
	}
	
	
	@Override
	public String getInfo() {
		String info;
		//方法一
//		info = getName()+":"+getAge()+":"+school;
		//方法二
		info = super.getInfo()+":"+school;
		return info;
	}
	
}
