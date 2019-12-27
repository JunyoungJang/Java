package Ex6_overload;

public class Overload {
	void myMethod(int a) {
		System.out.println("들어온 인자값 : " + a);
	}
	void myMethod(boolean a) {
		System.out.println("들어온 인자값 : " + a + "(boolean)");
	}
	void myMethod(double a) {
		System.out.println("들어온 인자값 : " + a + "(double)");
	}
	void myMethod(String a) {
		System.out.println("들어온 인자값 : " + a + "(String)");
	}
	boolean myMethod(String a, String b) {
		System.out.println("들어온 인자값 : " + a + ", " + b + "(String, String)");
		return true;
	}
}
