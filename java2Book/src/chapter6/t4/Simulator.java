package chapter6.t4;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.println("我是："+animal.getAnimalName());
		animal.cry();
	}
}
