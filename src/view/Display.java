/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;
import java.io.Serializable;
/**
 *
 * @author JohnReedLOL
 */
public class Display implements Serializable
{
    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("Display", 35);

    private static View current_view_;
    
    // Display.display_ is static because there is only one display_  
    private static Display display_;
    
    public static Display getaReferenceToTheDisplay() {
        return Display.display_;
    }
    
    public void generateCharacterCreationView() {
    	Display.current_view_ = new CharacterCreationView();
    }
    
    public void generateMapView(int x, int y) {
    	Display.current_view_ = new MapView(x, y);
    }
    
    public void generateStatsView() {
    	Display.current_view_ = new StatsView();
    }
    
    public void printView() {
    	char[][] toPrint = current_view_.getContents();
    }
}
