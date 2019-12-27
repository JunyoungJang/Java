package Ex05_work;

public class Ex_work {
	public static void main(String[] args) {
		/*
		 * 과수원이 있다.
		 * 배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 과일의 양은 각각
		 * 5, 7, 5개
		 * 과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고
		 * 시간당 전체 과일의 평균 생산 갯수를 출력
		 * */
		
		int[] Fruit = {5, 7, 5}; 		// Pear, Apple, Orange.
		float HourGenerate = 0f;
		for (int i = 0; i < Fruit.length; i++) {
			HourGenerate += Fruit[i] / 24f;
		}
		System.out.println("Average per hour : " + HourGenerate);
		
		
	}
}
