package com.gglgog;

public class Main {

    public static void main(String[]args){

        MinecraftMod mod=new MinecraftMod("MyMod","GGLGOG","1.26");

        for(Block b:ListAll.blocks()){
            mod.addBlock(b);
            TextureGenerator.gen(b.id);
        }

        for(Item i:ListAll.items()){
            mod.addItem(i);
            TextureGenerator.gen(i.id);
        }

        ModExporter.export(mod);

        System.out.println("DONE!");
    }
}
