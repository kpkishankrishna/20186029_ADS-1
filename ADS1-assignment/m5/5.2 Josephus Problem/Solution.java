import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            Operations operation = new Operations();
            String joseph = sc.nextLine();
            String[] jose = joseph.split(" ");
            int k = Integer.parseInt(jose[0]);
            int m = Integer.parseInt(jose[1]);
            for (int j = 0; j < k; j++) {
                operation.insertAtTail(j);
            }
            int[] josephus = operation.josephus(m, k);
            for (int p = 0; p < josephus.length - 1; p++) {
                System.out.print(josephus[p] + " ");
            }
            System.out.println(josephus[josephus.length - 1]);
        }
    }
}