package com.gglgog;

import java.util.*;

public class Inventory {
    public List<String> items=new ArrayList<>();
    public int slots;

    public Inventory(int s){slots=s;}

    public void add(String id){
        if(items.size()<slots) items.add(id);
    }
}
