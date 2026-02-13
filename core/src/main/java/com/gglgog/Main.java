package com.gglgog;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MinecraftMod mod = new MinecraftMod("МойКастомныйМод","GGLGOG","Пример блока с галочками и вариантами","1.26");

        Block oakBlock = new Block("Oak Planks","oak_planks");

        // Настройки галочек
        oakBlock.isBreakable = true;
        oakBlock.hasCrafting = true;
        oakBlock.canRotate = true;
        oakBlock.personalInventory = true;
        oakBlock.openInventory = true;

        // Варианты разрушения
        oakBlock.destroySpeedMode = "custom";
        oakBlock.customDestroySpeed = 2.5;

        // Крафт 3x3
        String[][] grid = {
            {"stick","stick","stick"},
            {"oak_planks","oak_planks","oak_planks"},
            {"stick","stick","stick"}
        };
        boolean[][] enabled = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        oakBlock.setCrafting(grid, enabled);

        // Инвентарь блока
        oakBlock.inventory.addItem("stick");

        // Добавляем блок в мод
        mod.addBlock(oakBlock);

        // Экспорт мода
        ModExporter exporter = new ModExporter("./output");
        exporter.exportMod(mod);

        System.out.println("Мод с галочками и крафтом создан!");
    }
}
