/**
 * class Search.
 **/
class Search {
    /**
     * String arrays of keys.
     */
    private String[] keys;
    /**
     * int array of values.
     */
    private int[] values;
    /**
     * declaring the size.
     */
    private int size = 0;
    /**
     * Search constructor.
     * @param length int.
     */
    Search(int length) {
        keys = new String[length];
        values = new int[length];
    }
    /**
     * it returns the rank of the object.
     * @param key String.
     * @return values.
     * complexity N.
     */
    public int rank(final String key) {
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (keys[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (keys[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }
    /**
     * It is used to insert the element.
     * @param key String.
     * @param value int.
     *  complexity N.
     */
    public void put(final String key, final int value) {
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            values[i] = value;
            return;
        }
        if (size == 0) {
            keys[size] = key;
            values[size] = value;
            size++;
            return;
        }
        for (int j = size; j > i; j--) {
            values[j] = values[j - 1];
            keys[j] = keys[j - 1];
        }
        values[i] = value;
        keys[i] = key;
        size++;
    }
    /**
     * Checks if the item is present or not.
     * @param key String.
     * @return true or false.
     *  complexity 1.
     */
    public boolean contains(final String key) {
        int i = rank(key);
        return keys[i].equals(key);
    }
    /**
     * It gives the output as the value associated with the key.
     * Or if there is no value then it will return the nearest element,
     * which is less than the given input
     * @param key String.
     * @return floor element.
     *  complexity 1.
     */
    public String floor(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return keys[i];
        } else if (i == 0) {
            return null;
        } else {
            return keys[i - 1];
        }
    }
    /**
     * This method gets the value of the given key.
     * @param key String.
     * @return value of the given key.
     *  complexity 1.
     */
    public String get(final String key) {
        int i = rank(key);
        if (keys[i].equals(key)) {
            return values[i] + "";
        } else {
            return null;
        }
    }
    /**
     * prints all the key value pairs.
     *  complexity N.
     */
    public void keys() {
        for (int i = 0; i < size; i++) {
            System.out.println(keys[i] + " " + values[i]);
        }
    }
    /**
     * This methods retuns the max element.
     * @return max element.
     *  complexity 1.
     */
    public String max() {
        return keys[size - 1];
    }
    /**
     * This method is used to delete the minimum element.
     *  complexity N.
     */
    public void deleteMin() {
        for (int j = 0; j < size - 1; j++) {
            keys[j] = keys[j + 1];
            values[j] = values[j + 1];
        }
        keys[size] = null;
        values[size] = 0;
        size--;
    }
}