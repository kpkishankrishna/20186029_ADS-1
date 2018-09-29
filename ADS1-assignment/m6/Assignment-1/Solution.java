import java.util.Scanner;
class LinkedList {
    /**
     * Node start.
     */
    private Node start = null;
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
    }
    /**
     * pop method.
     * @return the poped element.
     */
    public String pop() {
        String item = start.item;
        start = start.next;
        return item;
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
    	obj.push(number);
    	return obj;
    	

    }

    public static String digitsToNumber(LinkedList list) {
    	return list.pop();

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	return null;

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
