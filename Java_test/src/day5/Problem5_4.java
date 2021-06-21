package day5;

public class Problem5_4 {

	public static void main(String[] args) {
		int[] data = new int[10];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100) + 1;
			System.out.print(data[i] + " ");
		}
		
		System.out.print("\n" + "50以上の数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 50) {
				System.out.print( data[i] + " ");
			}
		}
		
		System.out.print("\n" + "50未満の数：");
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 50) {
				System.out.print( data[i] + " ");
			}
		}
	}
}
