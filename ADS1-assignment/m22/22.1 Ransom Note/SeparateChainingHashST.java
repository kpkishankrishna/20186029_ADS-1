public class SeparateChainingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;                                // number of key-value pairs
    private int m;                                // hash table size
    private SequentialSearchST<Key, Value>[] st;  // array of linked-list symbol tables


    /**
     * Initializes an empty symbol table.
     */
    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }

    /**
     * Initializes an empty symbol table with {@code m} chains.
     * By the analysis the time complexity of the below method is O(N).
     * As the for loop iterates upto the length of the m.
     * @param m the initial number of chains
     */
    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m];
        for (int i = 0; i < m; i++)
            st[i] = new SequentialSearchST<Key, Value>();
    }

    // resize the hash table to have the given number of chains,
    // By the analysis the time complexity of the below method is O(N^2).
    // As the for loop iterates for the another for loop values i.e upto the
    // no.of keys present in it.
    // rehashing all of the keys
    private void resize(int chains) {
        SeparateChainingHashST<Key, Value> temp = new SeparateChainingHashST<Key, Value>(chains);
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }
        this.m  = temp.m;
        this.n  = temp.n;
        this.st = temp.st;
    }

    // hash value between 0 and m-1
    /*By the analysis the time complexity of the below method is O(1).
     * As the ecah statment executes once of this method.*/
    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * By the analysis the time complexity of the below method is O(1).
     * As the statment executes once of this method for every call.
     *
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }

    /**
     * Returns true if this symbol table is empty.
     * By the analysis the time complexity of the below method is O(1).
     * As the statment executes once of this method for every call.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns true if this symbol table contains the specified key.
     * By the analysis the time complexity of the below method is O(1).
     * As the statment executes once of this method for every call.
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key};
     *         {@code false} otherwise
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    /** By the analysis the time complexity of the below method is O(N).
     * As the method following uses the hash and the get method their
     * Returns the value associated with the specified key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with {@code key} in the symbol table;
     *         {@code null} if no such value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        int i = hash(key);
        return st[i].get(key);
    }

    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     * 
     * By the analysis the time complexity of the below method is O(N).
     * As the method following uses delete method their
     * complexities also added to it.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }

        // double table size if average length of list >= 10
        if (n >= 10 * m) resize(2 * m);

        int i = hash(key);
        if (!st[i].contains(key)) n++;
        st[i].put(key, val);
    }

    /**
     * Removes the specified key and its associated value from this symbol table
     * (if the key is in this symbol table).
     * By the analysis the time complexity of the below method is O(N).
     * As the method following uses hash,contains and method their
     * complexities also added to it.
     *
     * @param  key the key
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");

        int i = hash(key);
        if (st[i].contains(key)) n--;
        st[i].delete(key);

        // halve table size if average length of list <= 2
        if (m > INIT_CAPACITY && n <= 2 * m) resize(m / 2);
    }

    // return keys in symbol table as an Iterable
    /** By the analysis the time complexity of the below method is O(N).
     *  As the method following iterates upto the all keys present in it. */
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys())
                queue.enqueue(key);
        }
        return queue;
    }
}
