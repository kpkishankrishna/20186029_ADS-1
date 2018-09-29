import java.util.Scanner;
import java.math.BigInteger;
class LinkedList {
    /**
     * Node start.
     */
    private Node start = null;
    private int size = 0;
    /**
     * class node.
     */
    class Node {
        /**
         * String item.
         */
        private String item;
        /**
         * Node next.
         */
        private Node next;
        /**
         * returns item.
         * @return node.
         */
        public String getItem() {
            return this.item;
        }
    }
    /**
     * stack is empty or not.
     * @return true or false.
     */
    public boolean isEmpty() {
        return start == null;
    }
    /**
     * push method.
     * @param item element to push.
     */
    public void push(final String item) {
        Node prev = start;
        start = new Node();
        start.item = item;
        start.next = prev;
        size++;
    }
    /**
     * pop method.
     * @return the poped element.
     */
    public String pop() {
        String item = start.item;
        start = start.next;
        size--;
        return item;
    }
    public int size() {
    	return size;
    }
    /**
     * top node.
     * @return first or top Node.
     */
    public Node getStart() {
        return start;
    }
}
class AddLargeNumbers { 
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList obj = new LinkedList();
    	String[] a = new String[]{number};
    	for (int i = 0; i < a.length; i++) {
    		obj.push(a[i]);
    	}
    	return obj;
    	

    }

    public static String digitsToNumber(LinkedList list) {
    	String number = "";
        for (int i = 0; i< list.size(); i++) {
        	number += list.pop();           
        }
        return number;

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList obj = new LinkedList();
    	String number1 = "";
    	String number2 = "";
    	String sum = "";
    	// BigInteger a = 0;
    	// BigInteger b = 0;
    	// BigInteger c = 0;
        for (int i = 0; i< list1.size(); i++) {
        	number1 += list1.pop();        	           
        }
        BigInteger first  = new BigInteger(number1);

        for (int i = 0; i< list2.size(); i++) {
        	number2 += list2.pop();         
        }
        BigInteger second = new BigInteger(number2);
        // c = a+b;
        BigInteger sum1 = first.add(second);
        sum = sum1.toString();
        obj.push(sum);
        return obj;     



    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
