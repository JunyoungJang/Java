package Ex18_note;

public class Note {

	//설계도를 만드는 작업
//	private int page = 100; class 내부에서만 작동
	int page = 100;
	String color = "white";
	int price = 1000;
	
	//메서드
	//메서드란 어떠한 작업을 수행하기 위한 명령문의 집합.
	//자주 사용되는 코드를 메서드로 작성해 두면 반복적으로 사용되는 코드를 줄일수 있다.
	public void getInfo() {
		
		System.out.println("페이지 : " + page);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		
	}
	
	//메서드의 구성
	//접근제한 변환형 메섣형
	//public void getInfo (파라미터(인자) ){메서드의 실행 영역}
	
	//접근제한
	//1. public : 같은 프로제트 내의 모든 객체들에게 사용을 허가.
	//2. private : 현재 클래스에서만 사용 설정.
	//3. protected : 상속관계이 객체들에게만 사용을 허가함.
	//4. defualt : 같은 패키지내의 모든 객체들에게 사용을 허가함.
	
}





















