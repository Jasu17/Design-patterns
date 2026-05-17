package co.edu.designpatterns.Decorator;

/**
 *
 * @author jasu17
 */
public class CompressionDecorator extends FileDecorator {
    
    public CompressionDecorator(FileComponent file){
        super(file);
    }
    
    @Override
    public String getDescription(){
        return file.getDescription() + " + Compression";
    }
    
    @Override
    public int getSize(){
        return file.getSize() - 30;
    }
}
