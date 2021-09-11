package lection1;

import java.util.Scanner;
import java.util.Arrays;

public class DiplomasInFolders {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(getMinSec(arr));
	}

	public static int getMinSec(int[] arr) {
		Arrays.sort(arr);
		int minSec = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minSec += arr[i];
		}
		return minSec;
	}
}
