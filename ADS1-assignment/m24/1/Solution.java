import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
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
            switch (token[0]) {
            // case "put":
                // hash.put(tokens[1], Integer.parseInt(tokens[2]));
                // break;
            case "get":
                // System.out.println(Arrays.toString(hash.get(token[1])));
                // String ans = Arrays.toString(hash.get(token[1]));
                // String[] answer = ans.split(",");
                try {
                    if (Integer.parseInt(token[2]) == 1) {
                    System.out.println(hash.get(token[1])[0]);
                    }
                    else if (Integer.parseInt(token[2]) == 2) {
                        System.out.println(hash.get(token[1])[1]);
                    }
                } catch(NullPointerException e) 
                { 
                    System.out.println("Student doesn't exists..."); 
                } 

                
                
                break;
            // case "delete":
            //     hash.delete(tokens[1]);
            //     break;
            }
            // System.out.println("gbvjgnj");
            info--;

        }
        
    }
}