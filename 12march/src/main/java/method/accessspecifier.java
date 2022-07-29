package method;

public class accessspecifier {
	
	public int a=10;
	int b=30;
	protected int c=30;
	private int d=40;
	public static void main (String[] args) {
		accessspecifier obj = new accessspecifier();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}

}
