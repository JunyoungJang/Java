package Ex15_array;

public class Ex_array3 {
	public static void main(String[] args) {
		
		//�迭 arr�� ��� ��� ���� �� �ؼ� ����ϼ���.
		int[] 	arr 	= new int[5];
		int 	sum 	= 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
			sum += arr[i];
			System.out.println("arr[" + i + "]="+ arr[i]);
		}
		System.out.println("sum: " + sum);
	}
}
