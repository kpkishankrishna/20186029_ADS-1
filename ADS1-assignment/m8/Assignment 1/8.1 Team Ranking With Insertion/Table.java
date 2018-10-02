/**
 * Class for Table.
 */
public class Table {
    /**
     *It's a default constructor.
     */
    public Table() {

    }
    /**
     *It's a insertion Sort function for an arraysof.
     *Here, the complexity is N^2 for big Oh.
     *Also, for Theta it is N^2.
     * @param      arraysof  The arraysof
     * @param      size   The size
     */
    public void Sort(Comparable[] arraysof, int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (more(arraysof, j, j - 1)) {
                    swap(arraysof, j, j - 1);
                }
            }
        }
    }
    /**
     *Helps to find lower value.
     *
     * @param      arr   The arr
     * @param      indiaone  The ind 1
     * @param      indiatwo  The ind 2
     *
     * @return     { description_of_the_return_value }
     */
    public boolean more(Comparable[] arr, int indiaone, int indiatwo) {
        return arr[indiaone].compareTo(arr[indiatwo]) > 0;
    }
    /**
     *It's Swaps the values in the arraysof.
     *
     * @param      a     Team arraysof
     * @param      indiaone  The ind 1
     * @param      indiatwo  The ind 2
     */
    public void swap(Comparable[] a, int indiaone, int indiatwo) {
        Comparable temp = a[indiaone];
        a[indiaone] = a[indiatwo];
        a[indiatwo] = temp;
    }
    /**
     *It finds the Leaderboard and returns leaderboard string.
     *
     * @param      arraysof  The arraysof
     * @param      size   The size
     *
     * @return     String with team names.
     */
    public String leaderboard(Comparable[] arraysof, int size) {
        Sort(arraysof, size);
        String s = "";
        for (int i = 0; i < size; i++) {
            s += arraysof[i].toString() + ",";
        }
        return s.substring(0, s.length() - 1);
    }
}