import java.util.Scanner;
/**
 *
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        LinkedList object = new LinkedList();
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String lines = s.nextLine();
            String[] tokens = tokens.split(" ");
            switch(tokens[0]) {
                case "insertAt" :
                object.insertAt(Integer.parseInt(tokens[1]), tokens[2]);
                System.out.println(object);
                break;
                case "reverse" :
                object.reverse();
                System.out.println(object);
                break;
                default :
                break;

            }
            
        }
    }
}