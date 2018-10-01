import java.util.Scanner;
/**
 * Solution class contains main method.
 */
final class Solution {
    /**
     * default private constructor.
     */
    private Solution() { }
    /**
     * main method.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            LinkedList object = new LinkedList();
            while (sc.hasNextLine()) {
                String string = sc.nextLine();
                if (string.equals("")) {
                    System.out.println("");
                    break;
                } else {
                    String[] tokens = string.split(" ");
                    switch (tokens[0]) {
                    case "push":
                        object.pushAtStart(Integer.parseInt(tokens[1]));
                        object.displayAll();
                        //System.out.println(object.displayAll());
                        break;
                    case "pop":
                        object.popAtStart();
                        object.displayAll();
                        //System.out.println(object.displayAll());
                        break;
                    case "enqueue":
                        object.pushAtEnd(Integer.parseInt(tokens[1]));
                        object.displayAll();
                        //System.out.println(object.displayAll());
                        break;
                    default:
                        break;
                    }
                    // if(tokens[0].equals("")){
                    //     System.out.println();
                    //     break;
                    // }
                }

            }
        }
    }
}