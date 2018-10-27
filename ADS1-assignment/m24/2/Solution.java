import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // Constructor.
    }
    /**
     * {Client Program}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearProbingHashST<String, String[]> hash;
        int lines = Integer.parseInt(scan.nextLine());
        hash = new LinearProbingHashST<String, String[]>();
        while (lines > 0) {
            String[] tokens = scan.nextLine().split(",");
            String[] value = new String[] {tokens[1], tokens[2]};
            hash.put(tokens[0], value);
            lines--;
        }
        int info = Integer.parseInt(scan.nextLine());
        while (info > 0) {
            String[] token = scan.nextLine().split(" ");
        }
    }
}