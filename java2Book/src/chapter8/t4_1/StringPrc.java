package chapter8.t4_1;

public class StringPrc {
	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "WORLD";
		System.out.println(s1+" "+s2.toLowerCase());
		System.out.println(s1.toUpperCase()+" "+s2);
		System.out.println(s1.concat(" ").concat(s2.toLowerCase()));
	}

}
