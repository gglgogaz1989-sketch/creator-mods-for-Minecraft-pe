package com.gglgog;

import java.io.*;

public class ModExporter {

    public static void export(MinecraftMod mod){

        try{
            new File("output/textures").mkdirs();

            FileWriter w=new FileWriter("output/mod.json");
            w.write(mod.json());
            w.close();

            System.out.println("MOD EXPORTED!");
        }catch(Exception e){e.printStackTrace();}
    }
}
