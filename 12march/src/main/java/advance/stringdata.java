package advance;

public class stringdata {
	public static void main (String[]args) {
	String a= "Richa";//literal string type
	String b= "Testing";
	String c= new String("richa");//by new keyword
	System.out.println(a.charAt(2));//index -1 =length
	int len= c.length();//it gives length of perticular string
	System.out.println(len);
	System.out.println(b.toUpperCase());
	System.out.println(b.toLowerCase());
	boolean obj=a.equals(c);
	System.out.println(obj);
	boolean r2=a.equalsIgnoreCase(c);
	System.out.println(r2);
	System.out.println(a.concat(" Lives in MP")); //use to attached the senten.
	String d=a.toLowerCase();
	System.out.println(d);
	Boolean r3=a.contains("icha");
	System.out.println(r3);
	System.out.println(a.substring(4));
		
	}
}
