class LinkedList {
    private int size = 0;

    private Node head = null;

    private Node tail = null;

    private class Node {

        private String key;
        private String value;
        private Node next;
    }
    public boolean isEmpty() {
        return head == null;
    }
    /**
     * complexity 1.
     * @param element int.
     **/
    public void pushAtStart(final String key, final String value) {
        if (head == null) {
            head = new Node();
            head.key = key;
            head.value = value;
            head.next = null;
            tail = head;
        } else {
            Node oldfirst = head;
            head = new Node();
            head.key = key;
            head.value = value;
            head.next = oldfirst;
        }
        size++;
    }
     /**
     * complexity 1.
     * @param element int.
     **/
    public void pushAtEnd(final String key, final String value) {
        if (tail == null || head == null) {
        //     tail = new Node();
        //     tail.element = element;
        //     tail.next = null;
        //     head = tail;
            pushAtStart(key, value);
        }   else {
            Node temp = tail;
            tail = new Node();
            tail.key = key;
            tail.value = value;
            tail.next = null;
            temp.next = tail;
        }
        size++;
    }
     /**
     * complexity 1.
     * @param element int.
     **/
    public void popAtStart() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }
    public void popAtEnd() {
        if (tail != null) {
            Node temp = head;
            while (temp.next.next != null) {

                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public int top() {
        return head.key;
    }
    public int size() {
        return size;
    }
     /**
     * complexity N .
     * @param element int.
     **/
    public void displayAll() {
        if (size != 0) {
            String s = "";
            Node temp = head;
            while (temp != null) {
                s += temp.element + ", ";
                temp = temp.next;
            }
            // if(size == 1){
            //     System.out.println(s);
            // }
            System.out.println(s.substring(0, s.length() - 2));
        }
        else{
        System.out.println("Steque is empty.");
    }
    }
}