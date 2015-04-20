// separate chain hash table implementation
// this implementation does not allow for duplicated key
//
public class MyHashTable {
    private int cap = 16;
    private int loadFactor = 0.75;
    private TableEntry[] entries;
    private int count = 0; // number of entry in hashmap
    
    private static class TableEntry {
        private String key;
        private int value;
        private TableEntry nextEntry;

        public TableEntry(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public TableEntry getNextEntry() {
            return nextEntry;
        }

        public void setNextEntry(TableEntry e) {
           nextEntry = e;
        } 
    }

    public MyHashTable() {
        value = new char[cap];
    }

    public MyHashTable(int cap) {
        this.cap = cap;
    }

    public boolean isEmpty() {
       return this.count == 0;
    }

    /** given a string as the key, return the index based on the hash
     * @param key: the key string
     * @return: index of the key in the table
     */
    public int getIndexFromKey(String key) {
        return key.hashCode() % this.cap;
    }

    /** associate the specified value with the specified key in this map
     * @param key: key string
     * @param value: int value
     * @return: value
     */
    public int put(String key, int value) {
        int initIndex = getIndexFromKey(key);
        initEntry = entries[initIndex];
        if (initEntry == null || initEntry.getKey() == key) {
            initEntry = new TableEntry(key, value);
            return value
        } else { // if the index is not empty
            while(true) {
                nextEntry = initEntry.getNextEntry();
                if (nextEntry == null || nextEntry.getKey() == key) {
                    initEntry.setNextEntry(new TableEntry(key, value));
                    break;
                }
                initEntry = nextEntry;
            }
        }            
    }
    
    /* return value for given key
     * @param: key string
     * @return: value
     */
    public int get(String key) {
        // TODO
        return null;
    }

    /* given a key, delete the entry and return its value
     * @param: key string
     * @return: value
     */
    public void pop(String key) {
        // TODO
        // 
    }

    /** return true if the map contains the specified key
     * @param key: key string
     * @return boolean
     */
    public boolean containsKey(String key) {
        // TODO
        return false;
    }
}
    



