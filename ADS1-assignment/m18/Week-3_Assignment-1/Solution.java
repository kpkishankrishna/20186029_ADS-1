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
		MaxPQ<Stock> maxpq1 = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq1 = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < numberofcompanies; i++) {
			String[] tokens = sc.nextLine().split(",");
			Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			maxpq1.insert(object);
			minpq1.insert(object);
			count++;
		}
		System.out.println(maxpq1.delMax());
		System.out.println(minpq1.delMin());
		MaxPQ<Stock> maxpq2 = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq2 = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < numberofcompanies; i++) {
			String[] tokens = sc.nextLine().split(",");
			Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			maxpq1.insert(object);
			minpq1.insert(object);
			count++;
		}
		System.out.println(maxpq2.delMax());
		System.out.println(minpq2.delMin());
		MaxPQ<Stock> maxpq3 = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq3 = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < numberofcompanies; i++) {
			String[] tokens = sc.nextLine().split(",");
			Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			maxpq3.insert(object);
			minpq3.insert(object);
			count++;
		}
		System.out.println(maxpq3.delMax());
		System.out.println(minpq3.delMin());
		MaxPQ<Stock> maxpq4 = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq4 = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < numberofcompanies; i++) {
			String[] tokens = sc.nextLine().split(",");
			Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			maxpq4.insert(object);
			minpq4.insert(object);
			count++;
		}
		System.out.println(maxpq4.delMax());
		System.out.println(minpq4.delMin());
		MaxPQ<Stock> maxpq5 = new MaxPQ<Stock>(numberofcompanies);
		MinPQ<Stock> minpq5 = new MinPQ<Stock>(numberofcompanies); 
		for (int i = 0; i < numberofcompanies; i++) {
			String[] tokens = sc.nextLine().split(",");
			Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
			maxpq5.insert(object);
			minpq5.insert(object);
			count++;
		}
		System.out.println(maxpq5.delMax());
		System.out.println(minpq5.delMin());
		// MaxPQ<Stock> maxpq1 = new MaxPQ<Stock>(numberofcompanies);
		// MinPQ<Stock> minpq1 = new MinPQ<Stock>(numberofcompanies); 
		// for (int i = 0; i < numberofcompanies; i++) {
		// 	String[] tokens = sc.nextLine().split(",");
		// 	Stock object = new Stock(tokens[0], Double.parseDouble(tokens[1]));
		// 	maxpq1.insert(object);
		// 	minpq1.insert(object);
		// 	count++;
		// 	System.out.println(maxpq.delMax());
		// 	System.out.println(minpq.delMin());
		// }
		// System.out.println(maxpq.delMax());
		// System.out.println(minpq.delMin());





		// int query = sc.nextInt();
		// for (i = 0; i < query; i++) {
		// 	String[] info = sc.nextLine().split(",");

		// }


	}
}