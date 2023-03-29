/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailcoverorganizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author spitz
 */
public class MailCoverOrganizer {

    public MenuJFrame menuJFrame;
    public SearchResultsJFrame searchResultsJFrame;
    public SearchJFrame searchJFrame;
    public AddCoverJFrame addCoverJFrame;
    public CreateJSONFile createJSONFile;

    enum screen {
        MENU,
        RESULTS,
        SEARCH,
        ADD
    }

    screen currentScreen;

    int yay = 13;
    int amountCovers;
    int test = 0;
    
    /*boolean editing = false;
    previewJPanel editedPanel;
    */
    
    int panelToDelete = -1;
    int panelToEdit = -1;
    
    boolean editing = false;
    
    boolean nothingChecked = true;
    
    String lastFrame = "";
    
    ArrayList<FullCover> allCovers = new ArrayList<>();

    public MailCoverOrganizer() {
        menuJFrame = new MenuJFrame(this);
        searchResultsJFrame = new SearchResultsJFrame(this);
        searchJFrame = new SearchJFrame(this);
        addCoverJFrame = new AddCoverJFrame(this);
        menuJFrame.setVisible(true);
        searchResultsJFrame.setVisible(false);
        searchJFrame.setVisible(false);
        addCoverJFrame.setVisible(false);
        currentScreen = screen.MENU;
        System.out.println("Constructor Complete");
    }

    public void switchScreen(screen newScreen) {
        switch (currentScreen) {
            case MENU:
                System.out.println("Menu");
                menuJFrame.setVisible(false);
                break;
            case RESULTS:
                System.out.println("Results");
                searchResultsJFrame.setVisible(false);
                break;
            case SEARCH:
                System.out.println("Search");
                searchJFrame.setVisible(false);
                break;
            case ADD:
                System.out.println("Add");
                addCoverJFrame.setVisible(false);
                break;
        }
        currentScreen = newScreen;
        switch (newScreen) {
            case MENU:
                menuJFrame.setVisible(true);
                break;
            case RESULTS:
                searchResultsJFrame.setVisible(true);
                break;
            case SEARCH:
                searchJFrame.setVisible(true);
                break;
            case ADD:
                addCoverJFrame.setVisible(true);
                break;
        }
    }

    /*
    ------------------------------------------------------------------------------------------------
    
    For tomorrow's check off:
    base64 encoding makes file sizes roughly 33% larger than their original binary representations, 
    which means more data down the wire (this might be exceptionally painful on mobile networks)
    
    I don't know if that would be such a great idea, only thing is this program really shouldn't
    be that tolling to run in the first place, just a trade-off between performance and speed.
    
    Other options include:
    - Storing all images in an online database and referring to them by their URL
    - Saving the images to a file directory in the program, reference by their name
    - Store the filepath of each image in a string, just not feasable across different machines
    
    ------------------------------------------------------------------------------------------------
    
    All help with JSON Reader and Writer from Professor Saad on YouTube
    
    Links:
    https://www.youtube.com/watch?v=cFCgFlqF5kw&t=12s
    */
    public void writeJson() {
        ArrayList<JSONObject> coverArrayList = new ArrayList<>();
        ArrayList<JSONObject> completeCoverArrayList = new ArrayList<>();
        
        for (int i = 0; i < allCovers.size(); i++){
            
            coverArrayList.add(new JSONObject());
            completeCoverArrayList.add(new JSONObject());
            coverArrayList.get(i).put("category", allCovers.get(i).category);
            coverArrayList.get(i).put("location", allCovers.get(i).location);
            coverArrayList.get(i).put("date", allCovers.get(i).date);
            coverArrayList.get(i).put("description", allCovers.get(i).description);
            coverArrayList.get(i).put("image", allCovers.get(i).image.toString()); 
            coverArrayList.get(i).put("title", allCovers.get(i).title);
            
            completeCoverArrayList.get(i).put("cover", coverArrayList.get(i));
        }
        
        
        try(FileWriter file = new FileWriter("myJSON.json"))
        {

            file.write(completeCoverArrayList.toString());
            
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            menuJFrame.saveIncomplete();
        }
        System.out.println(completeCoverArrayList);
        menuJFrame.saveComplete();
        
     
    }
    
    public void readJSON(){
        
        JSONParser jsonP = new JSONParser();
        
        try(FileReader reader = new FileReader("myJSON.json")){
            Object obj = jsonP.parse(reader);
            JSONArray coverList = (JSONArray) obj;
            System.out.println(coverList);
            //Iterate over cover array
            coverList.forEach(cover -> parseCoverObj((JSONObject)cover));
        }
        catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        catch(ParseException e){e.printStackTrace();}
        catch(Exception e){e.printStackTrace();}
    }
        
        private void parseCoverObj(JSONObject cover){
        JSONObject coverObj = (JSONObject) cover.get("cover");
        //get cover date, image, description, location, category, title
        String date = (String) coverObj.get("date");
        String image = (String) coverObj.get("image");
        String description = (String) coverObj.get("description");
        String location = (String) coverObj.get("location");
        String category = (String) coverObj.get("category");
        String title = (String) coverObj.get("title");
        allCovers.add(new FullCover(title, date, category, new ImageIcon(image), location, description));
        searchResultsJFrame.addNewPanel();
        System.out.println("Year: " + date);
        System.out.println("Image: " + image);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new MailCoverOrganizer();
        // TODO code application logic here
    }

}
