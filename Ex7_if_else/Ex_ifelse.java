package Ex07_if_else;

public class Ex_ifelse {
	public static void main(String[] args) {
		
		//if else문
		//if (조건식) {
		// 조건식이 참일때 실행되는 영역
		//}
		//else{
		// 조건식이 거짓일 때 실행되는 영역
		//}
		int n = 49;
		String str = "";
		
		if (++n >= 50) {
			str = "n은 50 이상의 수";
		}
		else {
			str = "n은 50 미만의 수";
		}
		System.out.println(str);
		System.out.println("------------------------------------");
		
		//변수 age에 나이를 대입하고
		//30세 이상이면 드실만큼 드셨네요.
		//그렇지 않으면 조금 더 드셔도 되겠어요
		//를 출력하는 if문을 완성
		int age = 100;
		System.out.println("나이 : " + age + "세");
		if (age >= 30) 	System.out.println("드실만큼 드셨네요.");
		else			System.out.println("조금 더 드셔도 되겠어요.");
		System.out.println("------------------------------------");
		
		
		
		
	}
}
