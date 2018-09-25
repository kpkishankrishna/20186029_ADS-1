public class Percolation {
    // create n-by-n grid, with all sites blocked
    private int[][] array;
    public Percolation(int n) {
        array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                int[i][j] = 0;
            }
        }

    }                
    // open site (row, col) if it is not open already
    public void open(int row, int col) {
        array[row][col] = 1;

    }
    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        return (array[row][col] == 1);

    }
    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        return (array[row][col] == 0);
    }
    // number of open sites
    public int numberOfOpenSites() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    count += 1;
                }
            }
        }
        return count;

    }     
    // does the system percolate?
    public boolean percolates() {

    }           
}