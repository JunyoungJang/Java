package Ex19_user;

public class CompanyMain {
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setInfo(20, "홍길동", "사업부");
		u1.result();
		
		User u2 = new User();
		u2.age = 30;
		u2.dept = "영업부";
		u2.name = "김길동";
		u2.result();
		
		u2.dept = "운용부";
		//u2.company = "ㅁㅁㅁ"; //private변수.
		u2.result();
	}
}
