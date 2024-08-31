package hw5;

import java.lang.reflect.Array;

public class Work03 {
	public  int maxElement(int x[][]) {
		int max=0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max=0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
