package day5;

public class Problem5_3 {

	public static void main(String[] args) {
		
		int[] data = new int[10];
		
		for (int i = 0; i < data.length; i++) {
			int num = (int)(Math.random() * 100) + 1;
			data[i] = num;
			System.out.print(data[i] + " ");
		}
		
		System.out.print("\n" + "奇数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 1) {
				System.out.print(data[i] + " ");
			}
		}
		
		System.out.print("\n" + "偶数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				System.out.print(data[i] + " ");
			}
		}
	}
}
