/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.view;

import src.model.MapModel;

/**
 * Players see the MapView while they are interacting with the map
 * @author JohnReedLOL
 */
final class MapView extends View
{

    // Converts the class name into a base 35 number
    private static final long serialVersionUID = Long.parseLong("MapView", 35);
	
    private static final MapModel map_model_reference_ = MapModel.getaReferenceToTheMapModel();
    
    /*
     * Generates a new MapView from the map using coordinates x and y.
     */
    public MapView(int x, int y) {
    	
    }
}
