package prct;

public class triangle {
	int a=6;
	int b,c,d;
	public void test() {
		
		for(b=0; b<a;b++) {//0
			for(c=a-1;c>b;c--) {
				System.out.print(" ");
			}//.'.'.'.'.
			for(c=1;c<=b;c++) {
				System.out.print("*"+" ");//1
			}
			System.out.println("");//line change
		}
		for(b=0; b<a;b++) {//0
			for(c=a-1;c>b;c--) {
				System.out.print(" ");
			}//.'.'.'.'.
			for(c=1;c<=b;c++) {
				System.out.print(c);//1
			}
			System.out.println("");//line change
		}
	}
	public void test2() {
		for(b=0; b<=a;b++) {//0
			for(c=a;c>=b;c--) {
				System.out.print(" ");
			}//.'.'.'.'.
			for(d=1;d<=b;d++) {
				System.out.print(d+" ");//1
			}
			System.out.println("");//line change
		}
	}
	//SCHOOL
	//SCHOO
	//SCHO
	//SCH
	//SC
	//S
	public static void reversestring(){
	
		String name= "SCHOOL";
		int a= name.length();
		for(int b=a; b>=0;b--) {
			for(int c=0; c<=b-1;c++) {
			System.out.print(name.charAt(c));
			}
			System.out.println();
			}
		}
	
	public static void reversestring2() {
//		s
//		sc
//		sch
//		scho
//		schoo
//		school
		
		String name= "SCHOOL";
		int a= name.length();
		int d=0;
		for(int b=0; b<=a-1;b++) {
		for(int c=b;c>=0; c--) {
			System.out.print(name.charAt(d));
			d++;
//			System.out.print(d);
		}
		System.out.println("");
		d=0;
		}
	
	}
	

	
	public static void main(String[] args) {
		triangle obj = new triangle();
//		obj.test();
		obj.test2();
//		obj.reversestring();
//		obj.reversestring2();
	}

}

