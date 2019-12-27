package Ex15_array;

public class Ex_array3 {
	public static void main(String[] args) {
		
		//배열 arr에 담긴 모든 값을 더 해서 출력하세요.
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
