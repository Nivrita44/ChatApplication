/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import chatapplication.swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args){
        try{
            BufferedImage image = ImageIO.read(new File(""));
            String blurhashStr = BlurHash.encode(image);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
