package chapter6.t4;

public class Cat implements Animal{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}
	
	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "小猫";
	}
}
