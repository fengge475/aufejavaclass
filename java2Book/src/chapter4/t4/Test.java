/*
 * @author: 15�ƿ�3 �ź���
 * **/
package chapter4.t4;

public class Test {

	public static void main(String[] args) {
		
		CPU cpu=new CPU();
		cpu.setSpeed(2200);
		
		HardDisk disk=new HardDisk();
		disk.setAmount(200);
		
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		
		pc.show();
	}

}
