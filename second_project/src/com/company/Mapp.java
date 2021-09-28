package com.company;

public class Mapp<P, Q> {
    private final List<Pairs<P, Q>> list;
    private int length;

    final static class Pairs<P, Q>{
        P key;
        Q data;
        public Pairs(P key, Q data){
            this.key = key;
            this.data = data;
        }
        public Pairs(){
            this.key = null;
            this.data = null;
        }
    }
    public Mapp(){
        this.length = 0;
        this.list = null;
    }
    public Mapp(int size){
        this.length = size;
        this.list = new List<Pairs<P, Q>>(size);

    }
    public Object put(P key, Q value){
        Pairs<P, Q> pair = new Pairs<>(key, value);
        this.list.insert(pair);
        this.length++;
        return list;
    }

    /**
     *
     * @param key
     * @return
     */
    public Object get(P key){
        Pairs<P, Q> pair = new Pairs<>(key, null);
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        if(tmp == null){
            return null;
        }
        for (int i = 0; i < this.length; i++){
            if (tmp.data.key == key){return tmp.data.data;}
            tmp = tmp.next;
        }
        return null;
    }
    public Object get(P key, P def){
        Object getter = get(key);
        if (getter == null){
            return def;
        }
        return getter;
    }
    public Object remove(P key){
        Pairs<P, Q> pair = new Pairs<>(key, null);
        int index = this.list.getIndexByelem(pair);
        if (index == -1){
            return null; // no found key
        }
        this.length--;
        return this.list.deleteIndex(index, list);
    }
    public boolean keyContains(P key){
        Object tmp = this.get(key);
        return key != null;
    }
    public List<P> getKeys(){
        List<P> list = new List<>();
        if (this.list == null || this.list.head == null){
            return null;
        }
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data.key);
            tmp = tmp.next;
        }
        return list;
    }
    public List<Q> getValues() {
        if (this.list == null || this.list.head == null){
            return null;
        }
        List<Q> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data.data);
            tmp = tmp.next;
        }
        return list;
    }
    public List<Pairs<P, Q>> getEntries() {
        if (this.list == null || this.list.head == null){
            return null;
        }
        List<Pairs<P, Q>> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data);
            tmp = tmp.next;
        }
        return list;
    }
    public int size(){return this.length;}
    public boolean isEmpty(){ return this.length > 0;}
}
