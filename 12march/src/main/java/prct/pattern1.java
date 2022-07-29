package prct;

public class pattern1 {
	int a=6;
	int b,c;
	public void test() {
		
		for(b=1; b<=a;b++) {//0
//			for(c=a-1;c>b;c--) {
//				System.out.print(c);
//			}//.'.'.'.'.
			for(c=1;c<=b;c++) {
				System.out.print(" "+c);//1
			}
			System.out.println("");//line change
		}
	}
		public void test2() {
		for(b=0; b<=a;b++) {//0
			for(c=6;c>=b;c--) {
				System.out.print("  ");
			}//.'.'.'.'.
			for(c=1;c<=b;c++) {
				System.out.print(b+" ");//1
			}
		
			System.out.println("`");//line change
		}
	}
		public void test3() {
			for(b=0; b<=a;b++) {
				for(c=1;c<=b;c++) {
					System.out.print(" "+c);//1
				}
				for(c=6;c>=b;c--) {
					System.out.print("  ");
				}
				for(c=6;c>b;c--) {
					System.out.print("  ");
				}
				for(c=1;c<=b;c++) {
					System.out.print(b-c+1+" ");//1
				}
			
				System.out.println(" ");//line change
			}
		}

	public static void main(String[] args) {
		pattern1 obj = new pattern1();
		obj.test();
		obj.test2();
		obj.test3();
		
	}
}
