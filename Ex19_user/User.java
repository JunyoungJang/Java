package Ex19_user;

public class User {
	
	private String company = "�ڸ���IT";
	int age; //����
	String name; //�̸�
	String dept; //�μ�
	
	public void setInfo( int n1, String n2, String n3 ) {
		age = n1;
		name = n2;
		dept = n3;
	}
	
	
	public void result() {
		System.out.println("ȸ��� : " + company);
		System.out.println("����   : " + age);
		System.out.println("�̸�   : " + name);
		System.out.println("�μ�   : " + dept);
		System.out.println("------------------------------");
	}
	
}
