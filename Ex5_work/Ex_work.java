package Ex05_work;

public class Ex_work {
	public static void main(String[] args) {
		/*
		 * �������� �ִ�.
		 * ��, ���, �������� Ű��� �ִµ�, �Ϸ翡 ����Ǵ� ������ ���� ����
		 * 5, 7, 5��
		 * ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ����ϰ�
		 * �ð��� ��ü ������ ��� ���� ������ ���
		 * */
		
		int[] Fruit = {5, 7, 5}; 		// Pear, Apple, Orange.
		float HourGenerate = 0f;
		for (int i = 0; i < Fruit.length; i++) {
			HourGenerate += Fruit[i] / 24f;
		}
		System.out.println("Average per hour : " + HourGenerate);
		
		
	}
}
