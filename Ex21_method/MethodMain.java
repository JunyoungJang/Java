package Ex1_method;

public class MethodMain {
	public static void main(String[] args) {
		int su = 100;
		MethodTest m = new MethodTest();
		su = m.test(su);
		
		System.out.println("su : " + su);
	}
}
