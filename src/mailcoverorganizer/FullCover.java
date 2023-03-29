/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author spitz
 */
public class FullCover {
    String title;
    String date;
    String category;
    ImageIcon image;
    String location;
    String description;
    
    public FullCover(String t, String da, String c, ImageIcon i, String l, String de){
        title = t;
        date = da;
        category = c;
        image = i;
        location = l;
        description = de;
    }
}
