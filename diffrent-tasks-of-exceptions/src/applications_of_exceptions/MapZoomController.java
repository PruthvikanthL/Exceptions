package applications_of_exceptions;

import exceptions.InvalidZoomLevelException;

public class MapZoomController {
    int zoomLevel;
    final int MAX_ZOOM =100;
    public MapZoomController(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }
    public void applyZoom() {
        try {
            if (zoomLevel>MAX_ZOOM) {
                throw new InvalidZoomLevelException("Zoom level "+zoomLevel+"exceeds the maximum allowed("+ MAX_ZOOM+").");
            }
            System.out.println("Zoom level applied successfully: " + zoomLevel);
        } catch (InvalidZoomLevelException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Zoom processing complete.");
    }
}
