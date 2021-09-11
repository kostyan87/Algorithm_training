package lection1;

import java.util.Scanner;

public class HomesAndShops {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int[] buildings = new int[10];
		for (int i = 0; i < 10; i++) {
			buildings[i] = in.nextInt();
		}
		System.out.println(getGreatestDistanceFromHomeToStore(buildings));
	}

	public static int getGreatestDistanceFromHomeToStore(int[] buildings) {
		int maxDistance = 0;
		int distance;
		for (int i = 0; i < 10; i++) {
			if (buildings[i] == 1) {
				distance = getNearestStore(i, buildings);
				if (distance > maxDistance) maxDistance = distance;
			}
		}
		return maxDistance;
	}

	public static int getNearestStore(int build, int[] buildings) {
		int nearestDistanceToLeftStore = 0;
		boolean hasLeftStore = false;
		int nearestDistanceToRightStore = 0;
		boolean hasRightStore = false;

		for (int i = build - 1; i != -1; i--) {
			if (buildings[i] == 0 || buildings[i] == 1)
				nearestDistanceToLeftStore += 1;
			if (buildings[i] == 2) {
				nearestDistanceToLeftStore += 1;
				hasLeftStore = true;
				break;
			}
		}

		for (int i = build + 1; i != buildings.length; i++) {
			if (buildings[i] == 0 || buildings[i] == 1)
				nearestDistanceToRightStore += 1;
			if (buildings[i] == 2) {
				nearestDistanceToRightStore += 1;
				hasRightStore = true;
				break;
			}
		}

		if (hasRightStore && hasLeftStore)
			return Math.min(nearestDistanceToLeftStore,
							nearestDistanceToRightStore);
		if (hasRightStore) return nearestDistanceToRightStore;
		return nearestDistanceToLeftStore;
	}
}
