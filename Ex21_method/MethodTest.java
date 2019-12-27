package Ex1_method;

public class MethodTest {
	//public	void	test	(int n)
	//접근제한자	반환형	메서드명	파라미터
	
	//반환형이 void가 아닌 경우라면
	//코드의 마지막에 반드시 return키워드가 필요하다.
	public int test(int n) {
		n++;
		System.out.println("n : " + n);
		
		return n;
	}
	
	public String test2 (int num) {
		if (num == 0) {
			return "0은 입력할 수 없습니다.";
		}
		else {
			return num + "을 입력하셨습니다.";
		}
	}
}
