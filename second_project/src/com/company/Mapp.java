package com.company;

public class Mapp<P, Q> {
    private List<Pairs<P, Q>> list;
    private int length;

    final static class Pairs<P, Q> {
        P key;
        Q value;

        public Pairs(P key, Q data) {
            this.key = key;
            this.value = data;
        }

        /**
         * empty constructor
         */
        public Pairs() {
            this.key = null;
            this.value = null;
        }
    }

    /**
     * empty constructor
     */
    public Mapp() {
        this.length = 0;
        this.list = null;
    }

    /**
     * @param size - length of list
     */
    public Mapp(int size) {
        if (size <= 0) {
            this.length = size;
            this.list = new List<>(size);
        } else {
            this.length = 0;
            this.list = null;
        }
    }

    /**
     * @param key   - key of element
     * @param value - data of element
     * @return
     */
    public void put(P key, Q value) {
        if (this.list == null || this.list.head == null) {
            this.list = new List<>();
            Pairs<P, Q> pair = new Pairs<>(key, value);
            this.list.insert(pair);
        } else {
            Pairs<P, Q> pair = new Pairs<>(key, value);
            this.list.insert(pair);
        }
        this.length++;
    }

    /**
     * @param key - key of element in map
     * @return value of elem by key
     */
    public Object get(P key) {
        if (this.list == null || this.list.head == null) {
            return null;
        }
//        Pairs<P, Q> pair = new Pairs<>(key, null);
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++) {
            if (tmp.data.key == key) {
                return tmp.data.value;
            }
            tmp = tmp.next;
        }
        return null;
    }

    /**
     * @param key - key of element in map
     * @param def - the default value, which is given by the second parameter.
     * @return
     */
    public Object get(P key, P def) {
        Object getter = get(key);
        if (getter == null) {
            return def;
        }
        return getter;
    }

    /**
     * @param key - key of map
     * @return null if list is empty
     */
    public void remove(P key) {
        Pairs<P, Q> pair = new Pairs<>(key, null);
        if (this.list == null || this.list.head == null) {
            System.out.println("List is empty");
            return;
        }
        int index = this.list.getIndexByelem(pair);
        if (index == -1) {
            return; // no found key
        }
        this.length--;
        this.list.deleteIndex(index);
    }

    /**
     * @param key - key in map
     * @return true if key contain in map, false if key doesnt contain in map
     */
    public boolean keyContains(P key) {
        Object tmp = this.get(key);
        return tmp != null;
    }

    /**
     * @return list of keys of map
     */
    public List<P> getKeys() {
        if (this.list == null || this.list.head == null) {
            return null;
        }
        List<P> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++) {
            list.insert(tmp.data.key);
            tmp = tmp.next;
        }
        return list;
    }

    /**
     * @return list of values of map
     */
    public List<Q> getValues() {
        if (this.list == null || this.list.head == null) {
            return null;
        }
        List<Q> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++) {
            list.insert(tmp.data.value);
            tmp = tmp.next;
        }
        return list;
    }

    /**
     * @return list of pairs: key, value
     */
    public List<Pairs<P, Q>> getEntries() {
        if (this.list == null || this.list.head == null) {
            return null;
        }
        List<Pairs<P, Q>> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++) {
            list.insert(tmp.data);
            tmp = tmp.next;
        }
        return list;
    }

    /**
     * @return size of map(coubnt of element)
     */
    public int size() {
        return this.length;
    }

    /**
     * @return true - if size of map > 0
     * false - if size of map <= 0
     */
    public boolean isEmpty() {
        return this.length > 0;
    }
}
