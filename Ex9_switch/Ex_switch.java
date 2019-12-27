package Ex09_switch;

public class Ex_switch {
	public static void main(String[] args) {
		//switch문 : if과 같이 조건식으로 결과를 결정하는 것이 아닌
		//비교값을 통해 결과를 얻어내는 제어문.
		//switch(비교값){
		// case 조건값:
		// 		비교값과 조건값이 일치하면 실행되는 영역
		// 		break;
		//}
		int n = 13;
		switch(n) { //비교값(정수'int,long', 문자'char', 문자열'string')
		case 1:		// Case 조건값 중복되면 안됨.
			System.out.println("1. 게임 시작");
			break;
		case 2:
			System.out.println("2.게임 소개");
			break;
		case 3:
			System.out.println("3.설      정");
			break;
		default:
			System.out.println("메뉴를 올바르게 입력하세요.");
			break;
		}//switch
		/* Switch문 오류.
		boolean b = true;
		switch (b) {
		case true:
			break;
		}*/
		
		char ch = 'ㅇ';
		switch (ch) {
		case 'A' :
			System.out.println("A를 선택");
			break;
		case 'B' :
			System.out.println("B를 선택");
			break; 
		default:
			System.out.println("A나 B를 입력하세요");
			break;
		}
		
		int num1 = 10;
		int num2 = 20;
		char op = '*';
		switch(op) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		default:
			System.out.println("연산기호가 올바르지 않습니다.");
		}
	}
}

