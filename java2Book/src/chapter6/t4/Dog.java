package chapter6.t4;

public class Dog implements Animal{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}

	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "小狗";
	}
}
