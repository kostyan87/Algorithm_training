package lection1;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		System.out.println(isUnequivocal(x, y, z));
	}

	public static int isUnequivocal(int x, int y, int z) {
		if ((x > 12) || (y > 12) || (x == y)) return 1;
		return 0;
	}
}
