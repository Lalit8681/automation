package specifier;

public class cons1 {
	
	 public cons1(){
		//user defined 
	
		System.out.println("hello");
}
	 
	public void test(){
		System.out.println("hello i am test");
	}
	public static void main(String[] args) {
		cons1 obj=new cons1();
		obj.test();
		obj.test();
		obj.test();
	}
}
//constructor helps to load class member to the object,which helps to call non static members of class
//constructor helps to allocate memory to object of class
//constructor must be same as class name
//it is not compulsory to write a constructor because java provides a default constructor by itself
//constructor have no return type.
//constructor cannot be static,final,abstract


