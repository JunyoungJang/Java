package Ex4_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String클래스는 두 가지 특징이 있다.
		//1) 객체 생성법이 두가지(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변적 특징)
		
//		String s1 = "abc";//암시적 객체 생성 - 암시적 객체 = 동일한 주소 공유
//		String s2 = "abd";
		
		//명시적 객채 생성. new 명시할 경우 무조건 새로 만듬.
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		//String == strcmp
		if (s3.equals(s4)) {
			System.out.println("s3와 s4의 값이 같습니다.");
		}
		
		//==은 객체(Class)를 비교할 때 주소값 비교가 된다.
		//int, float, double같은 형태는 값 비교.
		if (s3 == s4) {
			System.out.println("s3과 s4의 주소가 같습니다.");
		}
		else {
			System.out.println("s3과 s4의 주소가 다릅니다.");
		}
		//Java는 garbage collector가 있어서 memory free안해도됨.
		String name = "홍길동";
		name = "김길동";//주소 이전 - 데이터가 바뀌지않고 주소가 바뀜.
		System.out.println(name);
		System.out.println("--------------------------");
		String str = "Hong Gil Dong";
		int len = str.length();
		System.out.println("문자열 str의 길이 : " + len);
		
		char ch = str.charAt(5);
		System.out.println("추출한 무자 : " + ch);
		
		str = "       홍 길 동   ";
		String t_str = str.trim();//문장 앞뒤의 의미없는 공백을 제거하는 메서드
		if (t_str.equals("홍 길 동")) {
			System.out.println("값이 같습니다.");
		}
		
		str = "12312312312321";
		int tmp = Integer.parseInt(str);
		System.out.println(tmp);
	}
}
