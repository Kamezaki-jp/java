package day5;

public class Problem5_10 {

	public static void main(String[] args) {
		int[] data = new int[7];
		
		for (int i = 0; i < data.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			data[i] = num;
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		for ( int i = 0; i < data.length; i++) {
			System.out.println();
			for (int j = 0; j < data[i]; j++) {
				System.out.print("★ ");
			}
		}
	}
}