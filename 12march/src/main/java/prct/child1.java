package prct;

public class child1 extends paren1 {
	public void test3() {
		System.out.println("hello im child");
	}
	public static void main(String[] args) {
		child1 obj = new child1();
		obj.test();
		obj.test2();
//		obj.test3();
	}

}
