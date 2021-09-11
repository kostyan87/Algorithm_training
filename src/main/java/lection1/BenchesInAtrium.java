package lection1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenchesInAtrium {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int K = in.nextInt();
		List<Integer> legs = new ArrayList<>(K);
		for (int i = 0; i < K; i++) {
			legs.add(in.nextInt());
		}
        List<Integer> answer = getRemainingLegs(L, legs);
        for (Integer n:
             answer) {
            System.out.print(n + " ");
        }
	}

	public static List<Integer> getRemainingLegs(int L, List<Integer> legs) {
        List<Integer> result = new ArrayList<>();
        int mid = L / 2;
        if (L % 2 != 0 && legs.contains(mid)) return List.of(mid);
        //if (L % 2 != 0) mid++;
        for (int i = 0; i < L; i++) {
            if (legs.contains(i)) {
                if (i >= mid) {
                    result.add(legs.get(legs.indexOf(i) - 1));
                    result.add(i);
                    break;
                }
            }
        }
        return result;
	}  
}
