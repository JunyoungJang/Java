package Ex19_user;

public class CompanyMain {
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setInfo(20, "ȫ�浿", "�����");
		u1.result();
		
		User u2 = new User();
		u2.age = 30;
		u2.dept = "������";
		u2.name = "��浿";
		u2.result();
		
		u2.dept = "����";
		//u2.company = "������"; //private����.
		u2.result();
	}
}
