package com.gglgog;

import java.util.List;
import java.util.ArrayList;

public class Item {
    public String name;
    public String id;
    public String texture;
    public String spawnText;
    public boolean isCraftable;
    public CraftingRecipe craftRecipe;
    public String model3D;

    // Галочки
    public boolean canBreak;      // можно ломать
    public boolean hasInventory;  // [] Инвентарь
    public boolean personalInv;   // [] Личный

    // Списки
    public List<String> dropItems;

    public Item(String name, String id, boolean isCraftable) {
        this.name = name;
        this.id = id;
        this.texture = "";
        this.spawnText = "1";
        this.isCraftable = isCraftable;
        this.craftRecipe = null;
        this.model3D = "";

        this.canBreak = true;
        this.hasInventory = false;
        this.personalInv = false;
        this.dropItems = new ArrayList<>();
    }
}
