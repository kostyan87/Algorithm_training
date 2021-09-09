package lection1;

import java.util.Scanner;
import java.math.BigDecimal;
import java.awt.Point;

public class PointAndTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int coordX = in.nextInt();
		int coordY = in.nextInt();
		Point a = new Point(0, 0);
		Point b = new Point(d, 0);
		Point c = new Point(0, d);
		Point x = new Point(coordX, coordY);
		System.out.println(getPointLocation(a, b, c, x));
	}

	public static int getPointLocation(Point a, Point b,
									   Point c, Point x) {
		final double threshold = 0.0001;

		double ab = a.distance(b);
		double bc = b.distance(c);
		double ac = a.distance(c);
		double ax = a.distance(x);
		double bx = b.distance(x);
		double cx = c.distance(x);

		double square = getSquare(ab, bc, ac);
		double squareABX = getSquare(ax, bx, ab);
		double squareBXC = getSquare(bx, bc, cx);
		double squareAXC = getSquare(ac, cx, ax);

		if (Math.abs(square - (squareABX + squareBXC + squareAXC)) < threshold)
			return 0;
		
		double closestVertex = Math.min(cx, Math.min(ax, bx));

		if (closestVertex == ax && closestVertex == bx) return 1;
		if (closestVertex == ax && closestVertex == cx) return 1;
		if (closestVertex == cx && closestVertex == bx) return 2;
		if (closestVertex == ax) return 1;
		if (closestVertex == bx) return 2;
		return 3;
	}

	public static double getSquare(double side1, double side2, double side3) {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
}
