import java.util.Scanner;
class Stock implements Comparable<Stock> {
	private String company;
	private Double changeinpercent;
	public Stock(String company, Double changeinpercent) {
		this.company = company;
		this.changeinpercent = changeinpercent;
	}
	public Double getchangeinpercent() {
		return changeinpercent;
	}
	public String getcompany() {
		return company;
	}
	public String toString() {
		return company + " " + changeinpercent;
	}
	public int compareTo(final Stock that) {
		if (this.getchangeinpercent() > that.getchangeinpercent()) {
			return -1;
		}
		if (this.getchangeinpercent() < that.getchangeinpercent()) {
			return 1;
		}
		if (this.getcompany().compareTo(that.getcompany()) < 0) {
			return 1;
		}
		if (this.getcompany().compareTo(that.getcompany()) > 0) {
			return -1;
		}
		return 0;
 	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberofcompanies = sc.nextInt();
		int count = 0;
		MaxPQ<Stock> maxpq = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < 6 * numberofcompanies; i++) {
			if (count < numberofcompanies) {
				String[] tokens = sc.nextLine().split(",");
				Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
				maxpq.insert(object);
				minpq.insert(object);
				count++;
			}
			else if (count == numberofcompanies) {
				for (int j = 0; j < 5; j++) {
					System.out.println(maxpq.delMax());
					System.out.println(minpq.delMin());
					count++;
				}
			}


			else if (count > numberofcompanies) {
				count = 0;
			}

		}
		// int query = sc.nextInt();
		// for (i = 0; i < query; i++) {
		// 	String[] info = sc.nextLine().split(",");

		// }


	}
}