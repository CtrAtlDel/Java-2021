package com.company;

public class Mapp<P, Q> {
    private List<Pairs<P, Q>> list;
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
        return list;
    }
    public Object get(P key){
        Pairs<P, Q> pair = new Pairs<>(key, null);
        List.Node<Pairs<P, Q>> tmp = list.head;
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

    }

}
