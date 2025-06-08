package applications_of_exceptions;

public class FilenameParser {
    String filename;
    public FilenameParser(String filename){
        this.filename=filename;
    }
    public void extractExtension(){
        try{
            int dotindex=filename.lastIndexOf(".");
            if (dotindex==-1||dotindex==filename.length()-1){
                throw new StringIndexOutOfBoundsException("Filename does not contain a valid extension.");
            }
            String extension=filename.substring(dotindex+1);
            System.out.println("File Extension :"+extension);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Error: Malformed filename "+e.getMessage());
        }
        System.out.println("End of the file extension parsing");
    }
}
