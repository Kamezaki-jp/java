package day5;

public class Problem5_7 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int total = 0;
		int avg;
		
		for (int i = 0; i < array.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			array[i] = num;
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println("\n" + "合計値：" + total);
		
		avg = total / array.length;
		System.out.println("平均値：" + avg);
		
		System.out.println("平均値より大きい値：");
		for (int i = 0; i < array.length; i++) {
			if (avg < array[i]) {
				System.out.print(array[i] + " ");
			}
		}
		
		
		System.out.println("\n" + "平均値より小さい値：");
		for (int i = 0; i < array.length; i++) {
			if (avg > array[i]) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
