class MyHashMap {
    int[] keys;
    int[] vals;
    public MyHashMap() {
        keys = new int[1000001];
        vals = new int[1000001];
    }
    
    public void put(int key, int value) {
        keys[key] = 1;
        vals[key] = value;
    }
    
    public int get(int key) {
        if (keys[key] == 0) {
            return -1;
        }
        return vals[key];
    }
    
    public void remove(int key) {
        keys[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */