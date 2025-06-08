package applications_of_exceptions;

public class ImageResizer {
    int width;
    int height;
    public ImageResizer(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void resize(){
        try{
            if(width<0||height<0){
                throw new IllegalArgumentException("Width and height must be non-negative");
            }
            System.out.println("Resizing the image width"+width+"X"+height);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error:"+e.toString());
        }
        System.out.println("End of Image Resizing!..");
    }
}
