package Ex7_quiz;

public class Quiz {
	void greet(String name) {
		System.out.println(name + "�� �ȳ��ϼ���~!");
	}
	void greet(String name, int age) {
		if (age > 19)	System.out.println(name + "�� �ȳ��ϼ���~!");
		else			System.out.println(name + "(��)��, �ȳ�?");
	}
}
