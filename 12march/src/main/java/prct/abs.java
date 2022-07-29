package prct;

public abstract class  abs {//need to abstract keyword to define the abstaract class
	public abstract void test();// need to abstract keyword to define the abstract method
	public static void test1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
//		abs obj = new abs();no obj required of abstract class
		abs.test1();//we cannot cl non static maethod
		
	}
	

}
