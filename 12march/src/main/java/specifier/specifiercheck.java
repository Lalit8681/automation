package specifier;

import method.accessspecifier;

public class specifiercheck  {
	public static void main (String[] args) {
		accessspecifier obj=new accessspecifier();
		System.out.println(obj.a);
		//System.out.println(obj.b);//default specifier cannot call in other package
		//System.out.println(obj.c);//procted cannot call to other package without inheiriturns 
		//System.out.println(obj.d);//private class cannot cl in other class
	}

}
