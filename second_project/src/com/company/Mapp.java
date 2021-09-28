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
        this.list.insert(pair,list);
        this.length++;
        return list;
    }
    public Object get(P key){
        Pairs<P, Q> pair = new Pairs<>(key, null);
        List.Node<Pairs<P, Q>> tmp = this.list.head;
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
        int index = this.list.getIndexbyelem(pair,list);
        if (index == -1){
            return null;
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
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data.key, list);
            tmp = tmp.next;
        }
        return list;
    }
    public List<Q> getValues() {
        List<Q> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data.data, list);
            tmp = tmp.next;
        }
        return list;
    }
    public List<Pairs<P, Q>> getEntries() {
        List<Pairs<P, Q>> list = new List<>();
        List.Node<Pairs<P, Q>> tmp = this.list.head;
        for (int i = 0; i < this.length; i++){
            list.insert(tmp.data, list);
            tmp = tmp.next;
        }
        return list;
    }
    public int size(){return this.length;}
    public boolean isEmpty(){ return this.length > 0;}
}
