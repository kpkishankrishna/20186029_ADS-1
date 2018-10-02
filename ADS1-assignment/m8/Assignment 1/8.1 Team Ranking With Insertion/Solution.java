import java.util.Scanner;
/**.
 * Class for Solution.
 */
public final class Solution {
    /**.
     * Magic Number (check style).
     */
    private static final int TEN = 10;
    /**.
     * Magic Number (check style).
     */
    private static final int THREE = 3;
    /**
     * Constructs the object.
     */
    private Solution() {
    }
/**
 * Main function to handle test cases and deliver required output.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {
        Team[] teamsofcricket = new Team[TEN];
        int length = 0;
        Scanner scan = new Scanner(System.in);
        Table table = new Table();
        while (scan.hasNext()) {
            String[] array = scan.nextLine().split(",");
            teamsofcricket[length++] = new Team(array[0], Integer.parseInt(array[1]),
                     Integer.parseInt(array[2]), Integer.parseInt(array[THREE]));
        }
        System.out.println(table.leaderboard(teamsofcricket, length));
    }
}
