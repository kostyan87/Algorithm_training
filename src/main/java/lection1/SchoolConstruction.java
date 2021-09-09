package lection1;

import java.util.Scanner;

public class SchoolConstruction {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i;
		int N = in.nextInt();
		int[] arr = new int[N];
		for (i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(getCoordinate(N, arr));
	}

	public static long getCoordinate(int N, int[] arr) {
		if (N == 1) return arr[0];
		if (N % 2 != 0) return arr[N / 2];
		else return Math.round((arr[N / 2] + arr[N / 2 - 1]) / (2 * 1.0));
	}
}
