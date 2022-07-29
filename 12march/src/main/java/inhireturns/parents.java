package inhireturns;

public class parents extends grandpa {
	public void test() {
		System.out.println("im parents");
	}
	public static void test4() {
		System.out.println("inhereturns me");
	}
	public void demo1() {
		super.test();
	}
	public static void main(String[] args) {
		parents obj=new parents();
		obj.test();
		obj.demo1();
	}
}
