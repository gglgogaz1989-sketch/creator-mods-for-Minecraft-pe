package com.gglgog;

import java.util.List;

public class Block {
    public String name;
    public String id;
    public String texture;
    public double hardness;
    public boolean canBreak;
    public boolean canPlace;
    public List<String> dropItems;
    public Inventory inventory; // бонус: инвентарь блока
    public String spawnText;    // текст/число при спавне

    public Block(String name, String id, String texture, double hardness, boolean canBreak, boolean canPlace, List<String> dropItems) {
        this.name = name;
        this.id = id;
        this.texture = texture;
        this.hardness = hardness;
        this.canBreak = canBreak;
        this.canPlace = canPlace;
        this.dropItems = dropItems;
        this.inventory = new Inventory(5); // стандартный инвентарь 5 слотов
        this.spawnText = "";
    }
}
