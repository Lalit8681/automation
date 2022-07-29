package prct;

public class paren1 extends grand1{//inhereturns
	
	public void test2() {
		System.out.println("hello im parent");
	}
	public static void main(String[] args) {
		paren1 obj=new paren1();
		obj.test2();
		obj.test();
	}

}
