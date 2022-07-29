package advance;

public class returntype {
	
	String name= "Sisodiya";
	public int pract(int a, int b){
		int c=a+b;
		return c;
	}
	public void pract2(int c) {
		int d=c*20;
		System.out.println(d);
	}
	public String pract3() {
		int t=20;
		String l=name.concat(" Lalit");
		return l;
	}
	public static void main(String[] args) {
	returntype obj =new returntype();
		int result = obj.pract(20, 56);
		obj.pract2(result);
//		System.out.println(pract2);
		String result2 = obj.pract3();
		System.out.println(result2);
	}

}
