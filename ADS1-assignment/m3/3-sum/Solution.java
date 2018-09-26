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
        Sum u = new Sum();
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        u.counntof(arr);
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
@param arr1 the array
*/
    public void counntof(final int[] arr1) {
        int count = 0;
        Arrays.sort(arr1);
        int size = arr1.length;
        for (int i = 0; i < size - 1; i++) {
            int num = 0;
            for (int j = i + 1; j < size; j++) {
                num = -1 * (arr1[i] + arr1[j]);
                    if (binarySearch(arr1, num, j + 1) != -1) {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
/**.
@binarySearch() the function
@return return the index
@param a the array
@param key the num passed
@param l the index
*/
public static int binarySearch(final int[] a, final int key, final int l) {
         int hi = a.length - 1;
        int lo = l;
         while (lo <= hi) {
         int mid = lo + (hi - lo) / 2;
         if (key < a[mid]) {
            hi = mid - 1;
         } else if (key > a[mid]) {
            lo = mid + 1;
        } else {
        return mid;
        }
    }
    return -1;
    }
}




