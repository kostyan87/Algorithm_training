package lection1;

import java.util.Scanner;

public class RingMetroLine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int i = in.nextInt();
		int j = in.nextInt();
		System.out.println(getMinNumStations(N, i, j));
	}

	public static int getMinNumStations(int N, int i, int j) {
        if (i > j) return Math.min(N - i + j - 1, i - j - 1);
        else return Math.min(N - j + i - 1, j - i - 1);
	}
}
