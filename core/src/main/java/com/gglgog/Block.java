package com.gglgog;

import java.util.List;
import java.util.ArrayList;

public class Block {

    // Основные поля
    public String name;
    public String id;
    public String texture;
    public String spawnText; // текст/число при спавне

    // Галочки
    public boolean isBreakable;           // [] Галочка "можно ломать"
    public boolean hasCrafting;           // [] Крафт
    public boolean canRotate;             // [] Можно поворачивать к игроку
    public boolean personalInventory;     // [] Личный инвентарь
    public boolean openInventory;         // [] Можно открыть инвентарь

    // Варианты
    public String destroySpeedMode;       // {true,false,custom}
    public double customDestroySpeed;     // если custom

    // Списки и текстовые поля
    public List<String> dropItems;        // [+] Добавление/список дропов
    public String description;            // __ текст/описание блока
    public String version;                // __ версия блока/предмета

    // Крафт
    public String[][] craftingGrid;       // 3x3 сетка крафта
    public boolean[][] craftingEnabled;   // флаг включено ли для слота

    // Инвентарь
    public Inventory inventory;

    public Block(String name, String id) {
        this.name = name;
        this.id = id;
        this.texture = "";
        this.spawnText = "1";

        this.isBreakable = true;
        this.hasCrafting = false;
        this.canRotate = false;
        this.personalInventory = false;
        this.openInventory = false;

        this.destroySpeedMode = "true";
        this.customDestroySpeed = 1.0;

        this.dropItems = new ArrayList<>();
        this.description = "";
        this.version = "1.21";

        this.craftingGrid = new String[3][3];
        this.craftingEnabled = new boolean[3][3];
        this.inventory = new Inventory(5);
    }

    // Метод для установки крафта
    public void setCrafting(String[][] grid, boolean[][] enabled) {
        this.craftingGrid = grid;
        this.craftingEnabled = enabled;
    }
}
