package day5;

public class Problem5_1 {

	public static void main(String[] args) {
		int[] a = new int[7];
		
		for (int i = 0; i < a.length; i++) {
			int num = (int)(Math.random() * 10) +1;
			a[i] = num;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
