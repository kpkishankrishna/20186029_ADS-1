import java.util.Scanner;
public class Solutionkp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MinPQ<Float> minpq = new MinPQ<Float>(n);
		MaxPQ<Float> maxpq = new MaxPQ<Float>(n);
		Float median = 0.0f;
		for (int i = 0; i < n; i++) {
			Float val = sc.nextFloat();
			if (val > median) {
				minpq.insert(val);
			} else {
				maxpq.insert(val);
			}
			if (minpq.size() - maxpq.size() > 1) {
				maxpq.insert(minpq.delMin());
			} else {
				minpq.insert(maxpq.delMax());
			}
			if (minpq.size() == maxpq.size()) {
				median = (minpq.min() + maxpq.max()) / 2;
				System.out.println(median);
			}
			if (maxpq.size() > minpq.size()) {
				median = maxpq.max();
				System.out.println(median);
			}else {
				median = minpq.min();
				System.out.println(median);
			}
		}

	}
}