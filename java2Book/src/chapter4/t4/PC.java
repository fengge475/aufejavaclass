package chapter4.t4;

public class PC {

	CPU cpu=new CPU();
	HardDisk HD=new HardDisk();
	
	void setCPU(CPU c){
		cpu=c;
	}
	
	void setHardDisk(HardDisk h){
		HD=h;
	}
	
	void show(){
		System.out.println("cpu�ٶȣ�"+cpu.speed);
		System.out.println("Ӳ��������"+HD.amount);
	}
}
