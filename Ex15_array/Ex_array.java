package Ex15_array;

public class Ex_array {
	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//배열 : 같은 자료형기리 모아두는 하나의 묶음.
		//많은 양의 자원을 효율적으로 관리, 제어하기 위해 배열을 사용.
		//1)배열 선언
		int[] arr;
		//2)배열 생성
		arr = new int[6];
		
		/*
		arr[0] = su1;
		arr[1] = su2;
		arr[2] = su3;
		arr[3] = su4;
		*/
		//에러:arr[0] = "홍길동"; 	(int array)
		//에러:arr[4] = 500;		(size 초과)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 * (i+1);
			System.out.println(arr[i]);
		}
		
	}
}
