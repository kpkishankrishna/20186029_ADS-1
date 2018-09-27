import java.util.Scanner;
/**
 * Class for linked liststack.
 */
class LinkedListstack {
	private Node first = null;
	private class Node {
		char item;
		Node nextAddress;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public char top() {
		return first.item;
	}
	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */


	public boolean isEmpty() {
		return first == null;
	}
	/**
	 * { function_description }
	 *
	 * @param      item  The item
	 */
	public void push(char item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.nextAddress = oldfirst;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public char pop() {
		char item = first.item;
		first = first.nextAddress;
		return item;
	}
}
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			String line = sc.next();
			if (Paranthesis(line)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
	/**
	 * { function_description }
	 *
	 * @param      s     { parameter_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public static boolean Paranthesis(String s) {
		LinkedListstack object = new LinkedListstack();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				object.push(ch);
			} else {
				if (object.isEmpty()) return false;
				if (ch == ')' && object.top() == '(') {
					object.pop();
				} else if (ch == '}' && object.top() == '{') {
					object.pop();
				} else if (ch == ']' && object.top() == '[') {
					object.pop();
				} else return false;
			}

		}
		return object.isEmpty();
	}
}
