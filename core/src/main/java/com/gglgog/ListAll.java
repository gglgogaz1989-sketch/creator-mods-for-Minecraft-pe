package com.gglgog;

import java.util.*;

public class ListAll {

    public static List<Block> blocks(){
        List<Block>b=new ArrayList<>();

        b.add(new Block("Dirt","dirt","dirt.png"));
        b.add(new Block("Stone","stone","stone.png"));
        b.add(new Block("Cobble","cobblestone","cobblestone.png"));
        b.add(new Block("Oak Planks","oak_planks","oak_planks.png"));
        b.add(new Block("Oak Log","oak_log","oak_log.png"));

        return b;
    }

    public static List<Item> items(){
        List<Item>i=new ArrayList<>();

        i.add(new Item("Stick","stick","stick.png"));
        i.add(new Item("Raw Iron","raw_iron","raw_iron.png"));
        i.add(new Item("Iron Ingot","iron_ingot","iron_ingot.png"));

        return i;
    }
}
