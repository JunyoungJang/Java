package Ex15_array;

public class Ex_array {
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//�迭 : ���� �ڷ����⸮ ��Ƶδ� �ϳ��� ����.
		//���� ���� �ڿ��� ȿ�������� ����, �����ϱ� ���� �迭�� ���.
		//1)�迭 ����
		int[] arr;
		//2)�迭 ����
		arr = new int[6];
		
		/*
		arr[0] = su1;
		arr[1] = su2;
		arr[2] = su3;
		arr[3] = su4;
		*/
		//����:arr[0] = "ȫ�浿"; 	(int array)
		//����:arr[4] = 500;		(size �ʰ�)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 * (i+1);
			System.out.println(arr[i]);
		}
		
	}
}
