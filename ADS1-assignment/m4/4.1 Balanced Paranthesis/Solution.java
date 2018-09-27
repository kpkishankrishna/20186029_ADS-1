import java.util.Scanner;
class LinkedListstack {
	private Node first = null;
	private class Node {
		char item;
		Node nextAddress;
	}
	public char top() {
		return first.item;
	}


	public boolean isEmpty() {
		return first == null;
	}
	public void push(char item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.nextAddress = oldfirst;
	}
	public char pop() {
		char item = first.item;
		first = first.nextAddress;
		return item;
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			String line = sc.next();
			if(Paranthesis(line)){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
	public static boolean Paranthesis(String s) {
		LinkedListstack object = new LinkedListstack();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				object.push(ch);
			}
			else {
				if(object.isEmpty()) return false;
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
