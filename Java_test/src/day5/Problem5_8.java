package day5;

public class Problem5_8 {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			int num = (int)(Math.random() * 20) - 10;
			a[i] = num;
			System.out.print(a[i] + " ");
		}
		
		int over = 0;
		int under = 0;
		int zero = 0;
		
		for (int i = 0; i < a.length; i++) {
			if ( 0 < a[i]) {
				over++;
			}else if (0 > a[i]) {
				under++;
			} else if (0 == a[i]) {
				zero++;
			}
		}
		System.out.print("\n" + "0より大きい数:" + over);
		System.out.print("\n" + "0より小さい数:" + under);
		System.out.print("\n" + "0だった数:" + zero);
	}
}
