package Ex6_overload;

public class Overload {
	void myMethod(int a) {
		System.out.println("���� ���ڰ� : " + a);
	}
	void myMethod(boolean a) {
		System.out.println("���� ���ڰ� : " + a + "(boolean)");
	}
	void myMethod(double a) {
		System.out.println("���� ���ڰ� : " + a + "(double)");
	}
	void myMethod(String a) {
		System.out.println("���� ���ڰ� : " + a + "(String)");
	}
	boolean myMethod(String a, String b) {
		System.out.println("���� ���ڰ� : " + a + ", " + b + "(String, String)");
		return true;
	}
}
