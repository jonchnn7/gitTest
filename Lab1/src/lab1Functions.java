import junit.framework.TestCase;

public class lab1Functions {
	
	public static void main(String[] spam) {
	System.out.println(multiply(4,5));
	System.out.println(concat(4,5));
	
}
	
	public static int multiply(int a, int b) {
		return (a*b);
	}
	public static String concat(int a, int x) {
		String b = Integer.toString(a);
		String y = Integer.toString(x);
		return (b+y);
	}
}
