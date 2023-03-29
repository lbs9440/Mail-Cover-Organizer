 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author spitz
 */
public class CreateJSONFile {
    
    public MailCoverOrganizer mco;
    
    public static void main(String[] args, MailCoverOrganizer mco){
        
        JSONObject obj = new JSONObject();
        
        /*
        obj.put("title", mco.allCovers.get(0).title);
        obj.put("category", mco.allCovers.get(0).category);
        obj.put("location", mco.allCovers.get(0).location);
        obj.put("date", mco.allCovers.get(0).date);
        obj.put("description", mco.allCovers.get(0).description);
        obj.put("image", mco.allCovers.get(0).image);
        */
        
        obj.put("title", "Landon");
        obj.put("category", "Earthquake");
        obj.put("location", "Baltimore");
        obj.put("date", "2003");
        obj.put("description", "This is me");
        obj.put("image", "Image link");
        
        JSONArray list = new JSONArray();
        list.add("Covers");
        
        try(FileWriter file = new FileWriter("myJSON.json"))
        {
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(obj);
    }
    
}
