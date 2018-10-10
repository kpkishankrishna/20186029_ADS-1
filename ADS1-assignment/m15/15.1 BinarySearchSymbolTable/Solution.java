import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
    /**
     * default constructor.
     */
    private Solution() {

    }
    /**
     * Main method.
     * @param args String.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        Search searchtable = new Search(array.length);
        for (int i = 0; i < array.length; i++) {
            searchtable.put(array[i], i);
        }
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            switch (input[0]) {
            case "max":
                System.out.println(searchtable.max());
                break;
            case "floor":
                System.out.println(searchtable.floor(input[1]));
                break;
            case "contains":
                System.out.println(searchtable.contains(input[1]));
                break;
            case "get":
                System.out.println(searchtable.get(input[1]));
                break;
            case "keys":
                searchtable.keys();
                break;
            case "rank":
                System.out.println(searchtable.rank(input[1]));
                break;
            case "deleteMin":
                searchtable.deleteMin();
                break;
            default:
                break;
            }
        }
    }
}
