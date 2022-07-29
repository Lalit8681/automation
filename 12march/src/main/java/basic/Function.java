package basic;

public class Function {
	int a=10;
	int b=15;
	String d = "rajput";
	
	public void test() //user defined method
	{
		System.out.println("hello");
	}
	public void mode()// user defined method
	{
		Function ahp = new Function();
		ahp.test();// calling method
		System.out.println("mode print");
		
	}
public static void main (String[] args) {

	//ahp.mode();//calling method
	//System.out.println(ahp.a);
	
	
	
}
}
