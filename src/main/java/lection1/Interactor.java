package lection1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interactor {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	int r = Integer.parseInt(reader.readLine());
    	int i = Integer.parseInt(reader.readLine());
    	int c = Integer.parseInt(reader.readLine());
    	System.out.println(getFinalVerdict(r, i, c));
	}

	public static int getFinalVerdict(int r, int i, int c) {
		switch(i) {
			case(0):
				if (r != 0) return 3;
				return c;
			case(1): return c;
			case(4):
				if (r != 0) return 3;
				return 4;
			case(6): return 0;
			case(7): return 1;
			default: return i;
		}
	}
}
