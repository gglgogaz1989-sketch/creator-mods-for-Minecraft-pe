package com.gglgog;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;

public class TextureGenerator {

    public static void gen(String id){

        try{
            BufferedImage img=new BufferedImage(16,16,BufferedImage.TYPE_INT_ARGB);
            Graphics2D g=img.createGraphics();

            switch(id){

                case "dirt":
                    g.setColor(new Color(130,80,30));
                    g.fillRect(0,0,16,16);
                break;

                case "stone":
                    g.setColor(Color.GRAY);
                    g.fillRect(0,0,16,16);
                break;

                case "cobblestone":
                    g.setColor(Color.GRAY);
                    g.fillRect(0,0,16,16);
                    g.setColor(Color.DARK_GRAY);
                    g.drawLine(0,8,16,8);
                break;

                case "oak_planks":
                    g.setColor(new Color(220,180,120));
                    g.fillRect(0,0,16,16);
                    g.setColor(new Color(170,130,90));
                    g.fillRect(0,4,16,2);
                break;

                case "oak_log":
                    g.setColor(new Color(90,50,20));
                    g.fillRect(0,0,16,16);
                    g.setColor(new Color(180,110,50));
                    g.fillRect(0,0,16,5);
                break;

                case "stick":
                    g.setColor(new Color(160,100,60));
                    g.fillRect(7,0,2,16);
                    g.fillRect(3,0,2,16);
                    g.fillRect(11,0,2,16);
                break;

                case "raw_iron":
                    g.setColor(new Color(170,170,160));
                    g.fillRect(0,0,16,16);
                    g.setColor(new Color(120,120,110));
                    g.fillRect(2,5,12,6);
                    g.fillRect(12,12,4,4);
                break;

                case "iron_ingot":
                    g.setColor(new Color(200,200,200));
                    g.fillRect(0,1,16,14);
                    g.setColor(Color.WHITE);
                    g.fillRect(0,2,16,13);
                break;
            }

            g.dispose();

            ImageIO.write(img,"png",new File("output/textures/"+id+".png"));

        }catch(Exception e){e.printStackTrace();}
    }
}
