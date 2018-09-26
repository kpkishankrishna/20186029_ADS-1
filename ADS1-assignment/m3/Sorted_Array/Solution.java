import java.util.Scanner;
/**.
MergeSort the slass
*/
class MergeSort {
/**.
@MergeSort() the constructor
*/
    MergeSort() {

    }
/**.
@param array1 the array
@param array2 the array
*/
    public void merger(final int[] array1, final int[] array2) {
    int i = 0, j = 0, k = 0;
    int p;
    int[] e = new int[array1.length + array2.length];

    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            e[k++] = array1[i++];
        } else {
            e[k++] = array2[j++];
        }
    }
    while (i < array1.length) {
        e[k++] = array1[i++];
    }
    while (j < array2.length) {
        e[k++] = array2[j++];
    }
    while (array1.length == 0) {
        for (p = 0; p < array1.length; p++) {
        System.out.print(array1[p] + ",");
    }
    System.out.print(array1[p]);

    }
    for (p = 0; p < k - 1; p++) {
        System.out.print(e[p] + ",");
    }
    System.out.print(e[p]);
    }
}
/**.
Solution the class
*/
final class Solution {
/**.
@Solution the constructor for the solution class
*/
    private Solution() {
    }
/**.
@param array the arguments
*/
    public static void main(final String[] array) {
        MergeSort two = new MergeSort();
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int size2 = s.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int i = 0;
        int j = 0;
        s.nextLine();
        String[] firstarr = s.nextLine().split(",");
        String[] secondarr = s.nextLine().split(",");
        if (array1.length == 0) {
            for (String str2 : secondarr) {
                array2[j++] = Integer.parseInt(str2);
            }
            int h;
            for (h = 0; h < size2 - 1; h++) {
                System.out.print(array2[h] + ",");
            }
            System.out.print(array2[h]);
        } else {
            for (String str1 : firstarr) {
                array1[i++] = Integer.parseInt(str1);
        }
            for (String str2 : secondarr) {
                array2[j++] = Integer.parseInt(str2);
        }
            two.merger(array1, array2);
        }
}
}



