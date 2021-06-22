package day5;

public class Problem5_6 {

	public static void main(String[] args) {
		int[] data = new int[10];
		int max = 0;
		int avg;
		int total = 0;
		
		for (int i = 0; i < data.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			data[i] = num;
			System.out.print(num + " ");
		}
		
		for (int i = 0; i < data.length; i++) {
			if ( max < data[i]) {
				max = data[i];
			}
		}
		System.out.println("\n" + "最大値：" + max);
		 
		int min = data[0];
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.println("最小値：" + min);
		
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		avg = total / data.length;
		System.out.println("合計値：" + total);
		System.out.println("平均値：" + avg);
		
	}
}
