package com.gglgog;

public class Item {
    public String name;
    public String id;
    public String texture;
    public boolean isCraftable;
    public CraftingRecipe craftRecipe;
    public String model3D;
    public String spawnText; // текст/число при спавне

    public Item(String name, String id, String texture, boolean isCraftable) {
        this.name = name;
        this.id = id;
        this.texture = texture;
        this.isCraftable = isCraftable;
        this.spawnText = "";
    }
}
