package Ex08_else_if;

public class Ex_elseif {
	public static void main(String[] args) {
		//else if �� : �������� ���� �񱳰� �ʿ��� ���
		//if (���ǽ�1){
		//	���ǽ�1�� ���϶� ����Ǵ� ����.
		//}
		//else if(���ǽ�2){
		// 	���ǽ�2�� ���϶� ����Ǵ� ����.
		//}
		//else {
		// 	���ǽ�1, 2�� ��� ������ �� ����Ǵ� ��
		//}
		
		int num = 75;
		String str;
		if (num >= 90) 		str = "��";
		else if(num >= 80) 	str = "��";
		else if(num >= 70) 	str = "��";
		else if(num >= 60) 	str = "��";
		else 				str = "��";
		System.out.println(str);
	}
}
