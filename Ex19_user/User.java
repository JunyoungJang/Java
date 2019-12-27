package Ex19_user;

public class User {
	
	private String company = "코리아IT";
	int age; //나이
	String name; //이름
	String dept; //부서
	
	public void setInfo( int n1, String n2, String n3 ) {
		age = n1;
		name = n2;
		dept = n3;
	}
	
	
	public void result() {
		System.out.println("회사명 : " + company);
		System.out.println("나이   : " + age);
		System.out.println("이름   : " + name);
		System.out.println("부서   : " + dept);
		System.out.println("------------------------------");
	}
	
}
