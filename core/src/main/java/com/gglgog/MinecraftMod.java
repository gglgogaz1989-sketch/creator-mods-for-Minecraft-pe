package com.gglgog;

import java.util.*;
import com.google.gson.Gson;

public class MinecraftMod {

    public String name,author,version;
    public List<Block> blocks=new ArrayList<>();
    public List<Item> items=new ArrayList<>();

    public MinecraftMod(String n,String a,String v){
        name=n;author=a;version=v;
    }

    public void addBlock(Block b){blocks.add(b);}
    public void addItem(Item i){items.add(i);}

    public String json(){
        return new Gson().toJson(this);
    }
}
