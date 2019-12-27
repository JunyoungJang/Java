package Ex08_else_if;

public class Ex_elseif {
	public static void main(String[] args) {
		//else if 문 : 여러개의 조건 비교가 필요한 경우
		//if (조건식1){
		//	조건식1이 참일때 실행되는 영역.
		//}
		//else if(조건식2){
		// 	조건식2가 참일때 실행되는 영역.
		//}
		//else {
		// 	조건식1, 2가 모두 거짓일 때 실행되는 영
		//}
		
		int num = 75;
		String str;
		if (num >= 90) 		str = "수";
		else if(num >= 80) 	str = "우";
		else if(num >= 70) 	str = "미";
		else if(num >= 60) 	str = "양";
		else 				str = "가";
		System.out.println(str);
	}
}
