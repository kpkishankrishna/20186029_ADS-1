import java.util.Scanner;
import java.util.Arrays;
/**.
Solution the class
*/
final class Solution {
/**.
@Solution() the constructor
*/
private Solution() {
}
/**.
@param args the arguments
*/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum object = new Sum();
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        object.counntof(array);
    }
}
/**.
Sum the class
*/
class Sum {
/**.
@sum() the constructor
*/
    Sum() { }
/**.
@counntof() the function
@param array the array
*/
    public void counntof(final int[] array) {
        int count = 0;
        Arrays.sort(array);
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int num = 0;
            for (int j = i + 1; j < size; j++) {
                num = -1 * (array[i] + array[j]);
                    if (binarySearch(array, num, j + 1) != -1) {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
/**.
@binarySearch() the function
@return return the index
@param array the array
@param number the num passed
@param index the index
*/
public static int binarySearch(final int[] array, final int number,
 final int index) {
         int hi = array.length - 1;
        int lo = index;
         while (lo <= hi) {
         int centre = lo + (hi - lo) / 2;
         if (number < array[centre]) {
            hi = centre - 1;
         } else if (number > array[centre]) {
            lo = centre + 1;
        } else {
        return centre;
        }
    }
    return -1;
    }
}




